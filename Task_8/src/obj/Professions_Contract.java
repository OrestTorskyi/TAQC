package obj;

public enum Professions_Contract {
    JUNIOR_QC(1),
    MIDDLE_QC(2),
    SENIOR_QC(3),
    TEAM_LEAD(4);

    private int number;

    private Professions_Contract(int number)
    {
        this.number = number;
    }

    public int getPayment()
    {
        if(this == JUNIOR_QC)
        {
            return 400;
        }
        else if(this == MIDDLE_QC)
        {
            return 1000;
        }
        else if(this == SENIOR_QC)
        {
            return 2450;
        }
        else
        {
            return 3100;
        }
    }
}
