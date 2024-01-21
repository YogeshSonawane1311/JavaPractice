package Array.Array2D;

import java.util.Scanner;

public class AddMatrix {
    public static void putdata(int [][]arr){
        int m=3,n=3;
        Scanner in = new Scanner(System.in);
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Enter value for arr[%d][%d] =",i,j);
                arr[i][j]=in.nextInt();
            };
        }
        
        
    }
    public static void getdata(int [][]arr){
        int m=3,n=3;
        for(int i=0;i<m;i++){
            System.out.print("| ");
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }         
            if(i==m/2){
                System.out.print("|   +    \n");    
            }
            else{
                System.out.print("|\n");
            }
        }
    }
    public static void addMatrix(int [][]arr,int [][]arr1,int [][]ans){
        int m=3;
        int n=3;
        for(int i=0;i<m;i++){
            System.out.print("| ");
            for(int j=0;j<n;j++){
                ans[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.print("|\n");
        }
    }
    public static void main(String[] args) {
        
        int [][]arr =new int[3][3];
        int [][]arr2 =new int[3][3];
        int [][]ans = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter array 1 value :");
        putdata(arr);
        System.out.println("Enter array 2 value :");
        putdata(arr2);
        getdata(arr);
        getdata(arr2);
        addMatrix(arr,arr2,ans);
        
        
    }
}
