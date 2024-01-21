package Recursion;

public class Fibnacci {
    public static void Fib(int i, int j, int prev, int next){
        if(i==j){
            return;
        }
        int k =prev+next;
        System.out.print(prev+" ");
        prev = next;
        next =k;

        Fib(i+1,j,prev,next);
        //Fib(i+1,j,next,k);
    }
    public static void main(String[] args) {
        Fib(1, 11, 0, 1);
    }
}
