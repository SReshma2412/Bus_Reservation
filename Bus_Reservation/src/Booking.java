import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.SQLException;
public class Booking {
    String passengerName;
    int busNo;
    int age;
    long mobileno;
    Date date;
    String booking_number;
    String startPlace;
    String  endPlace;
    int duration;
    Booking()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the passenger name: ");
        passengerName=scanner.next();
        System.out.println("Enter the bus no: ");
        busNo=scanner.nextInt();
        System.out.println("Enter booking number: ");
        booking_number=scanner.next();
        System.out.println("Enter your age: ");
        age=scanner.nextInt();
        System.out.println("Enter your mobile no:");
        mobileno=scanner.nextLong();
        System.out.println("Enter the date dd-mm-yyyy");
        String dateInput=scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter the from place:");
        startPlace=scanner.next();
        System.out.println("Enter the destination place:");
        endPlace=scanner.next();
        System.out.println("Enter the duration");
        duration=scanner.nextInt();



    }

    public boolean isAvailable() throws SQLException {
        int capacity=0;
       BusDAO busdao=new BusDAO();
       BookingDAO bookingdao=new BookingDAO();
       capacity=busdao.getCapacity(busNo);

        int booked=0;
        booked=bookingdao.getBookedCount(busNo,date);

        return booked<capacity;
    }
}
