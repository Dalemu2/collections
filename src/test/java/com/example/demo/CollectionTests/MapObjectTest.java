package com.example.demo.CollectionTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapObjectTest {

    public Map<String,String> mapShare(Map<String,String> mapValue){
        //Map<String,String> newValue = new HashMap<>();
        if (mapValue.containsKey("a")){
            if (mapValue.containsKey("b")){
                mapValue.remove("c");
                mapValue.replace("b", String.valueOf(mapValue.get("a")));
            }
            else {
                mapValue.put("b",String.valueOf(mapValue.get("a")));
                mapValue.remove("c");
            }
        }
        else if(mapValue.containsKey("b")){
            mapValue.remove("c");
            mapValue.remove("d");
            mapValue.replace("b", String.valueOf(mapValue.get("b")));
        }
        else {
            mapValue.remove("c");
            mapValue.remove("d");
            mapValue.remove("e");
        }
        return mapValue;
    }


    @DisplayName("count Evens Test")
    @Test
    public void testMap(){

        Map<String,String> newValue = new HashMap<>();
        Map<String,String> expected = new HashMap<>();


        newValue.put("a","aaa");
        newValue.put("b","bbb");
        newValue.put("c","ccc");

        expected.put("a","aaa");
        expected.put("b","aaa");
        assertEquals(newValue,mapShare(newValue));
        System.out.println(mapShare(newValue));

         newValue = new HashMap<>();
         expected = new HashMap<>();



        newValue.put("b","xyz");
        newValue.put("c","ccc");


        expected.put("b","xyz");
        assertEquals(newValue,mapShare(newValue));
        System.out.println(mapShare(newValue));


        newValue = new HashMap<>();
        expected = new HashMap<>();

        newValue.put("a","aaa");
        newValue.put("c","meh");
        newValue.put("d","hi");

        expected.put("a","aaa");
        expected.put("b","aaa");
        expected.put("d","hi");
        assertEquals(newValue,mapShare(newValue));
        System.out.println(mapShare(newValue));
    }
}
