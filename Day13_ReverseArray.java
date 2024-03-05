import java.util.Arrays;

public class Day13_ReverseArray {

    public static void reverse(int arr[]){
        for(int i = 0 ; i < arr.length / 2; i++){
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i -1]= arr[i] ; 
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
    int arr[] =  {17,24,38,42,57,62,75,82,94,275};
    reverse(arr);
    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));

 }   
}
