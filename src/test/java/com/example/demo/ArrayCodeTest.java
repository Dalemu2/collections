package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCodeTest {


    public int countEvents(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public boolean sum28(int [] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count++;
            }
        }
        if (count == 4){
            return true;
        }
        else {
            return false;
        }

    }

    public int[] zeroFront(int [] array){

        int sortedArrays[] = new int[array.length];

        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++){
                if(array[j] < array[i]){
                    sortedArrays[i] = array[j];
                }
                else {
                    sortedArrays[i] = array[i];
                }
            }
        }
        return sortedArrays;
    }


    @Test
    public void testZeroFront(){
       // assertArrayEquals(,zeroFront(new int[]{1,0,0,0}));
        int a[] = {0,0,1,1};
        assertArrayEquals(a, zeroFront(new int[]{1,0,0,1}));
      //  assertEquals(int[]{0,0,1,1},zeroFront(new int[]{1,0,0,0}));
    }
    @DisplayName("count Evens Test")
    @Test
 //   @Order(1)
    public void testCountEvents() {
        assertEquals(3, countEvents(new int[]{2, 1, 2, 3, 4}));
        assertEquals(1, countEvents(new int[]{2, 3, 5}));
        assertEquals(0, countEvents(new int[]{1, 3, 5}));

        assertEquals(true, sum28(new int[]{2, 3, 2, 2, 4,2}));
        assertEquals(false, sum28(new int[]{2, 3, 2, 2, 4,2,2}));
        assertEquals(false, sum28(new int[]{1, 2, 3, 4,}));

        Assertions.assertEquals(true,sum28(new int[]{2,2,2,2}));
    }
    @DisplayName("Test sum 2'8 test")
    @Test
  //  @Order(2)
    public void testSum28() {
        assertTrue(sum28(new int[]{2, 3, 2, 2, 4,2}));
        assertFalse(sum28(new int[]{2, 3, 2, 2, 4,2,2}));
        assertFalse(sum28(new int[]{1, 2, 3, 4,}));
        assertTrue(sum28(new int[]{2,2,2,2}));
    }

}


