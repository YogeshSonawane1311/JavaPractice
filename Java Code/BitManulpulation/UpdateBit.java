package BitManulpulation;

public class UpdateBit {
    public static void main(String[] args) {
        int n =5;
        int pos = 1;
        int oper =1;
        int bitMask = 1<<pos;
        //set oper
        if(oper ==1){
            //set
            int newNumber =bitMask | n;
            System.out.println(newNumber);

        }
        else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
