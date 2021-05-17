package Java8;

import java.util.ArrayList;
import java.util.List;

public class MoreAboutLambda {
    public static void main(String[] args) {
        TaskOne taskOne = () -> {
            return 11.29 + 344.99;
        };

        double sum = taskOne.sumOfNumber();
        System.out.println(sum);

        TaskTwo taskTwo = (fName,lName) -> {

            return fName + "  " +  lName;
        };

        String fullName = taskTwo.printName("Joh","Mike");
        System.out.println(fullName);
        getName();

        TaskThree taskThree =() -> {
            String a = "Lambda Info";
            System.out.println(a);
        };
        taskThree.printVoid();

    }

    public static void getName(){
        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Mike");
        names.add("bob");

       /* for (String name: names
             ) {
            System.out.println(name);
        }*/
        names.forEach((name) -> {
            System.out.println(name);
        });

    }
}


@FunctionalInterface
interface TaskOne{
    double sumOfNumber();
}

@FunctionalInterface
interface TaskTwo{
    String printName(String firstName, String lastName);
}

@FunctionalInterface
interface TaskThree{
    void printVoid();
}