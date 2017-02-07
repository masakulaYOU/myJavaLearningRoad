
public class StaticTest {
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom", 40000);
		staff[1] = new Employee("Dick", 60000);
		staff[2] = new Employee("Harry", 65000);
		
		
		for (Employee e:staff)
		{
			e.setId();
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",id=" + e.getId());
		}
		
		int n = Employee.getNextId();
		System.out.println("Next available id=" + n);
		
		
		
		Employee e = new Employee("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary() + " " + e.getId());
	}
}
