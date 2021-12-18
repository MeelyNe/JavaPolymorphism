package com.company.used;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "Let's travel abroad shall we";
        System.out.println(findShort(s));
    }

    private static int findShort(String s) {
         int mn = Integer.MAX_VALUE;
        int it = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                mn = Math.min(mn, it);
                it = 0;
            }
            else {
                it++;
            }
        }
        return mn;
    }
}