public class Day2_CountDigits {
    
    public static int Digit(long Num){
        int counts = 0;
        while (Num>0) {
            Num = Num / 10;
            counts++;
        }
        return counts;
    }
    public static void main(String[] args) {
        long num = 9087093403l;
        int res = Digit(num);
        System.out.println(res);
        System.out.println((int)Math.log10(num)+1);
    }    
}
