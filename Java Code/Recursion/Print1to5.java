package Recursion;


public class Print1to5 {
    public static void print(int i,int j,int sum){
        if(i==j){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        System.out.println(i);
        print(i+1,j,sum);
    }
    public static void main(String[] args) {
        //Print Number from 1 to 10;
        print(1, 5,0);
    }
}
