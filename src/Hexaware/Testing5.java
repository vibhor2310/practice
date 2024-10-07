package Hexaware;

public class Testing5 {
    int id ;
    String name ;

    public Testing5(int id,String name){
        // constructor for initializing the values
        // using this keyword , used to refer the current class object
        this.id =id;
        this.name =name;

    }
    public void get_info(){
//        printing the values or displaying it
        System.out.println("Student id is : "+this.id );
        System.out.println("Student name is : "+this.name);
    }

    public static void main(String[] args) {
        Testing5 obj1 = new Testing5(1,"Vibhor");
        Testing5 obj2 = new Testing5(2,"Amit");
        obj1.get_info();
        obj2.get_info();
    }
}
