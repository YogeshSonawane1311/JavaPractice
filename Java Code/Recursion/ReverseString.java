package Recursion;

public class ReverseString {
    public static void reverse(String name,int index){
        if(index==0){
            return;
        }
        reverse(name,index-1);
    }
    public static void main(String[] args) {
        String name = "Yogesh";
        reverse(name);
    }
}
