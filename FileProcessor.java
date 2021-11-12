 
package groupproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;


public class FileProcessor
{

	/*public final boolean UpdateCustomer(Customer customer, int choice)
	{

		while (choice != 8)
		{
			switch (choice)
			{
				case 1:
					System.out.println("Enter the Correct Information :");
					String c = new Scanner(System.in).nextLine();
					customer.setTRN(c);
					break;

				case 2:
					System.out.println("Enter the Correct Information :");
					String c1 = new Scanner(System.in).nextLine();
					customer.setFirstName(c1);
					break;

				case 3:
					System.out.println("Enter the Correct Information :");
					String i = new Scanner(System.in).nextLine();
					customer.setLastName(i);
					break;

				case 4:
					System.out.println("Enter the Correct Information :");
					String u = new Scanner(System.in).nextLine();
					customer.setTelephone(u);
					break;

				case 5:
					System.out.println("Enter the Correct Information: Street number  :");
					System.out.print("Street Number: ");
					String g = new Scanner(System.in).nextLine();
					System.out.print("Street Name: ");
					String d = new Scanner(System.in).nextLine();
					System.out.print("City: ");
					String f = new Scanner(System.in).nextLine();
					System.out.print("Parish: ");
					String j = new Scanner(System.in).nextLine();
					customer.getMailingAddress().setLine1(g);
					customer.getMailingAddress().setLine2(d);
					customer.getMailingAddress().setCity(f);
					customer.getMailingAddress().setParish(j);
					break;

				case 6:
					System.out.println("Enter the Correct Information :");
					String t = new Scanner(System.in).nextLine();
					customer.setBalance(Double.parseDouble(t));
					break;

				case 7:
					System.out.println("Enter the Correct Information :");
					String k = new Scanner(System.in).nextLine();
					customer.setServiceProvider(k);
					break;
			}
		}
		AddCustomer(customer);
		return true;
	}*/

	public final String DigicelGetPhone(String card)
	{
		String arr = null;
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel_CardInformation.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt"));
			BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel_CardInformation.txt"));
			String s;
			while((s=br.readLine())!= null)
			{
				String[] item = s.split(java.util.regex.Pattern.quote(","), -1);
			if (card.equals(item[0]))
			{
				arr = s;
			}
			else 
			{
				bw.write(s+"\n");
			}
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return card;
		}
		
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel_CardInformation.txt"));
			BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt"));
			String s;
			while((s=br.readLine())!= null)
			{
			
				bw.write(s+"\n");
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return card;
		}

		
		return arr;
	}
	
	public final String FlowGetPhone(String card)
	{
		String arr = null;
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow_CardInformation.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt"));
			BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow_CardInformation.txt"));
			String s;
			while((s=br.readLine())!= null)
			{
				String[] item = s.split(java.util.regex.Pattern.quote(","), -1);
			if (card.equals(item[0]))
			{
				arr = s;
			}
			else 
			{
				bw.write(s+"\n");
			}
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return card;
		}
		
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow_CardInformation.txt"));
			BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt"));
			String s;
			while((s=br.readLine())!= null)
			{
			
				bw.write(s+"\n");
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return card;
		}

		
		return arr;
	}
	
	public final Customer DigicelGetCustomerByTrn(String Trn)
	{
		String oneCustomers = null;
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt"));
			BufferedReader br = new BufferedReader( new FileReader(file1));
			String s;
			while((s=br.readLine())!= null)
			{
				String[] item = s.split(java.util.regex.Pattern.quote(","), -1);
			if (Trn.equals(item[0]))
			{
				oneCustomers = s;
			}
			else 
			{
				bw.write(s+"\n");
			}
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return null ;
		}
		
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel.txt"));
			BufferedReader br = new BufferedReader( new FileReader(file1));
			String s;
			while((s=br.readLine())!= null)
			{
			
				bw.write(s+"\n");
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return null;
		}
		String[] item = oneCustomers.split(java.util.regex.Pattern.quote(","), -1);
		Customer cust = new Customer();
				cust.setTRN(item[0]);
				cust.setFirstName(item[1]);
				cust.setLastName(item[2]);
				cust.setTelephone(item[3]);
				Address tempVar = new Address();
				tempVar.setLine1(item[4]);
				tempVar.setLine2(item[5]);
				tempVar.setCity(item[6]);
				tempVar.setParish(item[7]);
				cust.setMailingAddress(tempVar);
				cust.setBalance(Double.parseDouble(item[8]));
				cust.setServiceProvider(item[9]);
			
		return cust;
	}

	public final Customer FlowGetCustomerByTrn(String Trn)
	{
		
		String oneCustomers = null;
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt",true));
			BufferedReader br = new BufferedReader( new FileReader(file1));
			String s;
			while((s=br.readLine())!= null)
			{
				String[] item = s.split(java.util.regex.Pattern.quote(","), -1);
			if (Trn.equals(item[0]))
			{
				oneCustomers = s;
			}
			else 
			{
				bw.write(s+"\n");
			}
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return null ;
		}
		
		try 
		{
			File file1= new File("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\temp.txt");
			BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow.txt",true));
			BufferedReader br = new BufferedReader( new FileReader(file1));
			String s;
			while((s=br.readLine())!= null)
			{
			
				bw.write(s+"\n");
			}
			file1.delete();
			br.close();
			bw.close();
		}catch(Exception ex) {
			return null;
		}
		String[] item = oneCustomers.split(java.util.regex.Pattern.quote(","), -1);
		Customer cust = new Customer();
				cust.setTRN(item[0]);
				cust.setFirstName(item[1]);
				cust.setLastName(item[2]);
				cust.setTelephone(item[3]);
				Address tempVar = new Address();
				tempVar.setLine1(item[4]);
				tempVar.setLine2(item[5]);
				tempVar.setCity(item[6]);
				tempVar.setParish(item[7]);
				cust.setMailingAddress(tempVar);
				cust.setBalance(Double.parseDouble(item[8]));
				cust.setServiceProvider(item[9]);
			
		return cust;
	}
	
	public final PhoneCard GetCredit(String credit, int choice)
	{
		String book= null;
		if (choice == 1) {
	        book = DigicelGetPhone(credit);
	      }
	      else if(choice == 2) {
	    	book = FlowGetPhone(credit);
	      }
		String[] item = book.split(java.util.regex.Pattern.quote(","), -1);
		
				PhoneCard phone = new PhoneCard();
				phone.CreditNum = Long.parseLong(item[0]);
				phone.amount = Double.parseDouble(item[1]);
				phone.Status= item[2];
				phone.Company= item[3];

		return phone;
	}

	public final boolean AddCustomer(Customer customer, int c)
	{
		String CustomerInfo = null;
		Menu d = new Menu();		
		String prefix = "";
		
		for (int i = 0; i < customer.getTelephone().length(); i++)
		{
			if (i == 3 || i == 4 || i == 5)
			{
				prefix += customer.getTelephone().charAt(i);
			}
		}
		
		if(c==1) 
		{
			if ((prefix.equals("301") || prefix.equals("302") || prefix.equals("303") || prefix.equals("304")) == true)
			{
				customer.setServiceProvider("Digicel");
				CustomerInfo = (customer.getTRN() + "," + customer.getFirstName() + "," + customer.getLastName() + "," + customer.getTelephone() + "," + customer.getMailingAddress().getLine1() + "," + customer.getMailingAddress().getLine2() + "," + customer.getMailingAddress().getCity() + "," + customer.getMailingAddress().getParish() + "," + customer.getBalance() + "," + customer.getServiceProvider());
				BufferedWriter bw;
				try {
					bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel.txt",true));
					PrintWriter p = new PrintWriter(bw);
					p.println(CustomerInfo);
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		else if(c==2)
		{
			if (prefix.equals("601") || prefix.equals("602") || prefix.equals("603") || prefix.equals("604"))
			{
				customer.setServiceProvider("Flow");
				CustomerInfo =(customer.getTRN() + "," + customer.getFirstName() + "," + customer.getLastName() + "," + customer.getTelephone() + "," + customer.getMailingAddress().getLine1() + "," + customer.getMailingAddress().getLine2() + "," + customer.getMailingAddress().getCity() + "," + customer.getMailingAddress().getParish() + "," + customer.getBalance() + "," + customer.getServiceProvider());
				BufferedWriter bw;
				try {
					bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow.txt",true));
					PrintWriter p = new PrintWriter(bw);
					p.println(CustomerInfo);
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
			else
			{
				System.out.println("\n***The Number Inputted is not part of the Service Provider's Phone Number Format.\n Please enter numbers that start with 601,602,603 & 604 to succesffullty save Contact.***\n");
				Program.CreateCustomer(c);
			}
		}
		else
		{
			System.out.println(" The Telephone of the created Customer is Invalid. Please Input the Customer Information Correctly: ");
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e1) 
			{
				e1.printStackTrace();
			}
			Program.CreateCustomer(c);
		}
			
		System.out.println(String.format("Customer %1$s %2$s Created successfully", customer.getFirstName(), customer.getLastName()));
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}
		d.ShowMainMenu(c);
		return true;
	}
	
	public final boolean AddPhoneCard(PhoneCard card, int d)
	{
		String CardInfo = null;
		Menu display = new Menu();
		String c = card.Company;
		if (c.equals("Digicel"))
		{
	
			CardInfo =(card.CreditNum + "," + card.amount + "," + card.Status + "," + card.Company);
			try {
				BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Digicel_CardInformation.txt",true));
				PrintWriter p = new PrintWriter(bw);
				p.println(CardInfo);
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if (c.equals("Flow"))
		{
			CardInfo=(card.CreditNum + "," + card.amount + "," + card.Status + "," + card.Company);
			try {
				BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\Delano Bannister\\OneDrive\\Documents\\Utech\\OOP\\Java\\src\\groupproject\\Flow_CardInformation.txt",true));
				PrintWriter p = new PrintWriter(bw);
				p.println(CardInfo);
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		//Look at prefix and determine file
		System.out.println(String.format("Credit Card Number: %1$s Created successfully", card.CreditNum));
		display.ShowMainMenu(d);
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}
		return true;
	}
}