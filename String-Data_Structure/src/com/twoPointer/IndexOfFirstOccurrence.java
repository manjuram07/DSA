package com.twoPointer;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {

        String haystack = "leetcode";
        String needle = "code";

        for (int i=0; i<haystack.length()-needle.length()+1; i++){

            if (haystack.charAt(i) == needle.charAt(0)){
                if (haystack.substring(i,needle.length()+i).equals(needle)){
                    System.out.println(i);
                    return;
                }
            }
        }

        System.out.println("-1");

    }
}
