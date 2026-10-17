package com.twoPointer;

public class LongestPalindromicSubString {
    public static void main(String[] args) {

        String s = "babad";
        String longestPalindrome = longestPalindrome(s);
        System.out.println(longestPalindrome);
    }

    private static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int len1 = expandFromCenter(s, i, i);

            // Even length palindrome
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right) {

        while (left >= 0
                && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
