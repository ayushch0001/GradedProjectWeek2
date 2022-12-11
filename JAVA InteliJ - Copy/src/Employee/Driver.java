package Employee;

public class Driver  extends DataStructureB {
public  void employeeData() {
    try {
        EmployeeData();
    }catch(Exception e)
    {
        System.out.println("\nNull value Occured "+ e);
    }
}
public  void employeeNamesSorted() {
	sortingNames();
}
public  void cityName() {
	cityNameCount();
}

	

	public static void main(String[] args)throws Exception {

        Driver driver=new Driver();
        driver.employeeData();
        driver.sortingNames();
        driver.cityNameCount();
        driver.monthlySalary();
	}

}
