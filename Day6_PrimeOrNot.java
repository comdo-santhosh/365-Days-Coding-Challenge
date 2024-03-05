public class Day6_PrimeOrNot {
    public static void main(String[] args) {
        int num  = 11;
        int count = 0;

        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                count++;
            }
        }
        boolean isprime = (count == 2) ? true : false;
        System.out.println(isprime);
    }    
}
