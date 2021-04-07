package obj;

import Interfaces.CalculatePay;

public class SalariedEmployee extends Employee implements CalculatePay {

    private String socialSecurityNumber;
    private int workingHours, hourPayment,countPayment;

    private Professions_Salaried profession;

    public SalariedEmployee(String employeeID, Professions_Salaried profession)
    {
        super(employeeID);
        this.profession = profession;
        this.hourPayment = profession.getPayment();
    }

    public SalariedEmployee(String employeeID, Professions_Salaried profession, String socialSecurityNumber)
    {
        super(employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
        this.profession = profession;
        this.hourPayment = profession.getPayment();
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    @Override
    public void countPayment(int workingHours)
    {
        countPayment = workingHours * hourPayment;
    }


    @Override
    public String toString() {
        return "Employee №" + count + "Type: Salaried" +
                "\nSocial Security Number =" + socialSecurityNumber +
                "\nPayment per hour = " + hourPayment +
                "\nProfession: " + profession +
                "\nPayment sum = " + countPayment;
    }

}
