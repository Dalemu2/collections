import java.io.*;
import java.util.Scanner;

//reader & writer
//Stream - converts a file into a binary and then transported the file
/*
    public boolean exists()       // Tests if this file/directory exists.
    public long length()          // Returns the length of this file.
    public boolean isDirectory()  // Tests if this instance is a directory.
    public boolean isFile()       // Tests if this instance is a file.
    public boolean canRead()      // Tests if this file is readable.
    public boolean canWrite()     // Tests if this file is writable.
    public boolean delete()       // Deletes this file/directory.
    public void deleteOnExit()    // Deletes this file/directory when the program terminates.
    public boolean renameTo(File dest) // Renames this file.
    public boolean mkdir()        // Makes (Creates) this directory.
*/
public class FileIo_Intro {


    public static void main(String[] args) {
        readFromScanner();
        createAndVerifyFile();
        try {
            writeAndRead();
        }catch (IOException e){
            System.out.println(e);
        }
        try {
            readFile();
        }catch (IOException e){
            System.out.println("file not exist");
        }
    }
    public static void createAndVerifyFile(){
        File file = new File("Data.txt");
        try {
            boolean fileVariable = file.createNewFile();
            if(fileVariable){
                System.out.println("File is created");
            }else {
                System.out.println("File is not created");
            }
        }catch (IOException e){
            System.out.println("File is not crated" + e);
        }
        finally {
            file.delete();
        }
    }

    public static void writeAndRead() throws IOException {
            BufferedWriter bufferedWriter = null;
        try {
            File file = new File("TestData.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
             bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("this is java code writing the file");
        }catch (IOException e){
            System.out.println("File is not created " + e);
        }finally {
                bufferedWriter.close();
        }
    }


    public static void readFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            File file = new File("TestData.txt");

            FileReader reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            String output = "";
            int lineCount = 0;
            while ( (output = bufferedReader.readLine()) != null) {
                System.out.println(output);
            }
        }catch (IOException e){
            System.out.println("file is not exist "+ e);
        }finally {
            bufferedReader.close();
        }
    }
    public static void readFromScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int numbOne = scanner.nextInt();
        System.out.println("Enter second number : " );
        int numTwo =  scanner.nextInt();

        System.out.println("Sum of two number : " + (numTwo + numbOne));
    }
}
