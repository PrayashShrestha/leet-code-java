package twoPointer.easy;

// 2697
public class LexicographicPalindrome {
    public static String makeSmallestPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while(start < end) {
            if(chars[start] != chars[end]){
                if(chars[start] < chars[end]){
                    chars[end] = chars[start];

                }else{
                    chars[start] = chars[end];
                }
            }
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "ay";
        System.out.println(makeSmallestPalindrome(s));
    }
}
