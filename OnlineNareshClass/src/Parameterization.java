
public class Parameterization {
	
  int sum;
	//called 
	void addition(int num1,int num2){
		sum=num1+num2;
		System.out.println(sum);
	}
	
	
	
	
void sub(int num1,int num2){
		sum=num1+num2;
		System.out.println(sum);
		System.out.println("arun");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterization par=new Parameterization();
		par.addition(100,200);//calling 
		par.addition(450, 550);
	}

}
