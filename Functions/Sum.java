package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        int ans = sum2();
        System.out.println(ans);

    }

    // return the value
    static int sum2(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = in.nextInt();
        System.out.println("Enter number 2:");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;   // It means function call is over

        //System.out.println("This will never execute");
    }
    static void sum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = in.nextInt();
        System.out.println("Enter number 2:");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum =" + sum);

    }
}
