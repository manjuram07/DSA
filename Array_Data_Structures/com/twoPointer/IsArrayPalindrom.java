package Array_Data_Structures.com.twoPointer;

public class IsArrayPalindrom {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1};

        int left =0, right=arr.length-1;
        boolean flag = false;

        while (left < right) {
            if (arr[left] == arr[right]){
                left++;
                right--;
            } else {
                System.out.println("Not a Palindrome.");
                flag=true;
                break;
            }
        }

        if (!flag){
            System.out.println("It is a Palindrome.");
        }
    }
}
