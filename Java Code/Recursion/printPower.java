package Recursion;
import java.lang.Math;
//Time complexity O(n)
// public class printPower {
//     public static void pow(double k,double i,int n ,int sum){
//         if(i==n+1){
//             return;
//         }
//         System.out.println(k+"^"+i+"="+Math.pow(k, i));
//         pow(k, i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         pow(2, 0, 10, 0);
//     }
// }

public class printPower {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0 ){
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x*xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
        
    }
}