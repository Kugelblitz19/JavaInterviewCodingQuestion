package Questions;

public class Super {
public void show(){
    System.out.println("1");
}
}
class Kunal extends Super{
    public void show(){
        super.show();
        System.out.println("2");
    }
    public static void main(String[]args){
        Kunal kunal=new Kunal();
        kunal.show();

    }
}