package Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile()throws FileNotFoundException{
        FileInputStream fis=new FileInputStream("c:/fhkk");
    }
    void saveFiles() throws  FileNotFoundException{
        FileOutputStream fos=new FileOutputStream("d:mjqjhw");
    }
}
class Kuopp{
    public static void main(String[]args){

        ReadAndWrite rw=new ReadAndWrite();
      try {
          rw.readFile();
      }catch (FileNotFoundException foundException){
          System.out.println("Exception handled:");
      }
      try{
      rw.saveFiles();
    }catch (FileNotFoundException foundException){
          System.out.println("ye bhi handle ho gya:");
      }
    }
}
