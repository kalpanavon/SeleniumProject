package sessionone;

public class StaticNonStatic {

	static String companyName;
	String empName;
	String empEmail;
	String contact;
	public static void main(String s[]){
		StaticNonStatic sOne = new StaticNonStatic();
		sOne.empName="kalana";
		sOne.empEmail="bdvfbvf@abc.com";
		sOne.contact="74657576";
		companyName="hdgfjf";
		sOne.hireEmployee(sOne.empName);
		sOne.provideTraining();
		paySalary();
		sOne.fireEmployee();
	}

	public void hireEmployee(String name){
		System.out.println(name+" hired for "+companyName);
	}
	public void provideTraining(){
		System.out.println("provide Training");
	}
	public static void paySalary(){
		System.out.println("Pay Salary");
	}
	public void fireEmployee(){
		System.out.println("fire employee");
	}
}

