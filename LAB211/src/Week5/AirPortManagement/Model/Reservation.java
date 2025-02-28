package Week5.AirPortManagement.Model;

import java.util.Date;

public class Reservation extends FlightInformation {

    private String bookingId;
    private String cusName;
    private String phoneNumber;
    private Date bookingDate;
    private String roomNumber;

    public Reservation(String flightNumber, String seatNumber, Date timePickup, String bookingId, String cusName, String phoneNumber, Date bookingDate, String roomNumber) {
        super(flightNumber, seatNumber, timePickup);
        this.bookingId = bookingId;
        this.cusName = cusName;
        this.phoneNumber = phoneNumber;
        this.bookingDate = bookingDate;
        this.roomNumber = roomNumber;
    }

    public Reservation() {
        super();
        this.bookingId = "";
        this.cusName = "";
        this.phoneNumber = "";
        this.bookingDate = null;
        this.roomNumber = "";
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }



    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Reservation{" + super.toString() +
                "bookingId='" + bookingId + '\'' +
                ", cusName='" + cusName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", bookingDate=" + bookingDate +
                ", roomNumber='" + roomNumber + '\'' +

                '}';
    }
}
