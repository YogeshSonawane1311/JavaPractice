package Function;
import java.util.*;


import java.util.Scanner;

public class GreaterNo {
    public static void greNo(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else{
            System.out.println(n2+" is greater than "+n1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int n2= sc.nextInt();
        greNo(n, n2);;
    }
}
