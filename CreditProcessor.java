package groupproject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CreditProcessor
{
	public final void AddCredit(int c)
	{
		FileProcessor fileProcessor = new FileProcessor();
		PhoneCard Phone = new PhoneCard();
		Customer customer = new Customer();
		Scanner f = new Scanner(System.in);
		Menu home = new Menu();
		
		System.out.print("TRN: ");
		String trn = f.nextLine();
		//Get Customer by telephone number
		if (c == 1) {
			 customer = fileProcessor.DigicelGetCustomerByTrn(trn);
	      }
	      else if(c == 2) {
	    	 customer = fileProcessor.FlowGetCustomerByTrn(trn);
	      }
		String prefix = "";
		String number = "";
		String end = "";
			//customer.Balance += creditAmount;
		int q=0;
		while(q==0) 
		{
			System.out.print("Please input the credit method ");
			String credit = f.nextLine();
	
			for (int i = 0; i < credit.length(); i++)
			{
				if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4)
					{
						prefix += credit.charAt(i);
					}
	
				else if (i > 4 && i < 18)
					{
						number += credit.charAt(i);
					}
				else if (i == 18)
					{
						end += credit.charAt(i);
					}
				}
			
				if ( (customer.getServiceProvider().equals("Digicel")) != false) 
				{
					Phone = fileProcessor.GetCredit(number, 1);
				}
				else
				{
					Phone = fileProcessor.GetCredit(number, 2);
				}
				
				if ((prefix.equals("*121*") && end.equals("#") && Phone.Status.equals("Avaliable"))!=false)
				{
					
					customer.setBalance(customer.getBalance() + Phone.amount);
					Phone.Status="Used";
					fileProcessor.AddCustomer(customer, c);
					fileProcessor.AddPhoneCard(Phone,c);
					System.out.println(String.format("An Amount of %1$s was Added to Customer %2$s %3$s Account. Total Balance: %4$s", Phone.amount, customer.getFirstName(), customer.getLastName(), customer.getBalance()));
					f.close();
					q=1;
				}
				else
				{
					System.out.println(" Credit Method was entered Incorrectly. Please remember to start with *121* and end with the #. And Check to see if the Phone Card has been used.  Thank you: ");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e1) 
					{
						e1.printStackTrace();
					}
				}
		}
		//Look at prefix and determine file
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}
		home.ShowMainMenu(c);
		return;
	}
	
	public final void CheckBalance(int v)
	{
		FileProcessor file = new FileProcessor();
		Customer cust =new Customer();
		Scanner c = new Scanner(System.in);
		System.out.print("TRN: ");
		String trn = c.nextLine();
		
		if (v == 1) {
			 cust = file.DigicelGetCustomerByTrn(trn);
	      }
	      else if(v == 2) {
	    	 cust = file.FlowGetCustomerByTrn(trn);
	      }
		int q=0;
		while(q==0) 
		{
		String prefix = "";
		String end = "";
		System.out.print("Please input the Check Method ");
		String check = c.nextLine();

		for (int i = 0; i < check.length(); i++)
		{
				if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4)
					{
						prefix += check.charAt(i);
					}
				else if (i == 15)
					{
						end += check.charAt(i);
					}
		}
			if ((prefix.equals("*121*") && end.equals("#"))!=false)
			{
				System.out.println(String.format(" The Total Balance for this Account is %1$s", cust.getBalance()));
				System.out.println(String.format("Would you like to Add Credit:"));
				String response = c.nextLine();
			
					if ((response.equals("yes")) != false )
					{
						AddCredit(v);
						c.close();
						q=2;
					}
					else if ((response.equals("no")) != false)
					{
						Menu mainmenu = new Menu();
						mainmenu.ShowMainMenu(v);
						c.close();
						q=1;
					}
			}
			else
			{
				System.out.println(" Check Method was entered Incorrectly. Please remember to start with *120* and end with the #.  Thank you: ");
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e1) 
				{
					e1.printStackTrace();
				}
			}
		
		}
				
		return;
	}
}