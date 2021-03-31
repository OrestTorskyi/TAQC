package com.company;
import obj.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(Person person : persons)
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
        }

        for(Person person : persons)
        {
            System.out.println(person);
        }
    }
}
