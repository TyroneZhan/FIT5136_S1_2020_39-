public class EmploymentRequirement {
    private title String;
    private numberOfEmployee Int;

    public EmploymentRequirement()
    {
        String title = "";
        int numberOfEmployee = 0;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public void setnumberOfEmployee(int newnumberOfEmployee)
    {
        numberOfEmployee = newnumberOfEmployee;
    }
    public String getTile()
    {
        return title;
    }
    public int getnumberOfEmployee()
    {
        return numberOfEmployee;
    }
}
