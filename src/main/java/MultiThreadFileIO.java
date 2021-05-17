import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class MultiThreadFileIO {
    public static void main(String[] args) throws IOException, InterruptedException {
        final PipedInputStream inputStream = new PipedInputStream();
        final PipedOutputStream outputStream = new PipedOutputStream();

        //connect the reader and writer together
        inputStream.connect(outputStream);
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 65; i < 91; i++){
                    try{
                        outputStream.write(i);
                        Thread.sleep(500);
                    }catch(IOException | InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 65; i < 91; i++){
                    try{
                        System.out.print((char) inputStream.read() + "  ");
                        Thread.sleep(500);
                    }catch(IOException | InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        });

        writer.start();
        reader.start();

        //join and wait
        writer.join();
        reader.join();

        //close
        inputStream.close();
        outputStream.close();
    }
}
