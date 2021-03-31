package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int n = Integer.parseInt(br.readLine());
        int n_pow = (int)Math.pow(n,2);
        String str = String.valueOf(n_pow);

        // a)
        if(str.contains("3")) {
            System.out.println("Square number of n has '3'");
        }
        else {
            System.out.println("Square number of n hasn't '3'");
        }

        // b)
        StringBuilder str_reverse = new StringBuilder(str);
        str_reverse.reverse();
        System.out.println("Reverse number: " + str_reverse);

        // c)
        int number_length = str.length();
        char first = str.charAt(0);
        char last = str.charAt((str.length() - 1));
        StringBuilder str_replace = new StringBuilder(str);
        str_replace.setCharAt(0,last);
        str_replace.setCharAt(str.length() - 1, first);
        System.out.println("Changed first and last numbers: " + str_replace.toString());

        // d)
        String str_add = "1".concat(str.concat("1"));
        System.out.println("Adding number '1' in start and end of number: " + str_add);

    }
}
