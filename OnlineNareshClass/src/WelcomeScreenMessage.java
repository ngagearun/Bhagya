/*Created By: arun kumar
Date:03/09/21
Purpose:Printing a welcome screen message
*/


public class WelcomeScreenMessage {
	
	//instance variables
	int a,b=200;
	String car_color,car_modelno;
	int car_speed;
	boolean car_remoteaccess;
	
	//static variable
	static int c=200;
	//instance method
	void display_details_car_benz(){
		
		car_color="white";;
		car_modelno="AXwe23";
		car_speed=100;
		car_remoteaccess=true;
		
	}
	
	 void display_details_car_Toyata(){
		
		car_color="Red";;
		car_modelno="TY2334";
		car_speed=80;
		car_remoteaccess=false;
	}
	
   
	//instance method1
	 void showmessage(){
		 System.out.println("I am in SHow messahe method");
		 System.out.println(a);
		 
	 }
	 //instance method2
	 void validatepinnumberforATMCard(){
		 int setpinnumber=1234;
		 System.out.println(a);
	 }
	
	//static method
	public static void main(String[] args){
		
		//local variable
		int stdrollno=1234;
		float stdperc=80.14f;
		String stdname="arun";
		WelcomeScreenMessage welcome=new WelcomeScreenMessage();
		System.out.println(welcome.a);
		System.out.println(c);
		
		
	
		
	System.out.println("Name of student: "+stdname+"  Stdrollno is:"+stdrollno+"  Student percentage is"+stdperc);	
	
		
		
		
	}

}
