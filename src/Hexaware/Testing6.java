package Hexaware;

public class Testing6 {
    int id;
    String name;

    public Testing6(int id,String name){
        // Parameterized Constructor
        // this set the values given in this
        this.id = id;
        this.name = name;
        // now finally calling the  function to display the values
        this.get_info();
    }

    public Testing6(){
        // default constructor
        // this constructor calls the parameterized one;
        this(2,"Vibhor");
        System.out.println("Default Constructor");
    }

    public void get_info(){
        System.out.println("Student id is : "+this.id);
        System.out.println("Student name is : "+this.name);
    }

    public static void main(String[] args) {
        // initializing the object with default constructor;
        Testing6 obj = new Testing6();
    }
}
