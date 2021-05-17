package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericComparison {
    public static void main(String[] args) {
        ObjectPair<Integer,String> pair = new ObjectPair<>(100, "apple");
        ObjectPair<Integer,String> pair1 = new ObjectPair<>(200, "Orange");

        boolean result = ObjectComparetor.compare(pair,pair1);
        System.out.println(result);


        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("C++");
        names.add("JavaScript");

        boolean result1 = ObjectComparetor.contain(names.toArray(),"Java");
        System.out.println(result1);
    }
}

class ObjectComparetor{

    //compare two object and return true or false
    public static <K,V> boolean compare(ObjectPair<K,V> pair1, ObjectPair<K,V> pair2){
        boolean object = false;

        return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
    }
    // check
    public final static <T> boolean contain(final T[] array, final T value){

        for (final T e: array){
            if (e == value || value != null && value.equals(e)){
                return true;
            }
        }
        return false;
    }

}

class ObjectPair<K,V>{
    private K key;
    private V value;

    public ObjectPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
