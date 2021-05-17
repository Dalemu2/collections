package multitrading;

    // the five stage of the Thread
    // 1. new key word - call a constructor
    // 2. runnable
    // 3. running
    // 4. dead
    // 5. stop

public class ThreadCall {

    public static void main(String[] args) {
        ThreadOne one = new ThreadOne();
        one.start();

        ThreadTwo two = new ThreadTwo();
        two.run();

        RunWithClass three = new RunWithClass();
        three.runnable.run();

        three.runnableTwo.run();

        three.runnableThree.run();
    }
}
class ThreadOne extends Thread{
    public void run(){
        System.out.println("Inside Thread One: " + Thread.currentThread().getName());
    }
}

class ThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside Thread Two : " + Thread.currentThread().getName());
    }
}

//Unanimous class
//runnable is a void

class RunWithClass{
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Inside Thread Runnable : " + Thread.currentThread().getName());
        }
    };

    // using Lambda function -- recommended way to implement thread
    Runnable runnableTwo =  () -> { System.out.println("Inside Thread With Lambda : " + Thread.currentThread().getName());};

    //
    String[] names ={"Mike" , "Jack", "Josh", "Bob"};

    Runnable runnableThree = () -> {
        System.out.println("Inside Thread Runnable : " + Thread.currentThread().getName());
        for (String name: names
             ) {
            System.out.println(name);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    };

    // thread executor
    //callable

}