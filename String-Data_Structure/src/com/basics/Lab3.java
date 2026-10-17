package com.basics;

public class Lab3 {
    public static void main(String[] args) {

        String s1 = new String("Java");

        String s2 = s1;

        s1 = "Java";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);

    }
}
