package assignment;

public class Trainer {
	String dept = "Java";
	 String institute = "Payilagam";
	 String s1;
	 String s2;
	 private int salary = 10000;
	
	 public Trainer(String s1 ,String s2) {
		 this.s1 = s1;
		this.s2 = s2;
	 System.out.println(s1);
	 System.out.println(s2);
	 }
	 
	 void training() {
		System.out.println("study");
		 return; 
	 }
	 
	  int get_salary() {
	 return salary;
	 }
	  
	  void set_salary(int hours)
	  {
		  if(hours>8) {
			  salary = salary + 2500; 
		  }
		  else {
			  salary = 5000;
		  }
	  }	
	  public static void main(String[] args) {
			Trainer trainerkumar = new Trainer("CSE","payilagam");
		
		}  
}
