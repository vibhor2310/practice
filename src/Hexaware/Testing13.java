package Hexaware;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Testing13 {
    public static void main(String[] args) {

        SortedMap<Integer, String> mp = new TreeMap<Integer,String>(new ComparatorImpl());

        mp.put(100, "Vibhor");
        mp.put(200, "hexaware");
        mp.put(300, "amit");
        mp.put(400, "Yuvraj");
        mp.put(500, "Taishk");
        mp.put(600, "Akshat");

        for (Map.Entry<Integer,String> mi : mp.entrySet()) {

            System.out.println(mi.getKey());
        }

    }

    }
