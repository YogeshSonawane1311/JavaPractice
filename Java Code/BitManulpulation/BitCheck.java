package BitManulpulation;

public class BitCheck {
    public static void main(String[] args) {
        int a=5;
        int BitMask = 1<<a;
        if((BitMask&a)==0){
            System.out.println("Bit Was Zero");
        }else{
            System.out.println("Bit Was Not Zero");

        }
    }
}
