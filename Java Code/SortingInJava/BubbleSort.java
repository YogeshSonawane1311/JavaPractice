package SortingInJava;

import java.util.Scanner;
//Bubble sort Complexity is Big O^2


public class BubbleSort {
    public static void view(int []arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
    }
    public static void Bubble(int []arr,int size){
        for(int i =0;i<size;i++){
            for(int j=0;j<i+1;j++){
                if(arr[i]>arr[j]){
                    int a =arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
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
        Bubble(arr, size);
        view(arr, size);



    }
}
