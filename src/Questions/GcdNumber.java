package Questions;

import java.util.Scanner;

public class GcdNumber {
    public static void main(String[]args){
        System.out.println("Enter two numbers:");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int gcd=1;
        for (int i = 1; i <= num1 && i <= num2; ++i) {
            if(num1%i==0 && num2%i==0)
                gcd = i;


        }
        System.out.println("GCD of " + num1 +" and " + num2+ " is " + gcd);
        }
    }


