package Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String a = "Utkarsh";
//        String b = "Utkarsh";
//
//        System.out.println( a == b);  // here means there is only one Utkarsh object and a and b are pointing towards same object

        String fruit = in.next();

        if (fruit.equals("mango"))   // .equals checks the value not the reference
        {
            System.out.println("King of fruit");
        }
        if (fruit.equals("apple")){
            System.out.println("A sweet red fruit");
            // Here more optimise way to do the same by using switch statement
        }
    }
}
