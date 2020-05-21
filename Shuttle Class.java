public class Shuttle
{
	// Instance variables
	private String name;
	private int manufacturingYear;
	private int fuelCapacity;
	private int cargoCapacity;
	private int travelSpeed;
	private int payloadCap;

	public Shuttle(
		String name,
		int manufacturingYear,
		int fuelCapacity,
		int cargoCapacity,
		int travelSpeed,
		int payloadCap,
		)
	{
		this.name = name;
		this.manufacturingYear = manufacturingYear;
		this.fuelCapacity = fuelCapacity;
		this.cargoCapacity = cargoCapacity;
		this.travelSpeed = travelSpeed;
		this.payloadCap = payloadCap;
	}

	// Set methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setManufacturingYear(int manufacturingYear)
	{
		this.manufacturingYear = manufacturingYear;
	}

	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}

	public void setCargoCapacity(int cargoCapacity)
	{
		this.cargoCapacity = cargoCapacity;
	}

	public void setTravelSpeed(int travelSpeed)
	{
		this.travelSpeed = travelSpeed;
	}

	public void setPayloadCap(int payloadCap)
	{
		this.payloadCap = payloadCap;
	}

	// Get methods

	public String setName()
	{
		this.name = name;
	}

	public int setManufacturingYear()
	{
		return manufacturingYear;
	}

	public int setFuelCapacity()
	{
		return fuelCapacity;
	}

	public int setCargoCapacity()
	{
		return cargoCapacity;
	}

	public int setTravelSpeed()
	{
		return travelSpeed;
	}

	public int setPayloadCap()
	{
		return payloadCap;
	}

}