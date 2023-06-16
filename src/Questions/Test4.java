package Questions;

import java.io.FileInputStream;

public class Test4 {
    public static void main(String[]args){

     //   FileInputStream fis=new FileInputStream("c/abc.txt");
        try {
            int a = 100 / 0;
            System.out.println("rest of the code...");
        }catch (ArithmeticException arithmeticException){
            System.out.println("arithmetic...");
        }
    }
}
