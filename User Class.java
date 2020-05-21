public class User
{
	// Instance variable
	private String name;
	private Int userID;
	private String password;
	private String email;
	private Int phone;
	private String userAddress;
	private String privilege;

	public User(
		String name,
		Int userID,
		String password,
		String email,
		Int phone,
		String userAddress,
		String privilege)
	{
		this.name = name;
		this.userID = userID;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.userAddress = userAddress;
		this.privilege = privilege;
	}

	// Set methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setUserID(Int userID)
	{
		this.userID = userID;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setPhone(Int phone)
	{
		this.phone = phone;
	}

	public void setUserAddress(String userAddress)
	{
		this.userAddress = userAddress;
	}

	public void setPrivilege(String privilege)
	{
		this.privilege = privilege;
	}

	// Get methods
	public String getName()
	{
		return name;
	}

	public Int getUserID()
	{
		return userID;
	}

	public String getPassword()
	{
		return password;
	}

	public String getEmail()
	{
		return email;
	}

	public Int getPhone()
	{
		return phone;
	}

	public String getUserAddress()
	{
		return userAddress;
	}

	public String getPrivilege()
	{
		return privilege;
	}
}