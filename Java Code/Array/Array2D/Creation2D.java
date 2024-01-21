package Array.Array2D;

import java.util.Scanner;



public class Creation2D {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int [][]arr =new int[3][3];
        Scanner in = new Scanner(System.in);
        // for array input
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            };
        }
        //for printing array
        for(int i=0;i<=m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}
