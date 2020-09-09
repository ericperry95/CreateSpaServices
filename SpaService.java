// exersize on 144-145 

public class SpaService 
{

	// data field variables for this class 

	private String serviceDescription;
	private double price;

	// new constructor method for this class
	public SpaService()
	{
		serviceDescription = "XXXX";
		price = 0;
	}

	// mutator (setter) methods for this class

	public void setServiceDescription(String service)
	{
		serviceDescription = service;
	}

	public void setPrice(double servicePrice)
	{
		price = servicePrice;
	}

	// accessor (getter) methods for this class
	
	public String getServiceDescription()
	{
		return serviceDescription;
	}

	public double getPrice()
	{
		return price;
	}
}