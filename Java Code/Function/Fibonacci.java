package Function;

import java.util.Scanner;

public class Fibonacci {
    public static void fib(int n){
        int m=0;
        int p=1;
        int sum=0;
        System.out.print(0+" ");
        int i=1;
        while(i!=n){
            sum =m+p;
            int temp=m;
            m=sum;
            p=temp;

            System.out.print(sum+" ");
            i++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}
