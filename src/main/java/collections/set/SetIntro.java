package collections.set;

import java.util.HashSet;

public class SetIntro {

    //set <class>
    // 1. HashSet - remove duplicate value
    //2. TreeSet - dictionary order
    //3. linkedHashSet - thread safe, slow

    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("user one");
        name.add("user two");
        name.add("user one");
        System.out.println(name.isEmpty());
        System.out.println(name);
    }
}
