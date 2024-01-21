import java.util.Scanner;

public class SumNaturalNo {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter number ");
        int n=new Scanner(System.in).nextInt();
        for(int i  =1;i<=n;i++){
            sum+=i;
        } 
        System.out.println(" Sum of 1 to "+n+" 7is equal to "+sum);

    }
}
