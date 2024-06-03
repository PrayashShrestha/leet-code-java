package twoPointer.easy;

// 2108
public class PalindormStringInArray {
    public static String firstPalindrome(String[] words) {
        for(String word: words){
            if(checkPalindrome(word)) return word;
        }
        return "";
    }

    public static boolean checkPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words));
    }
}
