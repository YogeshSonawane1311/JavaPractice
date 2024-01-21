package Recursion;
//Time Complexity is O(2^n)  two recursive function used

public class Chinease {
    public static void paraTravel(int n, String src , String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        paraTravel(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        paraTravel(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        //int n=1;
        int n=2;
        paraTravel(n,"S", "H", "D");
    }
}
