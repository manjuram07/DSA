package Array_Data_Structures.com.pattern;

public class ButterflyStarPattern {
    public static void main(String[] args) {

//        int n = 4;
//
//        for (int row=1; row<=n; row++){
//            for (int col=1; col<=2*n; col++){
//                if (col > row && col <= 2*n-row){
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//
//            System.out.println();
//        }
//
//        for (int i = n-1; i >= 1; i--) {
//            for (int j = 1; j <= 2 * n; j++) {
//
//                // To print spaces
//                if (j > i && j <= 2 * n - i) {
//                    System.out.print(" ");
//                }
//
//                // To print stars
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        int n = 6;
        for (int row=0; row<n; row++){
            for (int col=0; col<n; col++){
                if (col == row ||                             // Main Diagonal
                        col == n - 1 - row ||                     // Anti-Diagonal
                        (row % 2 == 0 && (col == 0 || col == n - 1)) || // Outer edges on even rows
                        (row % 2 != 0 && (col == 1 || col == n - 2)))
                { // Inner edges on odd rows

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
