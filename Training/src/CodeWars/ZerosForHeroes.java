package CodeWars;

public class ZerosForHeroes {
//    https://www.codewars.com/kata/570a6a46455d08ff8d001002
    public static int solution(int x) {
        //stupid solution to practice work with Strings

        /*int result = 0;
        String s = String.valueOf(x);
        if (x == 0) {
            return result;
        }
        if (s.charAt(s.length()-1) !='0'){
            return x;
        }

        while (s.charAt(s.length()-1) == '0'){
            s = s.substring(0,s.length()-1);
        }
        return Integer.valueOf(s);*/

        // legit solution
        while (x % 10 == 0) {
            x /= 10;
        }
        return x;
    }
}

