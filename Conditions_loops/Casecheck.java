package Conditions_loops;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);  // trim help us to remove the extra space
         // charAt() is used to convert string into char

        //System.out.println(in.next().trim());

        //System.out.println(ch);



        //String word = "Hello";
        //System.out.println(word.charAt(0));
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        } else{
            System.out.println("Uppercase");
        }

    }
}
