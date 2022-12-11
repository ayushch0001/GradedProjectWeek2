package Employee;
import java.util.ArrayList;

public class Employee  {
	 int id; 
	 String name; 
	 int age; 
	 int salary;
	 String department; 
	 String city;
	Employee( String n,int a,int s,String d,String c){
		name=n;
		age=a;
		salary=s;
		department=d;
		city=c;
	}	
	public Employee() {
		super();
	}
	 ArrayList<Employee> employees = new ArrayList<>();
	public  void EmployeeData() throws Exception
	{
		System.out.println("List of employees");
		Employee e1=new Employee("Raghu",22,900000,"Senior Manager","Chennai");
		e1.setId(1);
		Employee e2=new Employee("Yashvant",25,45000 ,"Junior Manager","Kerala");
		e2.setId(2);
		Employee e3=new Employee("Rahul",18,950000 ,"Software Devloper","Panjab");
		e3.setId(3);
		Employee e4=new Employee("Aankus",24,300000,"HR","Delhi");
		e4.setId(4);
		Employee e5=new Employee("Jivan",23,1400000,"CEO","Bengaluru");
		e5.setId(5);
		Employee e6=new Employee("Karan",22,900000,"Senior Manager","Chennai");
		e6.setId(6);
		Employee e7=new Employee("Yashvant",25,45000 ,"Junior Manager","Kerala");
		e7.setId(7);
		Employee e8=new Employee("Raman",18,950000 ,"Software Devloper","Panjab");
		e8.setId(8);
		Employee e9=new Employee("Random",-24,300000,"HR","Delhi");
		e9.setId(9);
		Employee e10=new Employee("Preeti",23,1400000,"CEO","Bengaluru");
		e10.setId(10);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);

		for(Employee emp:employees) {
			System.out.println(emp.getId() + " " + emp.name + " " + emp.age + " " + emp.salary + " " + emp.department + " " + emp.city);

			if (emp.getId() < 0 || emp.getName() == null || emp.getAge() < 0 || emp.salary < 0 || emp.getDepartment() == null || emp.city == null) {
				throw new Exception();
			}


					
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public String getCity() {
		return city;
	}

}
	
		
		
		
	
	




	

