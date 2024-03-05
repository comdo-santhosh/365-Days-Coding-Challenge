


public class Day4_AmstrongOrNot {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while (num >0) {
            int rem = num  % 10;            
            sum = sum + rem * rem * rem;
            num = num / 10;
        }        

        if(temp == sum){
            System.out.println(temp+" is an Amstrong Number");
        }else{
            System.out.println(temp+" is Not an Amstrong Number");
        }
    }    
}
