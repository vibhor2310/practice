package Hexaware;

import java.sql.*;

public class Testing15 {
    private static final String url ="jdbc:mysql://localhost:3306/ECommerce";
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
            Statement st = conn.createStatement();

            String query = "SELECT * FROM Customers";

            ResultSet result = st.executeQuery(query);

//            while(result.next()){
//                int id = result.getInt("customerID");
//                String name = result.getString("name");
//                String email = result.getString("email");
//                String password = result.getString("password");
//                System.out.println("CustomerID: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("Email: "+email);
//                System.out.println("Password: "+password);
//                System.out.println("\n");
//            }

            while(result.next()){
                System.out.println(result.getInt(1)+" "+ result.getString(2));
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
