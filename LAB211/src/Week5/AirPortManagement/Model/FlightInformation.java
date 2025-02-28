package Week5.AirPortManagement.Model;

import java.util.Date;

public class FlightInformation {
    private String flightNumber;
    private String seatNumber;
    private Date timePickup;



    public FlightInformation(String flightNumber, String seatNumber, Date timePickup) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickup = timePickup;
    }

    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = "";
        this.timePickup = null;
    }

    @Override
    public String toString() {
        return "FlightInformation{" +
                "flightNumber='" + flightNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", timePickup=" + timePickup +
                '}';
    }
}
