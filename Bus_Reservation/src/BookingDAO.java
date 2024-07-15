import java.sql.*;
import java.util.Date;
public class BookingDAO {
    public static int getBookedCount(int busNo,Date date) throws SQLException {

         String query="select count(passengerName) from booking where bus_No=? and travel_date=?";
         Connection con=DBConnection.getConnection();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,busNo);
        java.sql.Date sqldate=new java.sql.Date(date.getTime());
        pst.setDate(2,sqldate);
        ResultSet rs=pst.executeQuery();
        rs.next();
        return rs.getInt(1);

    }

    public static void addBooking(Booking booking) throws SQLException {

        String query="insert into booking values(?,?,?,?,?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
        PreparedStatement pst=con.prepareStatement(query);

        pst.setInt(1,booking.busNo);
        pst.setString(2,booking.passengerName);
        pst.setString(3,booking.booking_number);
        pst.setInt(4,booking.age);
        pst.setLong(5,booking.mobileno);
        pst.setDate(6,sqldate);
        pst.setString(7,booking.startPlace);
        pst.setString(8,booking.endPlace);
        pst.setInt(9,booking.duration);
        pst.executeUpdate();


    }
}
