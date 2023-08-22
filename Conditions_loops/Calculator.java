package Conditions_loops;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x

        while (true) {
            //take the operator as input
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                // input two numbers
                System.out.println("Enter two numbers:");
                int a = in.nextInt();
                int b = in.nextInt();

                int res = 0;
                if (op == '+') {
                    res = a + b;
                }
                if (op == '-') {
                    res = a - b;
                }
                if (op == '*') {
                    res = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        res = a / b;
                    }
                }
                if (op == '%') {
                    res = a % b;
                }
                else if (op == 'x' || op == 'X') {
                    break;}
//                } else {
//                    System.out.println("Invalid operation");
//                }
                System.out.println(res);
            }


        }


    }
}
