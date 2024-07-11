/*
 Suma elementelor de pe diagonala principala si cea secundara;
 */


public class SumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - i - 1];
        }


        System.out.println("The sum of the elements on the primary diagonal is:  " + primaryDiagonalSum);
        System.out.println("The sum of the elements on the secundary diagonal is:  " + secondaryDiagonalSum);
    }
}



