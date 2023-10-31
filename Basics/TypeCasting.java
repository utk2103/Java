package Utkarsh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);


        //narrow conversion -> int into float i.e.small into big
        int num = (int)(67.56f);
        System.out.println(num);

        // Automatic type promotion in expressions
        // int a = 234;   // range of byte is 256
        // byte b = (byte)(a);
        // System.out.println(b);  // 243 % 242 = 1 (it shows the remainder)

        // byte a = 40;
        // byte b = 50;
        // byte c =100;
        // int d - =(a * b) / c;

        // System.out.println(d);

        int number = 'A';
        System.out.println("नमस्ते");

        byte b = 34;
        char c = 'a';
        short s = 1024;
        int i = 34565;
        float f = 4.54f;
        double d = 0.2345;
        double result = (f * b) + (i / c) + (d - s);
        // float + int + double = double
        System.out.println((f * b) + (i / c) + " " + (d - s));
        System.out.println(result);
        
        

    }
}
