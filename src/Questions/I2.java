package Questions;

public interface I2 {
     void show();
    interface  I3{
        public  void display();
        class Testu implements I2,I3{
            public void show(){
                System.out.println("Starts with key:");
            }

            @Override
            public void display() {

            }
        }
        public static void main(String[]args){
            Testu testu=new Testu();
            testu.display();
            testu.show();
        }
    }
}
