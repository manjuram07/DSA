package Array_Data_Structures.com.twoPointer;

import java.util.Arrays;

public class RemoveAllOccurrencesOfElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int ele = 3;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != ele) {
                arr[k] = arr[i];
                k++;
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}


