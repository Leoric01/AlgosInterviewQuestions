package CodeWars;

public class MatrixAddition {
    //    https://www.codewars.com/kata/526233aefd4764272800036f
    public static int[][] sumTwoMatrix(int[][] a, int[][] b){
        if (a == null && b == null) return null;
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
