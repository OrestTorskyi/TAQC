package obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    private String name;
    private int birthYear;
    private String address;
    private int age;
    private int count = 0;



    public Person()
    {
        count++;
    }

    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
        count++;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public int getCount() {
        return count;
    }

    public void calculateYears()
    {
        System.out.println("Your age is: " + (2021 - birthYear));
    }

    //?????

    /*
    public void getInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(name.isEmpty()) {
            System.out.print("Your name: ");
            name = br.readLine();
        }
        if(birthYear == 0) {
            System.out.print("Your birthday year: ");
            birthYear = Integer.parseInt(br.readLine());
        }

        System.out.print("Your address: ");
        address = br.readLine();
    }
       */


    public void changeName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person №" + count +
                "\nName = " + name  +
                "\nBirthYear = " + birthYear +
                "\nAddress = " + address +
                "\nAge = " + age;
    }



}
