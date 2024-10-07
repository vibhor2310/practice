package Hexaware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Testing17 {

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
            String query = "INSERT INTO Student(id,name)VALUES(?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            Scanner sc = new Scanner((System.in));
            while(true) {
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("want to enter more data(Y/N) ?");
                String choice = sc.next();

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.addBatch();
                if(choice.toUpperCase().equals("N")){
                    break;
                }

            }
            int[] arr = preparedStatement.executeBatch();



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}
