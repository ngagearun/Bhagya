import java.util.Scanner;




public class ConstructorDemo {
	
	
	int a=200;
	
	int returnmethod(){
		
		return 100;
	}
	
	ConstructorDemo(int a){
		System.out.println("I am in Constructo method");
	}
	
	ConstructorDemo(int a,int b){
		System.out.println("I am in Constructo method");
	}
	
	
	void m1(int a){
		System.out.println("I am in M1 Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo obj1=new ConstructorDemo(10);
		
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println(name);
		
		
		
		
		
		
		
		
	}

}
