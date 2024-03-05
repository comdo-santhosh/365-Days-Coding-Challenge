public class Day7_FactorialOfNumber {

    public static long factorial(int num){
        if(num ==0 || num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        int num = 36;
        long res = factorial(num);
        System.out.println(res);
    }    
}
