package Conditions_loops;

public class loops {
    public static void main(String[] args) {

        // Print numbers form 1 to 5
        // Syntax
        // for (initialization; condition ; increment ){
        //  body
        // }
//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//
//        }

        //Print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = in.nextInt();
//
//        for (int num = 0; num < n; num++) {
//            System.out.println(num + "");
//        }

        // while loops -> Use while loop when you don't know how many times loop gonna run
        //  for (int num = 0; num < n; num++)
        int num = 1; // initialisation
        while(num <= 5){
            System.out.println(num);
            num +=1;
        }

        // do while -> it will always execute once
        /*
        do {

        } while (condition);

         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n <= 5);


    }
}
