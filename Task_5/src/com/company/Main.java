package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import subtasks.*;

public class Main {

    public static void main(String[] args) throws IOException{

        Task_5_1 task1 = new Task_5_1();
        float [] array1 = new float[3];
        int [] array2 = new int[3];
        int httpNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Tasks:\n1)Input 3 float numbers and check if they are in range[-5,5]" +
                "\n2)Maximum and minimum element in array of 3 integer numbers" + "\n3)Description of HTTP Error"
                + "\n4)Go to next task"+ "\nTask number: ");
        switch(Integer.parseInt(br.readLine())){
            case 1:
                for(int i = 0; i < array1.length; i++) {
                    System.out.println("Enter number №" + (i + 1) + ": ");
                    array1[i] = Float.parseFloat(br.readLine());
                }
                task1.isInRange(array1);
                break;
            case 2:
                for(int i = 0; i < array2.length; i++)
                {
                    System.out.println("Enter number №" + (i+1) + ": ");
                    array2[i] = Integer.parseInt(br.readLine());
                }
                task1.minMaxElement(array2);
                break;
            case 3:
                System.out.println("Enter number of Http error, which you find:");
                httpNumber = Integer.parseInt(br.readLine());
                task1.getHttpDescription(httpNumber);
                break;
            case 4:
                Dog[] dogs = new Dog[3];

                dogs[0] = new Dog("Bobik",Breed.AKITA, 12);
                dogs[1] = new Dog("Bobik",Breed.BEAGLE, 5);
                dogs[2] = new Dog("Chappy",Breed.SHEPHERD, 7);

                System.out.println("--------------All registered dogs-------------------");
                for(Dog dog : dogs)
                {
                    System.out.println(dog);
                    System.out.println("----------------------------------------------");
                }
                System.out.println("----------------------------------------------");
                System.out.println("Has the same name?");
                Dog.hasSameName(dogs);
                System.out.println("----------------------------------------------");
                System.out.println("The oldest dog:");
                Dog oldest_dog = Dog.oldestDog(dogs);
                System.out.println(oldest_dog);
                break;
        }




  }
}
