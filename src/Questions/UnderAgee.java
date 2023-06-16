package Questions;

public class UnderAgee extends RuntimeException{
    UnderAgee(){
        super("you are Under age bro")  ;
    }UnderAgee(String message){
        super(message);
    }
}
class Voot{
    public static void main(String[]args){
        int age =13;
        try {
            if (age < 18) {
                throw new UnderAgee("you can't vote");
            }
        }catch (UnderAgee es){
            es.printStackTrace();
        }
    }
}
