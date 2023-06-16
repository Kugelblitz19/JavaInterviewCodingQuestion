package Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {
    public static void main(String[]args) throws IOException {
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream("d:/moplkk");
        }catch (FileNotFoundException fnfe){
            System.out.println("File not found:");
        }finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            System.out.println("file closed789|");
        }

        }
    }

