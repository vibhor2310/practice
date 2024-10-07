package Hexaware;

public class Testing4 {
    int id ;
    String name ;

    public Testing4(int x,String y){
        // constructor for initializing the values
        id =x;
        name =y;

    }
    public void get_info(){
//        printing the values or displaying it
        System.out.println("Student id is : "+id );
        System.out.println("Student name is : "+name);
    }

    public static void main(String[] args) {
        Testing4 obj1 = new Testing4(1,"Vibhor Sharma");
        Testing4 obj2 = new Testing4(2,"Amit");
        obj1.get_info();
        obj2.get_info();
    }






}
