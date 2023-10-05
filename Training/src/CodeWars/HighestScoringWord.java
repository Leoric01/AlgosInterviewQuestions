package CodeWars;

public class HighestScoringWord {
    //    https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
    public static String high(String s) {
        String[] words = s.split(" ");
        int topScore = 0;
        String result = "";
        for (String word : words) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c-'a'+1;
            }
            if (score > topScore) {
                topScore = score;
                result = word;
            }
        }
        return result;
    }
}

