package Array_Data_Structures.com.twoPointer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveAllZerosToEnd {


    public static void main(String[] args) {
        Map<String, Map<String, List<String>>> map = new HashMap<>();

        // create and populate the inner map, then put it into the outer map
//         Map<String, List<String>> inner = new HashMap<>();
//         inner.put("bengaluru", List.of("A", "B"));
//         map.put("A", inner);

        map.put("B", Map.of("bengaluru", List.of("C", "D")));

        System.out.println(map);


        int[] arr = {1, 2, 0, 4, 0, 3, 0, 5, 0};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}