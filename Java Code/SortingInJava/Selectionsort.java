package SortingInJava;

import java.util.Scanner;

public class Selectionsort {
    public static void view(int []arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
    }
    public static void Selection(int []arr,int size){
        for(int i =0;i<size;i++){
            int smallest =i;
            for(int j=i+1;j<size;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
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
        Selection(arr, size);
        view(arr, size);



    }
}
