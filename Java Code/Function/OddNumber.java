package Function;

import java.util.Scanner;

public class OddNumber {
    public static int odd(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==1){
                sum = sum +i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of 1 to "+n+" is "+ odd(n));

    }
}
