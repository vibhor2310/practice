package Hexaware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testing14 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Class loaded");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","vibhor23");

        System.out.println("Connection established");

        Statement st = conn.createStatement();
        int x = st.executeUpdate("DELETE FROM Cart WHERE customerID = 3");

        conn.close();
    }

}
