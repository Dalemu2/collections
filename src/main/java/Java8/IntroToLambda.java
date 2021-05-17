package Java8;

public class IntroToLambda {

    /*
        method .
            - name
            - argument
            - body
            - return types

        Lambda:
            - no name
            - arguments or list of argument, or no argument
            - body
            - no return type
            (arguments) -> {body}
            - needs functional interface (this interface must have only one abstract method)

    */
    public static void main(String[] args) {
        printInfo("Print something ........." );
        MyInterface myInterface = () -> {
            return "Thsi is from Lambda ...";
        };
        System.out.println(myInterface.getInfo());
    }
    public static void printInfo(String message){
        System.out.println(message);
    }
}

@FunctionalInterface
interface MyInterface{
    String getInfo();
}