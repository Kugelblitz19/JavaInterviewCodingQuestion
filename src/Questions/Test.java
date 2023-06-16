package Questions;

public class Test {
    public void show(){
        System.out.println(1);
    }
}
class Kp extends Testing {
    public void show(){
        System.out.println(2);
    }
    public static void main(String[] args) {
        Testing test=new Testing();
test.show();

    }
    }
