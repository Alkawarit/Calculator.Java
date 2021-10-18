package org.example;

import java.util.Scanner;
import java.util.Scanner;

public class App 
{


    public static void main(String[] args )
    {
        double number1;
        double number2;
        double result;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operator");
        operator = input.next().charAt(0);
        System.out.println("Enter number1");
        number1 = input.next().nextdouble();
        System.out.println("Enter number2");
        number2 = input.next().nextdouble();

     switch (operator) {
         case '+':
             result = number1 + number2;
             System.out.println( number1 + '+' + number2 + '=' + result);
             break;
         case '-':
             result = number1 - number2;
             System.out.println( number1 + '-' + number2 + '=' + result);
             break;
         case '*':
             result = number1 * number2;
             System.out.println( number1 + '*' + number2 + '=' + result);
             break;
         case '/':
             if (number2 != 0) {
                 result = number1 / number2;
                 System.out.println( number1 + '/' + number2 + '=' + result);
             } else {
                 result = 0;
             }
             break;
         default:
             System.out.println("Invalid operator!");

     }
        System.out.println(result);
}
    }