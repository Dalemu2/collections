package com.example.demo.CollectionTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    will require you to use ArrayList or set interface
    may use lambda for test case 
*/

public class ListObjectTests {
    
    /*
        given a list of integers, return a list where each integer is multiplied by 2 
     
    */
    List<Integer> number = new ArrayList<>();
    public List<Integer> doubling(List<Integer> nums){
       // number = new ArrayList<>();
        for(int i =0 ; i < nums.size(); i++){
           // number.add(nums.get(i) * 2);
           // System.out.println(nums.get(i));
            nums.set(i,nums.get(i) * 2);
          //  System.out.println(nums.get(i));
        }
        return nums;
    }
    public List<String>  copies3(List<String> str){
        str.replaceAll(newStr -> newStr + newStr + newStr);

        return str;
    }

  /*  public List<String>  copiesThreeTimes(List<String> str){
       str.add(str);
       str;
    }*/
    @DisplayName("count Evens Test")
    @Test
    public void doubleTheNumber() {
       // int a[] = {1,4,6};
      /*  List<Integer> newList = new ArrayList<>();
           newList =  getIntList(new int[]{1,2,3});
        List<Integer> a = new ArrayList<>(Arrays.asList(2,4,6));
        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3));

        //num.clear();
          System.out.println(a);
          System.out.println(num);
          assertEquals(a,doubling(num));
          // number.clear();

           a = new ArrayList<>(Arrays.asList());
           num = new ArrayList<>(Arrays.asList());
           assertEquals(a,doubling(num));
          System.out.println(a + "\n" + num);
       // number.clear();
        a = new ArrayList<>(Arrays.asList(12,16,12,16,-2));
        num = new ArrayList<>(Arrays.asList(6,8,6,8,-1));
        assertEquals(a,doubling(num));
       // number.clear();
        System.out.println(a + "\n" + num);
        //System.out.println(num);
        */

        //--------------------------------------------------------
        List<String> actual = new ArrayList<>(Arrays.asList("a","bb","ccc"));
        List<String> expected = new ArrayList<>(Arrays.asList("aaa","bbbbbb","ccccccccc"));
        assertEquals(expected,copies3(actual));
        System.out.println(actual);


    }



    public ArrayList<Integer> getIntList(int[] data){

        ArrayList<Integer> newList = new ArrayList<Integer>();
       // List<Integer> num = new ArrayList<Integer>(Arrays.asList(data));
        //Collections.addAll(newList,data);

        return newList;
    }

}
