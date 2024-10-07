package Hexaware;

public class Testing {
    // non - static variables
    int id =23;
    String name="Vibhor";
    static String college = "AKGEC";
    public static void main(String[] args) {
    // static area - static variable memory allocated only once at the time of class loading
        Testing obj = new Testing();
        System.out.println("Student id is : "+obj.id);
        System.out.println("Student name is : "+obj.name );
        System.out.println("Student College is : "+college);
        System.out.println("Hello World");
        try{
            //code that may raise exception
            int data=100/0;
        }catch(ArithmeticException e)
        {System.out.println(e.getMessage());
        }
        //rest code of the program
        System.out.println("rest of the code...");

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

