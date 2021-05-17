package Generics;

import collections.list.Employee;

import java.util.*;

public class WildCard {

    public static void printCollactions(List<?> collection){

        for (Object obj : collection){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
      /*  List<String> list = new ArrayList<>();
        list.add("Wild card 1");
        list.add("Wild card 2");
        list.add("Wild card 3");
        list.add("Wild card 4");
        list.add("another wild card");
        printCollactions(list);

        List<Double> list1 = new ArrayList<>();
        list1.add(12.33);
        list1.add(12.33);
        list1.add(12.33);
        list1.add(12.33);
        printCollactions(list1);*/

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"java");
        map.put(2,"java");
        map.put(3,"java");
        map.put(4,"java");
        print(map);
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1,2);
        map1.put(2,2);
        map1.put(3,3);
        map1.put(4,3);
        print(map1);
    }

    public static void print(Map<?,?> map){

        Iterator<? extends Map.Entry<?, ?>> iterator1 = map.entrySet().iterator();

        while (iterator1.hasNext()){
            Map.Entry<?, ?> entry= iterator1.next();
            System.out.println(entry);
        }
      /*  Iterator<?> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<?,?> entry = (Map.Entry<?, ?>) iterator.next();
            System.out.println(entry);
        }
        */
    }
}
