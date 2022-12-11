package bankService;

import java.util.Random;
import java.util.Scanner;

public class Service
{	
	public Scanner sc= new Scanner(System.in);
	public Long usingService(Long balance)
	{//usingService() calling all required Functions which we need to run this bank program easily
		   Long newBalance=0L;
    		int choise;
    		System.out.println("CHOOSE 1 FOR DEPOSIT");
    		System.out.println("CHOOSE 2 FOR WITHDRAW");
    		System.out.println("CHOOSE 3 FOR TRANSFER");
    		System.out.println("CHOOSE 4 FOR LOGOUT");
    		choise=sc.nextInt();

		while(choise!=1&&choise!=2&&choise!=3&&choise!=4)
    		{
    			System.out.println("INVALID INPUT\n");
				System.out.println("CHOOSE 1 FOR DEPOSIT");
				System.out.println("CHOOSE 2 FOR WITHDRAW");
				System.out.println("CHOOSE 3 FOR TRANSFER");
				System.out.println("CHOOSE 4 FOR LOGOUT");
    			choise=sc.nextInt();
    		}
    		switch(choise)
    		{
    			case 1:
					newBalance=deposit(balance);
    				break;
    			case 2:
					newBalance=withdraw(balance);
    				break;
    			case 3:
					newBalance=transfer(balance);
    				break;
    			case 4:
    				System.exit(0);
    		}
			return  newBalance;

	}

	public Long deposit(Long balance)
	{//deposit() it takes amount and added in main data structure
		Long deposit;
		System.out.println("ENTER AMOUNT.");
		deposit=sc.nextLong();
		Long L1=balance;
		Long L3=L1+deposit;

		return L3;
	}

	public Long withdraw(Long balance)
	{//withdraw() it takes amount and reduce from the  main data structure
		Long L1=balance;
		Random R2= new Random();
		int otp=R2.nextInt(1000,9999);
		System.out.println("OTP--->"+otp+"\nVERIFY OTP");
		int verify;
		verify=sc.nextInt();
		if(verify==otp) 
			{
				Long withdraw;
				System.out.println("ENTER AMOUNT.");
				withdraw=sc.nextLong();
				if(L1>=withdraw)
					{
						L1=L1-withdraw;
					}
				else 
					{
						System.out.println("\t\t\t\t\t\t\t\tINSUFFICIENT BALANCE");
					}
			}
		else
			{
				System.out.println("\t\t\t\t\t\tNOT MATCH FOUND ENTER NEW OTP AGAIN");
				withdraw(balance);
			}
		return L1;
   }
		public Long transfer(Long balance)
   {//transfer() it takes amount and reduce from the  main data structure

	   Long L1=balance;
		Random R2= new Random();
		int otp=R2.nextInt(1000,9999);
		System.out.println("OTP--->"+otp+"\n VERIFY OTP");
		int verify;
		verify=sc.nextInt();
		if(verify==otp) 
			{
				Long transfer;
				System.out.println("ENTER AMOUNT.");
				transfer=sc.nextLong();
				if(L1>=transfer)
					{
						L1=L1-transfer;
					}
				else 
					{
						System.out.println("\t\t\t\t\t\t\t\tINSUFFICIENT BALANCE");
					}
			}
		else
			{
				System.out.println("\t\t\t\t\t\tNOT MATCH FOUND ENTER NEW OTP AGAIN");
				transfer(balance);
			}
	   return L1;

   }
}
		
	

	
			
 

