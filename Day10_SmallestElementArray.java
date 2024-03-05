import java.util.Arrays;


public class Day10_SmallestElementArray {
    public static void main(String[] args) {
        int arr[]  = {5,43,722,216,84,251638,268,39,-6583,3251,165845,678567,15,967,12527,16757453,4563,87365,-25,346,-245,7,-346,-4,50,0};

        // Arrays.sort(arr);

        // System.out.println(arr[0]);

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[0] > arr[i]){
                arr[0] = arr[i];
            }
        }
        
        System.out.println(arr[0]);
    }    
}
