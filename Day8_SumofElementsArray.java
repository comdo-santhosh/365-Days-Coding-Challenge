


public class Day8_SumofElementsArray {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,8,7,1,2,4,3,6,2,3,5,5,5,1,2,3,4,9,7,5,6};
        int sum = 0;
        if(arr.length <0){
            System.out.println(-1);
        }else{
            for(int i = 0; i < arr.length; i++){
                sum += arr[i];

            }
        }     
        System.out.println(sum);
    }    
}
