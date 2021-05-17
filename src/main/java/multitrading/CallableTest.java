package multitrading;
import java.util.concurrent.Callable;
public class CallableTest {
    public static void main(String[] args) {

        CallableTest thisCall = new CallableTest();
        try {
            boolean taskOne = thisCall.task1.call();
            boolean taskTwo = thisCall.task2.call();
            System.out.println(taskOne);
            System.out.println(taskTwo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Callable<Boolean> task1 = () -> {
        int arr[] = {1, 7, 1, 7};
        return has77(arr);
    };

    public Boolean has77(int []arr){
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {              //arr.length == 3 -- i ==>2

            if (arr[i] == 7 && arr[i+1] == 7){
                flag = true;
            }
            if (i <= arr.length - 1 && arr[i] == 7 && arr[i+2] == 7){
                flag = true;
            }
        };
        return flag;
    }
    Callable<Boolean> task2 = () -> {
        int arr[] = {1, 3, 4, 2};
        return has12(arr);
    };

    public Boolean has12(int arr[]){

        boolean flag = false, one = false, two = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1){
                one = true;
            }
            if (arr[i] == 2){
                two = true;
            }
            if (one && two){
                flag = true;
            }
        };
        return flag;

    }
}
