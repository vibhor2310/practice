package Hexaware;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i=0;i<n;i++){
          list.add(sc.nextInt());
      }

      for(Integer i:list){
          System.out.println("Number is "+i);
      }

        System.out.println(list);

    }
}






