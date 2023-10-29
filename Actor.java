package assignment;

public interface Actor {
	boolean makeUpRequired = true;
	String address ="Chennai";
		
  void act();
 
 default void dance() {
  }
  void sing();
	 
 
}

