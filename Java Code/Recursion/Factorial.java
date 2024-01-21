package Recursion;

public class Factorial {
    public static void Fact(int j, int sum){
        if(j==0){
            System.out.println(sum);
            return;
        }
        sum=sum*j;
        
        Fact(j-1,sum);

        
    }
    public static void main(String[] args) {
        int n =10;
        Fact(5,1);
    }
}
