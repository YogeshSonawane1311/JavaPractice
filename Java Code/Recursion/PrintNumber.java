package Recursion;

public class PrintNumber {
    public static void printNum(int i){
        while(i>=0){
            System.out.println(i);
            printNum(i-1);
        }
    }
    public static void main(String[] args) {
        printNum(12);
    }
}
