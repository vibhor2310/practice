package Hexaware;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Testing8 {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            st.add(sc.nextInt());
        }

        System.out.println(st.contains(6));

    }
}
