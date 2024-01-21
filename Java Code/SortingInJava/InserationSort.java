package SortingInJava;

import java.util.Scanner;

public class InserationSort {
    
    public static void view(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Inseration(int arr[], int size){
        for(int i=0;i<size;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter array element to sort ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        view(arr, size);
        Inseration(arr, size);
        view(arr, size);
    }
}
