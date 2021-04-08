package com.company;

import obj.BackSystem;
import obj.Backpack;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Backpack[] backpacks = new Backpack[6];
        backpacks[0] = new Backpack(BackSystem.NONE);
        backpacks[1] = new Backpack(BackSystem.FOAMBACK, "Deuter", 30);
        backpacks[2] = new Backpack(BackSystem.NET, "LeadHiking");
        backpacks[3] = new Backpack(BackSystem.FOAMBACK, "Deuter", 45);
        backpacks[4] = new Backpack(BackSystem.NONE, "The North Face", 55);
        backpacks[5] = new Backpack(BackSystem.NET, "Terra Incognita", 30);

        List<Integer> objects = new ArrayList<>();
        String str_add = "Yes";


        for(Backpack backpack : backpacks)
        {
            System.out.println(backpack);
        }
        System.out.println("----------------------------------------------------");
        try {
            while(str_add.toUpperCase().equals("YES"))
            {
                System.out.println("Enter capacity of your object: ");
                objects.add(Integer.parseInt(br.readLine()));
                System.out.println("Do you have more objects?(Yes/No)");
                str_add = br.readLine();

            }
        }catch (IOException e){
            e.getMessage();
        }
        for(Backpack backpack : backpacks)
        {
            System.out.println("-----------------------------------------------");
            System.out.print("Let's try " + backpack + "\n");
            backpack.fitToBackpack(objects);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Do you like to get our recommendation?(Yes/No)");
        try{
            if(br.readLine().toUpperCase().equals("YES"))
            {
                System.out.println("From all list of backpacks we recommended you to buy this: " + Backpack.getBestBackpackFromList(backpacks));
                System.out.println("Have a good day:)");
            }
            else
            {
                System.out.println("Have a good day:)");
            }
        }catch (IOException e)
        {
            e.getMessage();
        }
        System.out.println("----------------------------------------------------");


    }
}
