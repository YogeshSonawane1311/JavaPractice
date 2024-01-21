package BitManulpulation;

public class ClearBit {
    public static void main(String[] args) {
        int a =5;
        int pos =2;
        int BitMask = 1<<pos;
        int NotBitMask = ~(BitMask);

        int newNumber = (NotBitMask&a);
        System.out.println(newNumber);

    }
}
