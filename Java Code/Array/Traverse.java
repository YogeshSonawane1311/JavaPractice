package Array;

import java.util.Scanner;

public class Traverse {
    public static void traverse(int[] arr, int size,int n) {
        for (int i = 0; i <= size; i++) {
            //System.out.println(arr[i]);
        }
        find(arr,n);

    }
    public static void find(int []arr,int n){
        int i=0;
        if(n==arr[i]){
            System.out.println(i);
        }
        else{
            System.out.println("Not available");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();    
        traverse(arr, size,n);
    }
}
