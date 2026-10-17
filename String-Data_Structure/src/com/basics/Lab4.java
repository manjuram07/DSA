package com.basics;

public class Lab4 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));

        String s1 = new String("Java");
        String s2 = new String("Spring");

        s1 = s2;
        s2 = null;
        s1 = null;

        System.out.println(s1);

    }
}
