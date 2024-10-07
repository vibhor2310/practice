package Hexaware;

import java.util.SortedSet;
import java.util.TreeSet;

public class Testing11 {
    public static void main(String[] args) {
        // Comparator interface by using compare;
        SortedSet<Student> st = new TreeSet<>(new StudentIdComparator());
        Student priyanshu = new Student(100,"priyanshu");
        Student krishna = new Student(898,"krishna");
        Student sakshi = new Student(78,"sakshi");
        st.add(priyanshu);
        st.add(krishna);
        st.add(sakshi);

        System.out.println(st);


    }
}
