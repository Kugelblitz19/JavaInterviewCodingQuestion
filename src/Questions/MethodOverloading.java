package Questions;

public class MethodOverloading {
    public void  show(){
        System.out.println(1);

    }
    public void show(int a){
        System.out.println(4);
    }
    public static void main(String[]args){
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.show(2);
    }

}
