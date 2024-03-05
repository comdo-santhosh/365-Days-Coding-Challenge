public class Day3_ReversetheNumber {
    public static void Reverse(int num){
        int sum = 0;
        while (num>0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 90870934;
        Day3_ReversetheNumber.Reverse(num);       
    }    
}
