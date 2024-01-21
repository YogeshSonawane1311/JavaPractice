package Function;

import java.util.Scanner;

public class AverageOf3no {
    public static float Average(int n,int n1, int n3){
        return (n+n1+n3)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(Average(n2, n1, n));
    }
}
