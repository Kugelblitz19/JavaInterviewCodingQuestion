package Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        char operator;
        double num1,num2,result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);
        System.out.println("Enter first number");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("You choose wrong operator:");
        }

        
    }
}
