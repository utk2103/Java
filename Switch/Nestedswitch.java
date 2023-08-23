package Switch;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Utkarsh Upadhyay");
                break;
            case 2:
                System.out.println("Ravikant goel");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Fallinlove" -> System.out.println("He is certainly fall in love with coding");
                    default -> System.out.println("No department");
                }
            default:
                System.out.println("Enter correct employee id");
        }

    }
}
