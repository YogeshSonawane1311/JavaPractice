package Function;

import java.util.Scanner;

public class FactorialFunc3 {
    public static int facto(int n){
        int temp=1;
        for(int i =1;i<=n;i++){
            temp = temp*i;
        }
        
        //temp =temp+n-1;
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facto(n));
    }
}
