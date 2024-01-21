package Array.HackerRank;

import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int sum=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            sum=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<n;j++){
                int sum1=sum+a+(j*b);
                System.out.print(sum1+" ");
                sum =sum1+sum;
            }
            System.out.print("\n");
        }
        in.close();
        
    }
}