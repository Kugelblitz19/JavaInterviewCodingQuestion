package Questions;

public class ProgEmpl {
    float salary=1000000;
    static class Programmer extends ProgEmpl{
        int bonus=23445666;

        public static void main(String[]args){
            Programmer p=new Programmer();
            System.out.println("Programmer salary is:"+p.salary);
            System.out.println("Bonus of Programmer is:"+p.bonus);

        }
    }
}
