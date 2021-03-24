


// https://www.baeldung.com/java-stream-filter-lambda




import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
	
	public static void main(String[] args) {
		
		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);
		
		List<Customer> customers = Arrays.asList(john, sarah, charles, mary);
		
		
		List<Customer> customersWithMoreThan100Points = customers
				  .stream()
				  .filter(c -> c.getPoints() > 100)
				  .collect(Collectors.toList());
		
		List<Customer> customersWithMoreThan100Points2 = customers
				  .stream()
				  .filter(Customer::hasOverHundredPoints)
				  .collect(Collectors.toList());
		
		
		//
		// Filtering Collections with Multiple Criteria
		// =============================================
		//
		
		
		List<Customer> charlesWithMoreThan100Points3 = customers
				  .stream()
				  .filter(c -> c.getPoints() > 100 && c.getName().startsWith("Charles"))
				  .collect(Collectors.toList());

						
		System.out.println("size =====> " + charlesWithMoreThan100Points3.size());
		System.out.println("contains =====> " + charlesWithMoreThan100Points3.contains(charles));
		
	}

}



package def.io;

public class Customer {
	
	private String name;
    private int points;
    
    public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	public boolean hasOverHundredPoints() {
	    return this.points > 100;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
    
    

}



