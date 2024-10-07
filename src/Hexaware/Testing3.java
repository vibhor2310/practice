package Hexaware;

public class Testing3 {

    // non - static variable and non - initialized too
    int id ;
    String name;

    public void set_values(){
        // non - static area
        // initializing the values of non - static variables
        id =100;
        name ="Vibhor";

    }
    public void get_values(){
        // non static area
        System.out.println("Student id is : "+id);
        System.out.println("Student name is : "+name);

    }

    public static void main(String[] args) {
        // static area
        Testing3 obj = new Testing3();
        obj.set_values();
        obj.get_values();

    }
}
