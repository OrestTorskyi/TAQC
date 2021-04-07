package obj;

public enum Professions_Salaried {
    JUNIOR_QC,
    MIDDLE_QC,
    SENIOR_QC,
    TEAM_LEAD;

    public int getPayment()
    {
        if(this == JUNIOR_QC)
        {
            return 7;
        }
        else if(this == MIDDLE_QC)
        {
            return 15;
        }
        else if(this == SENIOR_QC)
        {
            return 25;
        }
        else
        {
            return 38;
        }
    }
}
