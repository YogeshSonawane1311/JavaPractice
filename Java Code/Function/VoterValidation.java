package Function;
import java.util.*;


import java.util.Scanner;

public class VoterValidation {
    

    public static void vote(int n1){
        if(n1>18){
            System.out.println(" You can Vote Now");
        }
        else{
            System.out.println("You are not available for vote");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        vote(n);;
    }
}
