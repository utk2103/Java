package Utkarsh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);


        //narrow conversion -> int into float i.e.small into big
        int num = (int)(67.56f);
        System.out.println(num);

        // Automatic type promotion in expressions
        int a = 234;
        byte b = (byte)(a);
        System.out.println(b);  // 243 % 242 = 1

        byte a = 40;
        byte b = 50;
        byte c =100;
        int d - =(a * b) / c;

        System.out.println(d);
        
        

    }
}
