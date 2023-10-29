package assignment;

public class Samsung extends FactoryDemo {
	static int price = 5000;
	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.browse();
		//sam.browse is calling FactoryDemo class method ,
		//not accesable grand parent(SmartPhone) class methods.
		//(printed Factory Demo browsing) 
		System.out.println(sam.price);
		//sam.price fields access only his own class so child class behaves parent class
	}
	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub
	}
	@Override
	void providePattern() {
		// TODO Auto-generated method stub
	}
	@Override
	int call(int seconds) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
	}
	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
	}

}
