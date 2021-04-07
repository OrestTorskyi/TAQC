package com.company;

import obj.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[2];
        String regex_type = "Contract|Salaried";
        String regex_ftm = "Yes|No";
        int profession_number;
        String typeEmployee;

        String employeeID,federalTaxID;
        Professions_Contract profession;

        String socialSecurityNumber;
        Professions_Salaried profession_s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entering info about employees:");

        for(Employee employee : employees)
        {
            System.out.println("Type of employee(Contract\\Salaried): ");
            typeEmployee = br.readLine();
            while (!typeEmployee.matches(regex_type))
            {
                System.out.println("Wrong input! Try again:");
                typeEmployee = br.readLine();
            }
            if(typeEmployee == "Contract"){
                System.out.println("Employee ID: " );
                employeeID = br.readLine();
                System.out.println("Federal tax member?(Yes/No): " );
                federalTaxID = br.readLine();
                while (!federalTaxID.matches(regex_ftm))
                {
                    System.out.println("Wrong input! Try again:");
                    federalTaxID = br.readLine();
                }
                System.out.println("Enter number from list of professions: 1) Junior QC Engineer\n2)Middle QC Engineer\n3)Senior QC Engineer\n4)Team Lead");
                profession_number = Integer.parseInt(br.readLine());
                while (profession_number <= 0 || profession_number > 4)
                {
                    System.out.println("Wrong input! Try again:");
                    profession_number = Integer.parseInt(br.readLine());
                }
                profession = Professions_Contract.valueOf(String.valueOf(profession_number));
                employee = new ContractEmployee(employeeID,profession,federalTaxID);
            }
            else if(typeEmployee == "Salaried"){
                System.out.println("Employee ID: " );
                employeeID = br.readLine();
                System.out.println("Social Security Number: " );
                socialSecurityNumber = br.readLine();
                System.out.println("Enter number from list of professions: 1) Junior QC Engineer\n2)Middle QC Engineer\n3)Senior QC Engineer\n4)Team Lead");
                profession_number = Integer.parseInt(br.readLine());
                while (profession_number <= 0 || profession_number > 4)
                {
                    System.out.println("Wrong input! Try again:");
                    profession_number = Integer.parseInt(br.readLine());
                }
                profession_s = Professions_Salaried.valueOf(String.valueOf(profession_number));
                employee = new SalariedEmployee(employeeID,profession_s,socialSecurityNumber);
            }
        }

        for(Employee employee : employees)
        {
            System.out.println(employees);
        }
    }
}
