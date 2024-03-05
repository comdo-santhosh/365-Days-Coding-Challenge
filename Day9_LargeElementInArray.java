import java.util.Arrays;

public class Day9_LargeElementInArray {
    public static void main(String[] args) {
        int arr[]  = {17,4,1219,273,475,659,122,788,341,685};

        // Arrays.sort(arr);

        // System.out.println(arr[arr.length-1]);

        for(int i = 0 ;i < arr.length - 1; i++){
            if(arr[0] < arr[i]){
                arr[0] = arr[i];
            }
        }
        System.out.println(arr[0]);
    }    
}
