package Hexaware;

import java.sql.*;
import java.util.Scanner;

public class Testing18 {
    private static final String url ="jdbc:mysql://localhost:3306/temp";
    private static final String username = "root";
    private static final String password = "vibhor23";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            Statement st = conn.createStatement();
            st.addBatch("UPDATE Vibhor SET balance = balance-100 WHERE acc_no=101");
            st.addBatch("UPDATE Amit SET balance = balance+100 WHERE acc_no=101");
            int[] x = st.executeBatch();
            if(x[0]>0&&x[1]>0){
                conn.commit();
                System.out.println("Funds transferred");
            }
            else{
                conn.rollback();
                System.out.println("Transaction failed");
            }


        } catch (SQLException e){
            System.out.println(e.getMessage());



        }
    }


}
