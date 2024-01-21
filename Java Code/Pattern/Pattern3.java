package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        int sum=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+sum);
                sum=sum+1;
            }
            System.out.print("\n");
        }
    }
}
