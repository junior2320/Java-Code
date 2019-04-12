package class21;

public class Employee {
	
	int eID;
	int salary;
	public static String CEO="Sumair";

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.eID=1;
		e1.salary=100000;
		e1.employeeInfo();
		
		Employee e2=new Employee();
		e2.eID=2;
		e2.salary=150000;
		e2.employeeInfo();
		
		
	}

	public void employeeInfo()
	{
		System.out.println("CEO "+CEO+" ID: "+eID+" with salary "+salary);
	}
}
