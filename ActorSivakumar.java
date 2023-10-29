package assignment;

public class ActorSivakumar implements Actor{
	static	String address = "Coimbatore";
	 int year;
	 String car;
	
	public ActorSivakumar(int year, String car) {
	this.year = year;
	this.car = car;
	}
	public ActorSivakumar() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivakumar as = new ActorSivakumar(65,"Audi car");
	System.out.println(as.address);
	   as.speaking();

Actor ac = new ActorSivakumar();
   System.out.println(ac.address);
   ac.act();
   ac.dance();
   ac.sing();
   System.out.println(as.year);
   System.out.println(as.car);
   
	}
	
	void speaking() {
		return;
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("acting");
	}
	@Override
	public void dance() {
		// TODO Auto-generated method stub
		  System.out.println("mike jack");

	}
	@Override
	public void sing() {
		System.out.println("the ordinary person");
		
	}


}
