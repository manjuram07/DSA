package Array_Data_Structures.com.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int numRows = 6;

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    current.add(1);
                } else {
                    int value = (triangle.get(row - 1).get(col - 1)) + (triangle.get(row - 1).get(col));
                    current.add(value);
                }
            }

            triangle.add(current);
        }
        System.out.println(triangle);

    }
}

/*

row 0 → [1]
row 1 → [1, 1]
row 2 → [1, 2, 1]
row 3 → [1, 3, 3, 1]

*/