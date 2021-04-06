package com.company;
import obj.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String regex_name = "[A-Z]?[a-z]+";
        String regex_year = "[1940-2020]";
        String regex_address = "[A-Z]?[a-z]+, [A-Z]?[a-z]+";
       /* for(Person person : persons)
        {
            person = new Person();
            System.out.println("Get info of person №" + person.getCount());
            System.out.println("Name:");
            String name = br.readLine();
            person.setName(name);
            System.out.println("Birthday year:");
            int birthYear = Integer.parseInt(br.readLine());
            person.setBirthYear(birthYear);
            System.out.println("Address:");
            String address = br.readLine();
            person.setAddress(address);
            System.out.println(person);
        }*/

        for(int i = 0; i < persons.length; i++)
        {
            persons[i] = new Person();
            System.out.println("Get info of person №" + persons[i].getCount());

            System.out.println("Name:");
            String name = br.readLine();
            while(!name.matches(regex_name)) {
                System.out.println("Wrong input! Try again:");
                name = br.readLine();
            }
            persons[i].setName(name);
            System.out.println("Birthday year:");

            int birthYear = Integer.parseInt(br.readLine());
            while(birthYear < 1940 || birthYear > 2021) {
                System.out.println("Wrong input! Try again:");
                birthYear = Integer.parseInt(br.readLine());
            }
            persons[i].setBirthYear(birthYear);


            System.out.println("Address (Country, City):");
            String address = br.readLine();
            while(!address.matches(regex_address)) {
                System.out.println("Wrong input! Try again:");
                address = br.readLine();
            }
            persons[i].setAddress(address);

            persons[i].setNumber();

        }

        System.out.println("All registered persons: ");
        for(Person person : persons)
        {
            System.out.println(person);
        }

        System.out.println("Do you like to make some changes in name(Y/N): ");
        String choice = br.readLine();
        while(choice.charAt(0) == 'Y')
        {
            System.out.println("Enter number of person: ");
            int person_num = Integer.parseInt(br.readLine());
            System.out.println("Enter new name of person: ");
            String new_name = br.readLine();
            while(!new_name.matches(regex_name)) {
                System.out.println("Wrong input! Try again:");
                new_name = br.readLine();
            }
            persons[person_num - 1].changeName(new_name);
            System.out.println("Changed info: ");
            for(Person person : persons)
            {
                System.out.println(person);
            }
            System.out.println("Do you like to make some changes in name(Y/N): ");
            choice = br.readLine();
        }
    }
}
