package Questions;

public class SingleInheritance {
    void eat() {
        System.out.println("eating...");
    }

    static class Kunal extends SingleInheritance {
        void run() {
            System.out.println("running...");
        }


        public class TestSingleInheritance {
            public static void main(String[] args) {
                SingleInheritance.Kunal kunal = new SingleInheritance.Kunal();
                kunal.eat();
                kunal.run();
            }

        }
    }
}