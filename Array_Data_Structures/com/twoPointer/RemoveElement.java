package Array_Data_Structures.com.twoPointer;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 3};
        int val = 3;

        int left=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] != val){
                arr[left] = arr[i];
                left++;
            }
        }

        for (int i=0; i<left; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
