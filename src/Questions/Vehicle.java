package Questions;

public abstract class Vehicle {
    int noOfTyre;
    abstract void start();
}
class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Starts with key:");
    }
}
class Scooter extends Vehicle{

    @Override
    void start() {
        System.out.println("Starts with kick:");
    }
    public static void main(String[]args){
        Car c =new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();
    }
}
