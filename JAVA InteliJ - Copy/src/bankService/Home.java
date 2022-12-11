package bankService;

import java.util.Scanner;

public class Home extends AddUser
{
	public static void main(String[] args) 
	{

			Home h1 = new Home();
			h1.registeredUser();
			Scanner sq = new Scanner(System.in);
			System.out.println("\t\t\t\t\t\t\t\tLOGIN PAGE ");
			System.out.println("ENTER YOUR ACCOUNT NUMBER :");
			Long accountNumber = sq.nextLong();
			System.out.println("ENTER YOUR PASSWORD");
			String password = sq.next();
			h1.login(accountNumber, password);


			
	}
}