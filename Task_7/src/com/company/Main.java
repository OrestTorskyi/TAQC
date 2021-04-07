package com.company;

import obj.*;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Chicken();

        for(Bird bird : birds)
        {
            System.out.println(bird);
            bird.fly();
            System.out.println("-------------------------------------");
        }
    }
}
