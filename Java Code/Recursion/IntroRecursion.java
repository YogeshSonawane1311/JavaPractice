package Recursion;

public class IntroRecursion {
    public static void number(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        number(n-1);

    } 
    public static void main(String[] args) {
        int a=8;
        number(5);
    }
}
