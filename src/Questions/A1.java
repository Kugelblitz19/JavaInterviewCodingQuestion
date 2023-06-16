package Questions;

public class A1     {
    void m1(){
        System.out.println("I am in class 1");
    }
}
class B1 extends A1{
    void show(){
        super.m1();
    }
    public static void main(String[]args){
        B1 ob1=new B1();
        ob1.show();
    }
}
