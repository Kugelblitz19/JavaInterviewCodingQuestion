package Questions;

public class Employee {
    int id;
    String empName;
    Address address;
    public Employee(int id,String empName,Address address){
        this.id=id;
        this.empName=empName;
        this.address=address;
    }
    void display(){
        System.out.println(id + "" +empName);
        System.out.println(address.city + " " + address.state + " " +address.country);

    }
    public static void main(String []args){
        Address address1=new Address("matiyar","Bihar","India");
        Address address2=new Address("Ekma","Bihar","India");
        Employee e=new Employee(111,"Kunal",address1);
        Employee e2=new Employee(123,"Generator",address2);
        e.display();
        e2.display();
    }
}
