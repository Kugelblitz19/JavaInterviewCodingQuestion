package Questions;

public class StaticMethod {
static void display(){
    System.out.println("Hello Kunal");
}
public static void main(String[]args){
    StaticMethod.display();
    Kun.show();
}
}
class Kun{
static void show(){
    System.out.println("Hello");
}
}
