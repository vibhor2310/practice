package Hexaware;

public class Testing2 {

    // non - static variables
    int id =2;
    String name ="Vibhor";
    static String college = "AKGEC";

    public void get_info(){
        // non - static area
        System.out.println("Student id is : "+id);
        System.out.println("Student Name is : "+name);
        System.out.println("Student College is : "+college);

    }

    public static void main(String[] args) {
//        Testing2 obj = new Testing2();
//        obj.get_info();
        new Testing2().get_info();
    }
}
