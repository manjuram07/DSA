package Array_Data_Structures.com.dynamicProgramming;

import java.util.List;

public class PascalTriangle2 {

    public static void main(String[] args) {

        int rowIndex = 3;

        List<Integer> row = new java.util.ArrayList<>();

        for (int col=0; col <= rowIndex; col++){
                row.add(1);

            for (int i = col-1 ; i > 0 ; i--){
                row.set(i, row.get(i) + row.get(i-1));
            }
        }

        System.out.println(row);
    }
}
