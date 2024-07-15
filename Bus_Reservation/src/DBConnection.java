import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
public class DBConnection {
   private static final String url="jdbc:mysql://localhost:3306/BusReservation";
   private static final String userName="root";
   private static final String password="Sureshresh76";

  public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }
}
