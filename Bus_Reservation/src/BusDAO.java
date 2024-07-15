import java.sql.*;

public class BusDAO {
   public static void displayBusInfo() throws SQLException {
        String query="select * from bus";

            Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);

            while (rs.next())
            {
                System.out.print("Bus No: "+rs.getInt(1)+", ");
                if(rs.getInt(2)==0)
                    System.out.print("AC: No,");
                else
                    System.out.print("AC: Yes,");
                System.out.print("Bus Capacity is: "+rs.getInt(3)+", ");
                System.out.println("Driver Name : "+rs.getString(4));
            }
       System.out.println("******************************* WELCOME ****************************************");


    }
    public static int getCapacity(int busNo) throws SQLException {

        String query="select capacity from bus where busNo="+busNo;
        Connection con=DBConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);

    }
}
