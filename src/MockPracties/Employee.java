package MockPracties;

public class Employee {
	String emp_Name;
	int emp_Id;
	float emp_Salary;
	String emp_City;
	
    public Employee()
    {
    System.out.println("default constructor");  
    }
	
	public Employee( String empName,int empId,float empSalary,String empCity) 
	{
		emp_Name=empName;
	     emp_Id=empId;
	     emp_Salary=empSalary;
	     emp_City=empCity;
	     System.out.println("constructor is call");
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
        e1.emp_info();
        System.out.println("------------------------------");
		Employee e=new Employee("ravi", 102, 20000f, "pune");
		e.empInfo1();
		}
	
	public void emp_info() {
		String empName1="sham";
		int empId1=202;
		float empSalary1=4000f;
		String empCity1="nagpur";
		System.out.println("Employee name is "+empName1);
		System.out.println("Employee ID is :"+empId1);
		System.out.println("Employee salary is :"+empSalary1);
		System.out.println("Employee city is :"+empCity1);
		
		}
	public void empInfo1() {
		System.out.println("Employee name is "+emp_Name);
		System.out.println("Employee ID is :"+emp_Id);
		System.out.println("Employee salary is :"+emp_Salary);
		System.out.println("Employee city is :"+emp_City);
		
	}

}
