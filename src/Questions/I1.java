package Questions;

public interface I1 {
    void show();
}
class Testing implements I1{

    @Override
    public void show() {
        System.out.println("Starts with key:");
    }
    public static void main(String[]args){
        Testing testing=new Testing();
        testing.show();
    }
}
