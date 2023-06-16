package Questions;

public class Static {
    static int a = 10;
    int b=20;
}
   class Demo{
       public static void main(String[]args){
           System.out.println(Static.a);
           Static s=new Static();
           System.out.println(s.b);
       }

}
