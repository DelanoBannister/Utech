package groupproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Program
{
	public static void CreateCustomer(int c)
	{ 
		System.out.println("***** Creating Customer ******");
		Scanner input = new Scanner(System.in);
		Customer customer = new Customer();
		customer.setMailingAddress(new Address());
		
		int p = 1;
		while (p == 1)
		{
			System.out.print("TRN: ");
			String cust = input.nextLine();
			boolean digit = true;
			for(int i = 0; i<cust.length(); i++)
			{
				boolean isNumber = Character.isDigit(cust.charAt(i));
				if (!isNumber)
				{
					System.out.print("**\nThe TRN Number is not an integer. Please Input the TRN Number**\n");
					digit = false;
					break;
				}

			}
			if (cust.length() == 9 && digit == true)
			{
				customer.setTRN(cust);
				p = 2;
			}
			else
			{
				System.out.print("**\nPlease Ensure the Trn Number is 9 digit long.**\n");
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e1) 
				{
					e1.printStackTrace();
				}  
			}
		}

		System.out.print("First Name: ");
		customer.setFirstName(input.nextLine());

		System.out.print("Last Name: ");
		customer.setLastName(input.nextLine());

		System.out.print("Telephone: ");
		customer.setTelephone(input.nextLine());

		System.out.print("Address Line 1: ");
		customer.getMailingAddress().setLine1(input.nextLine());

		System.out.print("Address Line 2: ");
		customer.getMailingAddress().setLine2(input.nextLine());

		System.out.print("City: ");
		customer.getMailingAddress().setCity(input.nextLine());

		System.out.print("Parish: ");
		customer.getMailingAddress().setParish(input.nextLine());

		customer.setBalance(100.00);

		FileProcessor fileProcessor = new FileProcessor();
		fileProcessor.AddCustomer(customer,c);
		input.close();
	}
	
	public static void CreatePhoneCard( int c)
	{ 
		System.out.println("***** Creating Phone Card ******");
		Scanner input = new Scanner(System.in);
		PhoneCard card = new PhoneCard();
		int p = 1;
		while (p == 1)
		{
			System.out.print("Card Number. The Card Must be 13 digit Long: ");
			String car =input.next();
			boolean digit = true;
			for (int i = 0; i < 13; i++)
			{
				boolean isNumber = Character.isDigit(car.charAt(i));
				if (!isNumber)
				{
					System.out.print("The Card Number is not an integer. Please Input the Card Number");
					digit = false;
					break;
				}

			}
			if (car.length() == 13 && digit == true)
			{
				card.CreditNum = Long.parseLong(car);
				p = 2;
			}
			else
			{
				System.out.print(" Please Ensure to the Number is 13 digit.");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e1) 
				{
					e1.printStackTrace();
				}
				System.out.print("\033[H\033[2J");  
			}
		}


		System.out.print("Write the Amount the Card is Worth: ");
		double userinput = input.nextDouble();
		card.amount = (double)userinput;


		card.Status = "Avaliable";

			
			if (c == 1)
			{
				card.Company = "Digicel";
				
			}
			else if (c==2)
			{
				card.Company = "Flow";
			}
			
		FileProcessor processor = new FileProcessor();
		processor.AddPhoneCard(card,c);
		input.close();
	}
	
	public static Boolean ShowAllCustomer(int c)
	{
			Menu display= new Menu();
			System.out.println("***** Customer Information ******");
			Customer customer = new Customer();
			if(c==1) 
			{
				
				try 
				{
					File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel.txt");
					BufferedReader sc =new BufferedReader(new FileReader(file1));
					String line =null;
					while((line =sc.readLine()) != null) 	
					{
						String[] item = line.split(java.util.regex.Pattern.quote(","),-1);
							if(item[0]==null) 
							{
								System.out.print(line);
							}
							else {
								customer.setTRN(item[0]);
								customer.setFirstName(item[1]);
								customer.setLastName(item[2]);
								customer.setTelephone(item[3]);
								Address tempVar = new Address();
								tempVar.setLine1(item[4]);
								tempVar.setLine2(item[5]);
								tempVar.setCity(item[6]);
								tempVar.setParish(item[7]);
								customer.setMailingAddress(tempVar);
								customer.setBalance(Double.parseDouble(item[8]));
								customer.setServiceProvider(item[9]);
								System.out.println("********************************************");
								System.out.println(String.format("TRN:  %1$s", customer.getTRN()));
								System.out.println(String.format("Full Name:  %1$s  %2$s", customer.getFirstName(), customer.getLastName()));
								System.out.println(String.format("TelephoneNumber: %1$s ", customer.getTelephone()));
								System.out.println(String.format("Address: %1$s, %2$s, %3$s, %4$s", customer.getMailingAddress().getLine1(), customer.getMailingAddress().getLine2(), customer.getMailingAddress().getCity(), customer.getMailingAddress().getParish()));
								System.out.println(String.format("Balance: %1$s", customer.getBalance()));
								System.out.println(String.format("Service Provider: %1$s", customer.getServiceProvider()));
								System.out.println("********************************************");
								System.out.println("                                            ");
						}
					}
					sc.close();
					display.ShowMainMenu(c);
				}
				catch (IOException e) 
				{
					e.printStackTrace();}
			}
			else if(c==2) 
			{
				
				try 
				{
					File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow.txt");
					BufferedReader sc =new BufferedReader(new FileReader(file1));
					String line;
					while((line =sc.readLine()) != null) 
				{
					String[] item = line.split(java.util.regex.Pattern.quote(","), -1);;
					if(item[0]==null) 
					{
						System.out.print(line);
					}
					else 
					{
						customer.setTRN(item[0]);
						customer.setFirstName(item[1]);
						customer.setLastName(item[2]);
						customer.setTelephone(item[3]);
						Address tempVar = new Address();
						tempVar.setLine1(item[4]);
						tempVar.setLine2(item[5]);
						tempVar.setCity(item[6]);
						tempVar.setParish(item[7]);
						customer.setMailingAddress(tempVar);
						customer.setBalance(Double.parseDouble(item[8]));
						customer.setServiceProvider(item[9]);
						System.out.println("********************************************");
						System.out.println(String.format("TRN:  %1$s", customer.getTRN()));
						System.out.println(String.format("Full Name:  %1$s  %2$s", customer.getFirstName(), customer.getLastName()));
						System.out.println(String.format("TelephoneNumber: %1$s ", customer.getTelephone()));
						System.out.println(String.format("Address: %1$s, %2$s, %3$s, %4$s", customer.getMailingAddress().getLine1(), customer.getMailingAddress().getLine2(), customer.getMailingAddress().getCity(), customer.getMailingAddress().getParish()));
						System.out.println(String.format("Balance: %1$s", customer.getBalance()));
						System.out.println(String.format("Service Provider: %1$s", customer.getServiceProvider()));
						System.out.println("********************************************");
						System.out.println("                                            ");
					}
				}
				sc.close();
				display.ShowMainMenu(c);
			}
			catch (IOException e) 
			{e.printStackTrace();}
		}
			return true;
	}
	
	public static Boolean ShowAllPhone(int c)
	{
			Menu display = new Menu();
			System.out.println("***** Phone Card Information ******");
			PhoneCard phone = new PhoneCard();
			if(c==1) 
			{
				try 
				{
					File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel_CardInformation.txt");
					BufferedReader sc =new BufferedReader(new FileReader(file1));
					String line;
					while((line =sc.readLine()) != null) 
					{
						
						String[] item = line.split(java.util.regex.Pattern.quote(","), -1);
						if(item[0]==null) 
						{
							System.out.print(line);
						}
						else 
						{
							phone.CreditNum = Long.parseLong(item[0]);
							phone.amount = Double.parseDouble(item[1]);
							phone.Status= item[2];
							phone.Company= item[3];
	
							System.out.println("********************************************");
							System.out.println(String.format("Phone Card Number: %1$s ", phone.CreditNum));
							System.out.println(String.format("Status: %1$s", phone.Status));
							System.out.println(String.format("Value : %1$s", phone.amount));
							System.out.println(String.format("Service Provider: %1$s", phone.Company));
							System.out.println("********************************************");
							System.out.println("                                            ");
						}
					}
					sc.close();
					display.ShowMainMenu(c);
				}
				catch (IOException e) 
				{ display.ShowMainMenu(c);
					e.printStackTrace();}
			}
			else if(c==2) 
			{
				
				try 
				{
					File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow_CardInformation.txt");
					BufferedReader sc =new BufferedReader(new FileReader(file1));
					String line;
					while((line =sc.readLine()) != null) 
				{
					
					String[] item = line.split(java.util.regex.Pattern.quote(","), -1);
					if(item[0]==null) 
					{
						System.out.print(line);
					}
					else 
					{
						phone.CreditNum = Long.parseLong(item[0]);
						phone.amount = Double.parseDouble(item[1]);
						phone.Status= item[2];
						phone.Company= item[3];
	
						System.out.println("********************************************");
						System.out.println(String.format("Phone Card Number: %1$s ", phone.CreditNum));
						System.out.println(String.format("Status: %1$s", phone.Status));
						System.out.println(String.format("Value : %1$s", phone.amount));
						System.out.println(String.format("Service Provider: %1$s", phone.Company));
						System.out.println("********************************************");
						System.out.println("                                            ");
					}
				}
				sc.close();
				display.ShowMainMenu(c);
			}
			catch (IOException e) 
			{e.printStackTrace();}
		}
			return true;
	}
}
