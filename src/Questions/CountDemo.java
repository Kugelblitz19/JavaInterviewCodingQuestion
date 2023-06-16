package Questions;

public class CountDemo {
    static int count=0;
    CountDemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[]args){
        CountDemo countDemo=new CountDemo();
        CountDemo countDemo1=new CountDemo();
        CountDemo countDemo2=new CountDemo();

    }
}
