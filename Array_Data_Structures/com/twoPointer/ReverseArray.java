package Array_Data_Structures.com.twoPointer;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2,3,5,8};
        int target = 7;

        int left = 0;
        int right = arr.length-1;
        boolean flag= false;

        while(left < right){
            if (arr[left] + arr[right] > target){
                right --;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                System.out.println(left+" "+ right);
                flag= true;
                break;
            }
        }

        if (!flag){
            System.out.println("Element not found.");
        }


//        int[] arr = {1, 2, 0, 4, 0, 3, 0, 5, 0};
//
//        int right = arr.length-1;
//
//        for (int i=arr.length-1; i>=0; i--){
//            if (arr[i] != 0){
//                arr[right] = arr[i];
//                right--;
//            }
//        }
//
//        while (right >= 0){
//            arr[right] = 0;
//            right--;
//        }
//
//        for (int val : arr){
//            System.out.print(val+ " ");
//        }
    }
}
