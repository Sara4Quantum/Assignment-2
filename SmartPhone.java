package assignment;

public abstract class SmartPhone { 
	 
	public SmartPhone()
	{System.out.println("SmartPhone under devolepment");
	
	}
	abstract int call(int seconds);
	
	abstract void sendMessage();
	 
	abstract void receiveCall();
	void browse() {
		System.out.println("SmartPhone browsing");
}
	
}