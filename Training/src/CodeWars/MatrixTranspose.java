package CodeWars;

public class MatrixTranspose {
    //    https://www.codewars.com/kata/52fba2a9adcd10b34300094c
    public static int[][] transpose(int[][] a) {
        int[][] transposedArr = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                transposedArr[j][i] = a[i][j];
            }
        }
        return transposedArr;
    }
}
