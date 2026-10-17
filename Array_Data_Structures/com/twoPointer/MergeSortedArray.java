package Array_Data_Structures.com.twoPointer;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9};

        int[] result = new int[a.length+b.length];
        int k=0;
        int i = 0;
        int j = 0;

        while (i<a.length && j<b.length){
            if (a[i] < b[j]){
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // If any elements are left in first array, add them to the result
        while (i < a.length){
            result[k++] = a[i++];
        }

        // If any elements are left in the second array, add them to the result
        while (j<b.length){
            result[k++] = b[j++];
        }

        for (int num : result){
            System.out.print(num+" ");
        }

    }
}
