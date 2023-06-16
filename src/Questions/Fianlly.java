package Questions;

public class Fianlly {
    public static void main(String[]args){
        try{
            int a=100,b=2,c;//0,c;
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException ae){
            System.out.println(ae);

        }finally {
            System.out.println("hey finally:");
        }
    }
}
