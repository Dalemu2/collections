package multitrading;

import javax.management.MBeanAttributeInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsIntro {

    // synchronous --> runnable vs Asynchronous --> callable
    /*
        1. executor - only for the runnable
        2. executor service - for runnable and callable
        3. ScheduledExecutorService - runnable and callable

        -------------------- synchronize
        -------------------- collection
    */

    public static void main(String[] args) {
        //aboutExecutor();
        aboutExecutorService();
    }

    public static void aboutExecutor(){
        System.out.println("Inside : " + Thread.currentThread().getName());
        System.out.println("Executor basics .....");

        ExecutorService service = Executors.newSingleThreadExecutor();
        Runnable runnable = () -> {
            System.out.println("Inside Runnable : " + Thread.currentThread().getName());
        };

        service.submit(runnable);

        service.shutdown();
    }

    public static void aboutExecutorService(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable runnableOne = () -> {
            System.out.println("Running Thread One: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        };
        Runnable runnableTwo = () -> {
            System.out.println("Running Thread Two: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        };
        Runnable runnableThree = () -> {
            System.out.println("Running Thread Three: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        };

        executorService.submit(runnableOne);
        executorService.submit(runnableTwo);
        executorService.submit(runnableThree);

        executorService.shutdown();
    }


}
