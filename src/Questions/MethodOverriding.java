package Questions;

public class MethodOverriding {
    public void show(int a) {
        System.out.println(1);
    }
}

    class xyz extends MethodOverriding {
        public void show(int a) {
            System.out.println(2);
        }


        public static void main(String[] args) {
            MethodOverriding methodOverriding = new MethodOverriding();
            methodOverriding.show(4);
xyz x= new xyz();
x.show(2);
    }
}
