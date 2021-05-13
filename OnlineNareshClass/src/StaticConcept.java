
public class StaticConcept {
	
	int empid;
	String empname,empemailaddress;
	static String orgname="TATA";
	
	void display_details_emp1(){
		empid=1001;
		empname="arun";
		empemailaddress="arun@tcs.com";
		
		System.out.println("EmpID for emp1: "+empid+"  Name for Emp1:"+empname
				+"  email address for emp1"+empemailaddress+"Orgnisation name for emp1"
				+orgname);
		
	}
	
	void display_details_emp2(){
		
		empid=2002;
		empname="kumar";
		empemailaddress="kumar@tcs.com";
		
		System.out.println("EmpID for emp2: "+empid+"  Name for Emp2:"+empname
				+"  email address for emp2"+empemailaddress+"Orgnisation name for emp1"
				+orgname);
		
	}
	
	

	public static void main(String[] args) {
		
		StaticConcept empdetails=new StaticConcept();
		empdetails.display_details_emp1();
		empdetails.display_details_emp2();
		
		

	}

}
