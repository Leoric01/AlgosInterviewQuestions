package CodeWars;

public class DiagonalDifferenceArr {
    //    https://www.hackerrank.com/challenges/diagonal-difference/problem
    public static int solution(int[][] intArr) {
        if (intArr == null || intArr.length != intArr[0].length){
            return -1;
        }
        int result = 0;
        int diagonalSum = 0;
        for (int i = 0; i < intArr.length; i++) {
            diagonalSum += intArr[i][i];
            diagonalSum -= intArr[i][intArr.length - 1 - i];
        }
        result = Math.abs(diagonalSum);
        return result;
    }
}
