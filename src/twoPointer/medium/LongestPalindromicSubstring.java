package twoPointer.medium;

// 5
public class LongestPalindromicSubstring {
    private int longestLength;
    private String longestPalindrome;

    public String longestPalindrome(String s) {
       for(int i = 0; i < s.length(); i++) {
           // get the max palindrome
           getLongestLengthFromMid(s, i, i); // for the odd length
           getLongestLengthFromMid(s, i, i+1);  // for the even length
       }
       return longestPalindrome; // it's going to be set in another function
    }

    // function to get the palindrome from the mid
    public void getLongestLengthFromMid(String s, int left, int right) {
        int length;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        length = right - left - 1;
        if(length > longestLength) {
            longestLength = length;
            longestPalindrome = s.substring(left+1, right);
        }
    }


    public static void main(String[] args) {
        String s = "racrcar";
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(s));
    }
}
