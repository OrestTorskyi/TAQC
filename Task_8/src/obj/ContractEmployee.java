package obj;

import Interfaces.CalculatePay;

public class ContractEmployee extends Employee implements CalculatePay {

    private String federalTaxID;
    private int payment;
    private Professions_Contract profession;
    public ContractEmployee(String employeeid, Professions_Contract profession)
    {
        super(employeeid);
        this.profession = profession;
        this.payment = profession.getPayment();
    }

    public ContractEmployee(String employeeid, Professions_Contract profession, String federalTaxID)
    {
        super(employeeid);
        this.profession = profession;
        this.payment = profession.getPayment();
        this.federalTaxID = federalTaxID;
    }

    public void setFederalTaxID(String federalTaxID) {
        this.federalTaxID = federalTaxID;
    }

    public String getFederalTaxID() {
        return federalTaxID;
    }


    @Override
    public void countPayment(int bonuses)
    {
        payment = payment + bonuses;
    }


    @Override
    public String toString() {
        return "Employee №" + count + "Type: Contract" +
                "\nFederal Tax Member ='" + federalTaxID +
                "\nPayment = " + payment + "per month" +
                "\nProfession: " + profession;
    }
}
