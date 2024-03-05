

public class Day12_SearchElementArray {
    public static int index(int arr[],int i){
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == i){
                return j;
            }
        }

        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int arr[]  = {12,6,7,34,98,26,72};
        int search  = 98;
        int result = index(arr,search);
        System.out.println(result);
    }   
}
