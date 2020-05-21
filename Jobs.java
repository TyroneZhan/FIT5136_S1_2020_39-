public class Jobs {
    private jobName String;
    private jobDescription String;

    public Jobs()
    {
        String jobName = "";
        String jobDescription = "";
    }

    public void setjobName(String newjobName)
    {
        jobName = newjobName;
    }
    public void setjobDescription(String newjobDescription)
    {
        jobDescription = newjobDescription;
    }
    public String getjobName()
    {
        return jobName;
    }
    public String getjobDescription()
    {
        return jobDescription;
    }
}
