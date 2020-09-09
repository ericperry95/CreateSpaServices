// exersize on page 148- 149

import java.util.Scanner;

public class CreateSpaServices 
{
	public static void main(String[] args) 
	{
	
		// variable and constants
			
		String service;
		double price;
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		
		// input phase for firstService object

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter Service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();

		// calculation phase for firstService

		firstService.setServiceDescription(service);
		firstService.setPrice(price);

		// input phase for secondService object 
		// buffer to consume the last ENTER that was pressed

		keyboard.nextLine();
		System.out.print("Please enter the second service >> ");
		service = keyboard.nextLine();
		System.out.print("Please enter the second price >> ");
		price = keyboard.nextDouble();

		// calculation phase for secondSerice 

		secondService.setServiceDescription(service);
		secondService.setPrice(price);

		//output phase for both SpaService objects

		System.out.println("First service details: ");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

		System.out.println("Second service details: ");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

		
	}
}