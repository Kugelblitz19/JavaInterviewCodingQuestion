package Questions;

public class Employee2 {
    private int empId;
    public void setEmpId(int eId){
        empId=eId;

    }
    public int getEmpId(){
        return empId;
    }

}
class Company{
    public static void main(String[]args){
        Employee2 employee2=new Employee2();
        employee2.setEmpId(23);
        System.out.println(employee2.getEmpId());
    }
}

