package Questions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a= scanner.nextInt();
        if(a%2==0){
            System.out.println("Even Number: ");

        }
        else{
            System.out.println("Odd Number: ");
        }
    }
}
