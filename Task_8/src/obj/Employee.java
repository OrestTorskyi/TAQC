package obj;

public class Employee {
    public String employeeid;
    public static int count;

    public Employee(String employeeid)
    {
        count++;
        this.employeeid = employeeid;

    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeid() {
        return employeeid;
    }


    @Override
    public String toString() {
        return "Employee №" + count + "\nEmployee ID ='" + employeeid + '\n';
    }
}
