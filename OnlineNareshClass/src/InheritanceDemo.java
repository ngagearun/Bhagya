class Employee{
	
	float salary;
}

class PE extends Employee{
	
	int bonus=100,insurance=20;
	
	void display_tax_slip_for_PE(){
	
		salary=30000*bonus*insurance;
		System.out.println(salary);
	}
	
}

class CE extends Employee{
	
	void display_tax_slip_for_CE(){
		salary=30000;
		System.out.println(salary);
	}
	
}



public class InheritanceDemo {

	public static void main(String[] args) {
		
		PE obj=new PE();
		obj.display_tax_slip_for_PE();

	}

}
