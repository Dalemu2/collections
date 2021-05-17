package multitrading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableWithService {

    static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callableWithFuture();
    }

    public static void callableWithFuture() throws ExecutionException, InterruptedException {

        Callable<String> callable = () -> {
            System.out.println("Callable threads ........");
            Thread.sleep(2000);
            return "Hello from callable";
        };

        Callable<String> callableOne = () -> { Thread.sleep(1000);
            return "Result from callable one";
        };

        Callable<String> callableTwo = () -> { Thread.sleep(1000);
            return "Result from callable Two";
        };

        //Arrays.asList
        List<Callable<String>> taskList = Arrays.asList(callable,callableOne,callableTwo);
        List<Future<String>> future =  executorService.invokeAll(taskList);         // .invokeAll - invokes all threads
        /*A Future represents the result of an asynchronous computation.
        Methods are provided to check if the computation is complete, to wait for its completion,
        and to retrieve the result of the computation. The result can only be retrieved using method get when the computation has completed,
         blocking if necessary until it is ready */
        //Future<String > future = executorService.submit(callable);      // .submit starts thread, run, runnable and stop
                                                                        //Submits a Runnable task for execution and returns a Future representing that task.
                                                                      //The Future's get method will return the given result upon successful completion.
        System.out.println("perform another task");
        for (Future<String> key: future
             ) {
            System.out.println(key.get());
        }
        //String result = future.get();
        //System.out.println("this is result --> " + result);
        executorService.shutdown();                                     //.shutdown terminate a thread

    }
}
