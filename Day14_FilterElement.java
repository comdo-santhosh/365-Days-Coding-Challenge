
import java.util.*;
/**
 * Day14_FilterElement
 */

 // filtering array and removing the negative elements from array and only display the non-negative
public class Day14_FilterElement {

    public static void main(String[] args) {
        int arr[] = {12,-5,8,-2,17,-9};
        int count = 0;
        for(int i = 0 ; i  < arr.length; i++){
            if(arr[i] <0){
                continue;
            }
            else{
               count++;
            }
        }

        int newarray[] = new int[count];
        int j = 0;
        for(int i =0 ; i < arr.length-1; i++){
            if(arr[i]<0){
                continue;
            }else{
                newarray[j] = arr[i];
            }
            j++;
        }

        System.out.println(Arrays.toString(newarray));
    }
}