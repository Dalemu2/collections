package Exception;

import java.io.IOException;

public class ThrowVsThrows {
    public static void main(String[] args) {
        try {
            checkEligibility(55,33);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        ThrowsDemo a = new ThrowsDemo();
        try {
            a.myMethod(22);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    //student age and weight logic
    static void checkEligibility(int age, int weight) throws ArithmeticException{

        //student minimum 12 lb and max 40 lb
        if (age < 12 && weight < 40) {
            System.out.println("Student is eligible");
        }else {
             throw new ArithmeticException("Student age or weight is not eligible");
        }
    }
}
class ThrowsDemo{
    void myMethod(int num) throws IOException, ClassNotFoundException{
        if (num % 2 == 0)
            throw new IOException("Number is even - IOException ");
        else
            throw new ClassNotFoundException("Number is odd - ClassNotFoundException");
    }
}

class MyCustomException extends Exception{
    MyCustomException(String message){
        super(message);
    }
}
