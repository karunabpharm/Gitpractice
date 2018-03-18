package constructor;

public class Employee {
	public int EmpID;
	public String EmpName;
	public Employee () {
		System.out.println("i am in default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ramu=new Employee();
		ramu.EmpID=123456;
		ramu.EmpName="ramu";
		System.out.println(ramu.EmpID);
		System.out.println(ramu.EmpName);
		

	}

}
