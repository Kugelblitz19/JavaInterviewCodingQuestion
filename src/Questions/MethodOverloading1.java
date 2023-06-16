package Questions;

import com.sun.jdi.connect.Connector;

public class MethodOverloading1 {
    public void show(int a, String b){
        System.out.println(1);
    }
    public void show(String a, int b){
        System.out.println(4);
    }
    public static void main(String[]args){
        MethodOverloading1 methodOverloading1 =new MethodOverloading1();
    methodOverloading1.show(3,"kunal");}
}
