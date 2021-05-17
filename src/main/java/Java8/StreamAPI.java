package Java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        System.out.println(userName());
        withOutStream();
        withStream();
    }

    public static void withOutStream(){
        int count = 0;
        for (String list:
             userName()) {
            if (list.length() <= 4 ){
                count++;
                System.out.println(list);
            }
        }
        System.out.println(count);
    }
    public static void withStream(){
        List<String> result = userName().stream().filter(name ->name.length() <=4).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void getCount(){
        Stream.iterate(1,cnt -> cnt + 1).filter(num -> num % 2 == 0 ).limit(6).forEach(System.out::println);
    }
    public static List<String> userName(){
        List<String> userNameList = new ArrayList<>();
        userNameList.add("Nile");
        userNameList.add("Jacob");
        userNameList.add("mark");
        userNameList.add("susan");
        userNameList.add("Elias");

        return userNameList;
    }
}
