
public class ConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		
		for (Employee e:staff)
		{
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
	}

}
