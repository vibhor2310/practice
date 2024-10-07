package Hexaware;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Testing12 {
    public static void main(String[] args) {
//        Map m = new HashMap();
        Map m = new LinkedHashMap();
        m.put(100, "rk");
        m.put(300, "hexaware");
        m.put(200, "amit");
        m.put("aditya", 400);
        m.put(null, null);
        m.put(100, "ram");
        m.put(500, "rk");
        m.put(600, "rk");

        for (Object o : m.entrySet()) {
            // type cast
            Map.Entry me = (Map.Entry) o;
            System.out.println(me.getKey() + "  " + me.getValue());

        }
        Map<Integer,String> mp = new LinkedHashMap<>();
        mp.put(100, "Vibhor");
        mp.put(200, "hexaware");
        mp.put(300, "amit");
        mp.put(400, "Yuvraj");
        mp.put(500, "Taishk");
        mp.put(600, "Akshat");

        for (Map.Entry<Integer,String> mi : mp.entrySet()) {

            System.out.println(mi.getKey() + "  " + mi.getValue());

        }
    }
}
