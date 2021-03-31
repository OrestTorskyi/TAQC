package com.company;
import tools.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter subtask: ");
        int choise = Integer.parseInt(br.readLine());
        //1)
        if(choise == 1) {
            System.out.print("Enter radius of flower bed: ");
            int radius = Integer.parseInt(br.readLine());
            FlowerBed fb = new FlowerBed(radius);
            System.out.println(fb);
        }
        //2)
        else if(choise == 2) {
            System.out.print("What is your name? ");
            String name = br.readLine();
            System.out.print("Where are you live, " + name + "? ");
            String address = br.readLine();
            System.out.println("User information: \nName: " + name + "\nAddress: " + address);
        }
        else if(choise == 3)
        {
            double[] c = new double[3];
            double[] t = new double[3];
            double[] payment = new double[3];
            double sum = 0;

            System.out.println("Enter phone call payment per minute (c1): ");
            c[0] = Double.parseDouble(br.readLine());
            System.out.println("Enter phone call payment per minute (c2): ");
            c[1] = Double.parseDouble(br.readLine());
            System.out.println("Enter phone call payment per minute (c3): ");
            c[2] = Double.parseDouble(br.readLine());

            System.out.println("Enter time of talk by phone call №1 (c1): ");
            t[0] = Double.parseDouble(br.readLine());
            System.out.println("Enter time of talk by phone call №2 (c2): ");
            t[1] = Double.parseDouble(br.readLine());
            System.out.println("Enter time of talk by phone call №3 (c3): ");
            t[2] = Double.parseDouble(br.readLine());

            for(int i = 0; i < payment.length; i++) {
                payment[i] = c[i]*t[i];
                sum += payment[i];
            }

            System.out.println("Payments by every call: " + Arrays.toString(payment));
            System.out.println("Sum of payments: " + sum);

        }
        else
        {
            System.out.println("Incorrect number. Try again.");
        }
    }
}
