package Hexaware;

import java.sql.*;
import java.util.Scanner;

public class Testing16 {

    private static final String url ="jdbc:mysql://localhost:3306/temp";
    private static final String username = "root";
    private static final String password = "vibhor23";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO Student(id,name)VALUES(?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            Scanner sc = new Scanner((System.in));
            System.out.println("Enter id");
            int id = sc.nextInt();
            System.out.println("Enter Name");
            String name = sc.next();
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);

            int rows = preparedStatement.executeUpdate();
            if(rows>0){
                System.out.println("Data Inserted");
            }
            else{
                System.out.println("Data Not Inserted");
            }



        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


}
