package Function;

import java.util.Scanner;

public class Circumference {
    public static double circle(double r){
        double pi = Math.PI;
        double cri = (2*pi*r);
        return cri;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r=sc.nextInt();
        double n=circle(r);
        System.out.printf("%.2f",n);
    }

}
