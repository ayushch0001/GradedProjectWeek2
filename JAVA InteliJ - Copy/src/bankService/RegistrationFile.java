package bankService;

import java.util.Map;
import java.util.TreeMap;

class AddUser extends RegistrationFile
{//we extends the RegistrationFile class here just to use all the methods and attributes
	public AddUser(){}
	public  AddUser(Long accountNumber,String password)
	{// adduser() is constructer of AddUser class here we takes details of every user as a object of AddeUser and passes to
		// creatreUser function
		this.setAccountNo(accountNumber);
		this.setPassword(password);
		this.createUser(accountNumber,this);
	}
	// registrationFile is the main dataStrucute that keeps the details of every user
	static Map<Long,AddUser> registrationFile = new TreeMap<>();
	/**CreateUser() every  time make one new memory and taking
	 *the details passes from the addUser() to store in dataStructure
	*/
	 public void createUser(Long accountNumber,AddUser user)
	{
		registrationFile.put(accountNumber,user);
	}
	void registeredUser()//   Add all user here  in list first to hardcode and no same account added here
	{
		AddUser u1 = new AddUser(123456789L, "User2");
		AddUser u2 = new AddUser(1234512345L, "User1");
		AddUser u3 = new AddUser(1122334455L, "User1");
		u1.setBalance(50000L);
		u2.setBalance(50000L);
		u3.setBalance(50000L);

	}

	/**
	 * 	Login function matches the details given by the Use the
	 * 	This function is calling from Home page
	 * 	Do all the further process and
	 */
	public  void login(Long accountNumber,String password)
	{
		if(registrationFile.containsKey(accountNumber))
		{
			for (Map.Entry<Long, AddUser> e : registrationFile.entrySet())
			{

				if (accountNumber.equals(e.getKey()) && password.equals(e.getValue().getPassword())) {
					int end;
					do {
						Long lq = e.getValue().getBalance();
						Long currentBalance = e.getValue().usingService(lq);
						e.getValue().setBalance(currentBalance);
						System.out.println("CURRENT BALANCE : " + e.getValue().getBalance());
						System.out.println("\t\t\t\t\t\t\t\tENTER 0 TO FINISH THE PROCESS");
						end = sc.nextInt();
						while (end != 0) {
							System.out.println("\t\t\t\t\t\t\t\tINVALID INPUT\nENTER AGAIN");
							end = sc.nextInt();
						}
					} while (end == 0);
				}
			}
		}
		else
		{
				System.out.println("\t\t\t\t\t\t\t\tWRONG DETAIL\n\t\t\t\t\t\t\t\tLOGIN AGAIN\nENTER ACCOUNT NUMBER");
				Long checkAccountNumber = sc.nextLong();
				String checkPassword;
				System.out.println("ENTER YOUR PASSWORD");
				checkPassword = sc.next();
				this.login(checkAccountNumber, checkPassword);
			}
		}
	}


// RgistraionFile keeps the varibles as detail  and have getter and setterr that helps to update the detils
public class RegistrationFile extends Service{
	private Long balance;
	private Long AccountNo;

	public Long getAccount() {
		return AccountNo;
	}

	public void setAccountNo(Long accountNo) {
		AccountNo = accountNo;
	}

	private String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {this.balance = balance;}



}
		
