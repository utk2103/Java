package Utkarsh;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter Your name:");

        // Read the user's name as input
        String name = input.nextLine();

        // Greet the user
        System.out.println("Namaste,"+ name + " Have a great day!");
    }

}
