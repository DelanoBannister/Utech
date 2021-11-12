package groupproject;

public class Customer
{
	private String TRN;
	public final String getTRN()
	{
		return TRN;
	}
	public final void setTRN(String value)
	{
		TRN = value;
	}
	private String FirstName;
	public final String getFirstName()
	{
		return FirstName;
	}
	public final void setFirstName(String value)
	{
		FirstName = value;
	}
	private String LastName;
	public final String getLastName()
	{
		return LastName;
	}
	public final void setLastName(String value)
	{
		LastName = value;
	}
	private Address MailingAddress;
	public final Address getMailingAddress()
	{
		return MailingAddress;
	}
	public final void setMailingAddress(Address value)
	{
		MailingAddress = value;
	}
	private String Telephone;
	public final String getTelephone()
	{
		return Telephone;
	}
	public final void setTelephone(String value)
	{
		Telephone = value;
	}
	private String ServiceProvider;
	public final String getServiceProvider()
	{
		return ServiceProvider;
	}
	public final void setServiceProvider(String value)
	{
		ServiceProvider = value;
	}
	private double Balance;
	public final double getBalance()
	{
		return Balance;
	}
	public final void setBalance(double value)
	{
		Balance = value;
	}


}