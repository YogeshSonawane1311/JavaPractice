package String;

public class ReverseString {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String sb = new String("Tony");
        String sc = new String();
        int len =sb.length();
        for(int i=0;i<len/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.t(front,backChar);
            sb.setCharAt(back,frontChar);
        }
    }
}
