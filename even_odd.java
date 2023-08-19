package Utkarsh;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = input.nextInt();
        if(no % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
