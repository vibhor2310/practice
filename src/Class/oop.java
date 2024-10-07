package Class;

public class oop {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.Bark();
        d1.walk();
        d1.walk("Tomm");

    }
}

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+" is Walking");
    }
    // Method Overloading;
    void walk(String name){
        System.out.println(name+" is walking fastly");
    }

    void Bark(){
        System.out.println(name+" is barking");
    }
}
