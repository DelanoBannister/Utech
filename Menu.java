package groupproject;

import java.util.Scanner;

public class Menu
{
	Scanner input= new Scanner(System.in);
	public static void main(String[] args)
	{	
		login display = new login();
		display.Auth();
		//Menu display= new Menu();
		//display.ShowMainMenu(2);
	}	
	
	public final void ShowMainMenu(int c)
	{
		int choice;  
		login display = new login();
		System.out.println("********************************************");
		System.out.println("*           Welcome to Main Menu           *");
		System.out.println("********************************************");
		System.out.println("* 1.       Company Information             *");
		System.out.println("* 2. 	     Create Customer               *");
		System.out.println("* 3.     Show All Customers in Company     *");
		System.out.println("* 4.         Create Phone Card             *");
		System.out.println("* 5.      Show All Phone Cards in Company  *");
		System.out.println("* 6. 			Quit/Exit                  *");
		System.out.println("********************************************");
		do {
		    System.out.println("Please enter a positive number!");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next();
		    }
		  choice = input.nextInt();
		} while (choice <= 0);
		
		while (choice != 7)
		{
			switch (choice)
			{
				case 1:
					
					break;

				case 2:
					Program.CreateCustomer(c);
					break;

				case 3:
					Program.ShowAllCustomer(c);
					break;
					
				case 4:
					Program.CreatePhoneCard(c);
					break;
					
				case 5:
					Program.ShowAllPhone(c);
					break;
					
				case 6:
					display.Auth();
					break;
			}

		}
	}

	public final void CustomerMenu(int c)
	{
		int choice;
		login display = new login();
		 
		System.out.println("********************************************");
		System.out.println("*           Welcome to CUSTOMER Menu    *");
		System.out.println("********************************************");
		System.out.println("* 1. Return to Main Menu                   *");
		System.out.println("* 2. Add Credit to Phone                   *");
		System.out.println("* 3. Check Balance on Account              *");
		System.out.println("********************************************");
		do {
		    System.out.println("Please enter a positive number!");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); // this is important!
		    }
		  choice = input.nextInt();
		} while (choice <= 0);
		System.out.println(choice);
		CreditProcessor credit= new CreditProcessor();
		while (choice != 5)
		{
			switch (choice)
			{
				case 1:
					display.Auth();
					break;

				case 2:
					credit.AddCredit(c);
					break;

				case 3:
					credit.CheckBalance(c);
					break;
			}

		}
	}
}