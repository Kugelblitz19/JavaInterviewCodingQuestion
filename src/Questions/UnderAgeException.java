package Questions;

public class UnderAgeException extends Exception{
    UnderAgeException(){
        super("you are under age");
    }
    UnderAgeException(String message){
        super(message);
    }


}
class Vote{
    public static void main(String[]args){
        int age=17;
        try{
        if(age<18) {
            throw new UnderAgeException("you can't vote");
        }
        }catch (UnderAgeException ageException){
            ageException.printStackTrace();
        }
    }
}
