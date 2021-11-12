package groupproject;

import java.util.Scanner;

public class login 
{
	public int Auth() 
	{
		int choice;
		Menu display = new Menu();
		Scanner input= new Scanner(System.in);
		System.out.println("********************************************");
		System.out.println("*           Welcome to Main Menu           *");
		System.out.println("********************************************");
		System.out.println("*1.        LOGIN AS ADMINISTRATOR          *");
		System.out.println("*2.          LOGIN AS CUSTOMER             *");
		do {
		    System.out.println("Please enter a positive number!");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next();
		    }
		  choice = input.nextInt();
		} while (choice <= 0);
		int p = 0;
		while(p==0) 
		{
			if (choice == 1)
			{ 
				System.out.print("*        ENTER USERNAME:  *");
				String user= input.next().toLowerCase();
				System.out.println("       ENTER PASSWORD:  *");
				String pass= input.next();
				if(pass.equals("TheBiggerBetterNetwork2021") && user.equals("administrator"))
				{
					display.ShowMainMenu(1);
					p=1;
				}
				else if(pass.equals("TheWayIFlow2021") && user.equals("administrator"))
				{
					display.ShowMainMenu(2);
					p=1;
				}
			}
			else if(choice ==2) 
			{
				int q=0;
				while(q==0) 
				{
					int in;
					System.out.println("********************************************");
					System.out.println("*      CHOOSE YOUR SERVICE PROVIDER        *");
					System.out.println("********************************************");
					System.out.println("*1.              Digicel                   *");
					System.out.println("*2.               Flow                     *");
					do {
					    System.out.println("Please enter a positive number!");
					    while (!input.hasNextInt()) {
					        System.out.println("That's not a number!");
					        input.next();
					    }
					  in = input.nextInt();
					} while (in <= 0);
					if(in ==1) 
					{
						display.CustomerMenu(in);
						q=1;
					}
					else if(in==2)
					{
						display.CustomerMenu(in);
						q=1;
					}
					else {
						System.out.println("*InCorrect Number*");
					}
			  }
			}
			else
			{
				System.out.println("*In Correct Username and Password*");
			}
		}
		input.close();
		return choice;
	}


}
