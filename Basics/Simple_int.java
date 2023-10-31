package Utkarsh;

import java.util.Scanner;

public class Simple_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount, Rate and Time:");
        int Amount = input.nextInt();
        int Rate = input.nextInt();
        int Time = input.nextInt();

        float Si = (Amount * Rate * Time)/100;
        System.out.println("Simple intrest is:" + Si);

    }
}
