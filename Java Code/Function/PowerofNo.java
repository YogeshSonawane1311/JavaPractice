package Function;
import java.util.*;

public class PowerofNo {
    public static double pow(double n , double n1){
        double pow1=Math.pow(n, n1);
        return pow1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
        
    }
}
