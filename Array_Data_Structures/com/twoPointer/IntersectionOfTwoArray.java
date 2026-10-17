package Array_Data_Structures.com.twoPointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {

        int[] a = {1,2,2,1};
        int[] b = {2,2};

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0;
        Set<Integer> set = new HashSet<>();

        // Two pointer approach to find intersection of two arrays
        while (i<a.length && j<b.length){
            if (a[i] == b[j]){
                set.add(a[i]);
                i++;
                j++;
            }
            // If the current element in the first array is smaller, move the pointer in the first array forward
            else if (a[i]<b[j]){
                i++;
            }else {
                j++;
            }
        }

        for (int num:set){
            System.out.print(num+" ");
        }
    }
}
