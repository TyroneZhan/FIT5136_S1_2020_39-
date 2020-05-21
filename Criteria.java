public class Criteira
{
    private int ageMinimum;
    private int ageMaximum;
    private String qualifications;
    private int yearsOfWorkExp;
    private String occupations;
    private String healthRecord;
    private String criminalRecord;
    private String computerSkills;
    private String language;

    public Criteira()
    {
        ageMinimum = 0;
        ageMaximum = 120;
        qualifications = "";
        yearsOfWorkExp = 0;
        occupations = "";
        healthRecord = "";
        criminalRecord = "";
        computerSkills = "";
        language = "";
    }

    public void setAgeMinmum(int newMinAge)
    {
        ageMinimum = newMinAge;
    }

    public void setAgeMaximum(int newMaxAge)
    M
        ageMaximum = newMaxAge;
    }

    public void setQualifications(String newQualification)
    {
        qualifications = newQualification;
    }

    public void setYearsOfWorkExp(int newYearsOfWorkExp)
    {
        yearsOfWorkExp = newYearsOfWorkExp;
    }

    public void setOccupations(String newOccupations)
    {
        occupations = newOccupations;
    }

    public void setHealthRecord(String newHealthRecord)
    {
        healthRecord = newHealthRecord;
    }

    public void setCriminalRecord(Srting newCriminalRecord)
    {
        criminalRecord = newCriminalRecord;
    }

    public void setComputerSkill(String newCompuerSkill)
    {
        computerSkills = newCompuerSkill;
    }

    public void setLanguage(String newLanguage)
    {
        language = newLanguage;
    }

    public int getAgeMinmum()
    {
        return ageMinimum;
    }

    public int getAgeMaximum()
    {
        return ageMaximum;
    }

    public String getQualifications()
    {
        return  qualifications ;
    }

    public int getYearsOfWorkExp()
    {
        return  yearsOfWorkExp;
    }

    public String getOccupations()
    {
        return occupations;
    }

    public String getHealthRecord()
    {
        return healthRecord;
    }

    public String getCriminalRecord()
    {
        return criminalRecord;
    }

    public String getComputerSkill()
    {
        return computerSkills;
    }

    public String getLanguage()
    {
        return language;
    }
}
