package Questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter three Number: ");
    int a =sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a>c) {
        System.out.println("A is Greater Number: " + a);
    } else if (b > a && b > c) {
        System.out.println("B is Greater Number: ");
    }else {
        System.out.println("C is Greater Number: ");


    }
    }
}
