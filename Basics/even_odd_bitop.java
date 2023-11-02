package Utkarsh;

public class even_odd_bitop {

    public static void main(String[] args) {
        int n = 24;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n){
        return (n & 1) ==1;
    }
}
