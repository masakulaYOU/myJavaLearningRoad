import java.util.Random;


public class Employee {
  private static int nextId;
  private int id;
  private String name;
  private double salary;
  
  
  //static initialization block
  static
  {
	  Random generator = new Random();
	  nextId = generator.nextInt(10000);
  }
  
  //object initialization block
  {
	  id = nextId;
	  nextId++;
  }
  
  //three overloaded constructors
  
  public Employee(String n, double s)
  {
	  name = n;
	  salary = s;
  }
  
  public Employee(double s)
  {
	  this("Employee #" + nextId, s);
  }
  
  public Employee()
  {
	  //name initialized to "" --see below
	  //salary not explicitly set -- initialized to 0
	  //id initialized in initialization block
  }
  
  public String getName()
  {
	  return name;
  }
  
  public double getSalary()
  {
	  return salary;
  }
  
  public int getId()
  {
	  return id;
  }
}
