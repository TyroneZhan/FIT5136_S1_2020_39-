public class Mission
{
	// Instance variable
	private String name;
	private String missionDescription;
	private String countryOfOrigin;
	private String countriesAllowed;
	private String coordinatorName;
	private String coordinatorContact;
	private String cargoRequirement;
	private String launchDate;					//// FIX THIS PART
	private String coordinateOfDestination; 
	private String addressOfDestination;
	private Int duration;
	private String status;  

	public Mission(
		String name, 
		String missionDescription, 
		String countryOfOrigin, 
		String countriesAllowed,
		String coordinatorName,
		String coordinatorContact
		String cargoRequirement,
		String launchDate,
		String coordinateOfDestination,
		String addressOfDestination,
		Int duration,
		String status)
	{
		this.name = name;
		this.missionDescription = missionDescription;
		this.countryOfOrigin = countryOfOrigin;
		this.countriesAllowed = countriesAllowed;
		this.coordinatorName = coordinatorName;
		this.coordinatorContact = coordinatorContact;
		this.cargoRequirement = cargoRequirement;
		this.launchDate = launchDate;
		this.coordinateOfDestination = coordinateOfDestination;
		this.addressOfDestination = addressOfDestination;
		this.duration = duration;
		this.status = status;
	}

	// Set methods
	public void setName(String name)
	{
		this.name = newName;
	}

	public void setMissionDescription(String missionDescription)
	{
		this.missionDescription = missionDescription;
	}

	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}

	public void setCountriesAllowed(String countriesAllowed)
	{
		this.countriesAllowed = countriesAllowed;
	}

	public void setCoordinatorName(String coordinatorName)
	{
		this.coordinatorName = coordinatorName;
	}

	public void setCoordinatorContact(String coordinatorContact)
	{
		this.coordinatorContact = coordinatorContact;
	}

	public void setCargoRequirement(String cargoRequirement)
	{
		this.cargoRequirement = cargoRequirement;
	}

	public void setLaunchDate(String launchDate)
	{
		this.launchDate = launchDate;
	}

	public void setCoordinateOfDestination(String coordinateOfDestination)
	{
		this.coordinateOfDestination = coordinateOfDestination;
	}

	public void setAddressOfDestination(String addressOfDestination)
	{
		this.addressOfDestination = addressOfDestination;
	}

	public void setDuration(Int duration)
	{
		this.duration = duration;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	// Get methods

		public void getName()
	{
		return name;
	}

	public String getMissionDescription()
	{
		return missionDescription;
	}

	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	public String getCountriesAllowed()
	{
		return countriesAllowed;
	}

	public String getCoordinatorName()
	{
		return coordinatorName;
	}

	public String getCoordinatorContact()
	{
		return coordinatorContact;
	}

	public String getCargoRequirement()
	{
		return cargoRequirement;
	}

	public String getLaunchDate()
	{
		return launchDate;
	}

	public String getCoordinateOfDestination()
	{
		return coordinateOfDestination;
	}

	public String getAddressOfDestination()
	{
		return addressOfDestination;
	}

	public Int getDuration()
	{
		return duration;
	}

	public String getStatus()
	{
		return status;
	}

}