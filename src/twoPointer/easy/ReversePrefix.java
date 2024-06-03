package twoPointer.easy;

import java.util.ArrayList;

public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1) return word;

        char[] list = word.toCharArray();
        int left = 0;
        int right = index;

        while(left  < right) {
            char temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }
        return new String(list);
    }

    public static void main(String[] args) {
        String word = "abcdef";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }
}
