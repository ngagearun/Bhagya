import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class ExceptionHandling {
	
	int num1=100,num2=0,div;
	
	void division() throws InterruptedException{
	
		try{
			//database connnecttion code
			//enteruing username
			//entering password
			//cnnect to database
		div=num1/num2;
		System.out.println(div);
		}catch(ArithmeticException m1){
		  m1.printStackTrace();	
		}finally{
			
		}
	}
	
	void display(){
		System.out.println("I am in display method");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExceptionHandling  ex=new ExceptionHandling();
		ex.division();
		ex.display();

	}

}
