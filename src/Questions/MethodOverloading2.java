package Questions;

public class MethodOverloading2 {
    public void show(int a){
        System.out.println("int method");
    }
    public void show(int... a){
        System.out.println("varargs method");
    }
    public static void main(String[]args){
        MethodOverloading2 methodOverloading2=new MethodOverloading2();
        methodOverloading2.show(90,1000,20);
    }
    }
