package Hexaware;

import java.util.SortedSet;
import java.util.TreeSet;

public class Testing10 {
    public static void main(String[] args) {
        // comparable interface by using compareTo in Student class;
        SortedSet<Student> st = new TreeSet<>();
        Student priyanshu = new Student(100,"priyanshu");
        Student krishna = new Student(898,"krishna");
        Student sakshi = new Student(78,"sakshi");
        st.add(priyanshu);
        st.add(krishna);
        st.add(sakshi);

        System.out.println(st);


    }
}
