package Recursion;

public class PrimeNo {
    public static void prime( int j, int sum) {
        if (j == 1) {
            System.out.println(" Sum of factorial number j is" + sum);
            return;
        }
        sum =j*sum;
        prime( j-1, sum);
    }

    public static void main(String[] args) {
        prime( 5, 1);
    }
}
