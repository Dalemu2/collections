import java.io.*;
public class ReadAndWriteImage {
    //TODO
    /*
        1.
        2.
        3.
    */
    static byte[] bytes;
    public static void main(String[] args)  {
        readImage("img.png");
        writeImage("newImg.png");
    }
    public static void writeImage(String fileName) {
      File file = new File(fileName);
      FileOutputStream outputStream = null;
      try {
          outputStream = new FileOutputStream(file);
          outputStream.write(bytes);
      }catch (IOException e){
          System.out.println(e);
      }finally {
          try {
              outputStream.close();
          }catch (IOException e){
              System.out.println(e);
          }
      }
    }
    public static void readImage(String fileName){
        File file = new File(fileName);
        long length = file.length();
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(file);
            int intLength = (int) length;
            bytes = new byte[intLength];
            fileInputStream.read(bytes);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream!= null) {
                    fileInputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
