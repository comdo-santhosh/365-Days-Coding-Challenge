/**
 * Day1_PalindromeOrNot
 */
public class Day1_PalindromeOrNot {
    public static String ispalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        int count = 0;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                count++;
            }
            start++;
            end--;

        }

      if(count == str.length() / 2)
             return "Entered String is Palindrome";
    return "Entered String is Not palindrome";
    }
    public static void main(String[] args) {
        String str = "123456789987654321";
        String res = ispalindrome(str);
        System.out.println(res);
    }
}