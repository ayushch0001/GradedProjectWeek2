package Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DataStructureB extends DataStructureA{
	public void cityNameCount()
	{
		ArrayList<String> cityNames=new ArrayList<String>();
		Iterator<Employee> iterCityNames=employees.iterator();
		while(iterCityNames.hasNext())
			{
				cityNames.add((String)iterCityNames.next().getCity());
			}
		System.out.println("\nCount of Employees from each city ");
		Map<String, Long> cityCount =
		cityNames.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(cityCount);
	}
	public void monthlySalary() {
		try
		{
			TreeMap<Integer,Long> monthlySalary=new TreeMap<Integer, Long>();
			for(Employee eee:employees)
			{
			monthlySalary.put(eee.getId(), (long) eee.getSalary());
			}
		System.out.println(monthlySalary);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
