
import java.util.Scanner;

public class Bus_Demo {
    public static void main(String[] args)  {

        Scanner scanner=new Scanner(System.in);
        try{


          BusDAO.displayBusInfo();

        int user_input=1;
        while (user_input==1)
        {
            System.out.println("Enter 1 to book or 2 to exit:");
            user_input=scanner.nextInt();
            if(user_input==1) {
                Booking booking = new Booking();
                if (booking.isAvailable()) {
                    BookingDAO bookingDAO = new BookingDAO();
                    bookingDAO.addBooking(booking);
                    System.out.println("Booking is confirmed...........");
                } else {
                    System.out.println("Bus is full ...... please choose others buses....");
                }
            }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
