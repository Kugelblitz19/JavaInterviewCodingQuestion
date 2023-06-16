package Questions;

public class StaticVariable {
    int empId;
    String empName;
    static  String company="kunu";
    StaticVariable(int empId,String empName){
        this.empId=empId;
        this.empName=empName;

    }
void display(){
    System.out.println(empId + " " +empName + " " + company);

}
public static void main(String[]args){
        StaticVariable sv= new StaticVariable(102,"kunal");
        StaticVariable sv1=new StaticVariable(8902,"rahul");
        sv.display();
        sv1.display();
}
}
