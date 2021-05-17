package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIntro {

    /*
        Map interface
        1. HashMap
        2. TreeMap
        3. HashTable
    */
    public static void main(String[] args) {
        Map<Integer,String> dataList = new HashMap<>();
        System.out.println(dataList);

        dataList.put(11, "Java");
        dataList.put(12,"JavaScript");
        dataList.put(13, "Python");
        dataList.put(14,"HTML");

        System.out.println(dataList.values());

        Iterator<Integer> iterator = dataList.keySet().iterator();

        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println("key : "  + key);
        }

        for (String value: dataList.values()) {
            System.out.println("value : " + value);
        }
        Iterator<Map.Entry<Integer,String>> iterator1 = dataList.entrySet().iterator();

        while (iterator1.hasNext()){
            Map.Entry<Integer,String> entry= iterator1.next();
            System.out.println(entry.getKey() + " " + entry.getValue()  );
        }

        /*
            1. Add five employee with
            2. print the employee by first name
            3. print the employee by name, income and active status
        */
    }
}
