package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DataStructureA extends Employee
{
	public void sortingNames()
		{
			ArrayList<String> employeeNames=new ArrayList<String>();
			Iterator<Employee> names=employees.iterator();
			while(names.hasNext())
			{
			employeeNames.add((String)names.next().name);
			}
			Collections.sort(employeeNames);
			System.out.println("\nNames of all employees in the sorted order are ");
			System.out.println(employeeNames);

		}
		
	}



