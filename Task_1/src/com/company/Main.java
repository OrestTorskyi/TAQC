package com.company;
import tools.Brick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------------------Creating Brick-------------------------");
        System.out.print("Enter length of brick (a): ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter width of brick (b): ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Enter height of brick (c): ");
        int c = Integer.parseInt(br.readLine());
        System.out.println("---------------------------Creating Window------------------------");
        System.out.print("Enter length of window (x): ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter width of window (y): ");
        int y = Integer.parseInt(br.readLine());
        Brick comparing = new Brick(a,b,c,x,y);
        comparing.toString();
        comparing.compareBrickToWindow();
    }
}
