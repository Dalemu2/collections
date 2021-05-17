package multitrading;

public class IntroToThread implements Runnable{
    public static void main(String[] args) {
        //System.out.println("This is single thread ...");

        Thread threadOne = new Thread("Thread One .....");
        Thread threadTwo = new Thread("Thread Two .....");

        threadOne.start();
        threadTwo.start();


        try {
            threadOne.sleep(2000);

        }catch (InterruptedException e){
            System.out.println(e);
        }


        System.out.println(threadOne.getName());
        System.out.println(threadTwo.getName());
    }
    @Override
    public void run(){

    }
}
