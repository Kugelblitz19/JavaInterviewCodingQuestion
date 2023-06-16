package Questions;

import java.util.Scanner;

public class LeapYear{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year u want to check is leap year: ");
        int leapYear=scanner.nextInt();
        if(leapYear%4==0){
            System.out.println("Year is leap Year: ");
        }else{
            System.out.println("Not a Leap Year: ");
        }
    }
}
