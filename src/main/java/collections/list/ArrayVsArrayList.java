package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        //array();
       // arrayList();
       // listToArray();
        arrayInToList();
    }

    public static void array(){
        float a = 23.33F;
        double list[] = new double[3];
        System.out.println(Arrays.toString(list));
        list[0] = 12.99;
        list[2] = 33;
        System.out.println(Arrays.toString(list));
        list = new double[]{1,22,3,4};
        System.out.println(Arrays.toString(list));
    }
    public static void arrayList(){
        ArrayList<Double> list = new ArrayList<>();
        System.out.println(list.size());
        //add the value to list
        list.add(22.33);
        list.add(34.55);
        //check the size of list object
        System.out.println(list.size());
        //print list values
        System.out.println(list);
        // print index of a value
        System.out.println(list.indexOf(34.55));

        //print a value at index
        System.out.println(list.get(1));

        //remove value at index
        list.remove(1);
        System.out.println(list);

        //check a content is exists
        System.out.println(list.contains(12));

        // insert a list
        list.add(1,22.3);
        System.out.println(list);
        // check an index - returns
        System.out.println(list.indexOf(12.444));



    }

    static void listToArray(){
        List num = new ArrayList<String>();

        num.add("one");
        num.add("one");
        num.add("one");
        num.add("one");
        num.add("one");
        System.out.println(num);

        // convert arraylist in to array

        String numbers[] = new String[num.size()];
        num.toArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void arrayInToList(){
        String [] list = {"ds","v","2","d"};

        //convert array into arraylist
        ArrayList<String> newList = new ArrayList<>();
        Collections.addAll(newList,list);
        System.out.println("first way " + newList);

        //second way to convert array to arraylist
        ArrayList<String> secondList = new ArrayList<>();
        for (String c: list
             ) {
            secondList.add(c);
        }
        System.out.println("second way " + secondList);

        Collections.sort(secondList);
        System.out.println("after sort" + secondList);
    }


}
