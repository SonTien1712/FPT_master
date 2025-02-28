package Week5.AirPortManagement.Controller;

import Week5.AirPortManagement.Model.Reservation;

import java.util.ArrayList;
import java.util.Date;

public class ReservationManagement
{
    private ArrayList<Reservation> reservationsList = new ArrayList<>();

    public ArrayList<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void addReservation(Reservation reservation)
    {
        reservationsList.add(reservation);
    }

    public Reservation searchById(String Id)
    {
        for(Reservation r : reservationsList)
        {
            if(r.getBookingId().matches(Id.toLowerCase()))
            {
                return r;
            }
        }
        return null;
    }

    public void deleteById(String Id)
    {
        reservationsList.removeIf(n->n.getBookingId().matches(Id.toLowerCase()));
    }

    public void displayAll()
    {
        for(Reservation r : reservationsList)
        {
            r.toString();
        }
    }

//    public void update(String bookingId, String cusName, String phoneNumber, Date bookingDate, String roomNumber)
//    {
//        Reservation temp = searchById(bookingId);
//temp = new Reservatio    }

    public void displayFlightInformation()
    {
        for (Reservation reservation : reservationsList)
        {
            reservation.
        }

    }









}
