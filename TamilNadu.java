package assignment;

public class TamilNadu extends SouthIndia {
	static String capital = "Chennai";
    
	public TamilNadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}
	void cultivate() {
		System.out.println("Rice and Sugar cane cultivation");
	}
	void livingStyle() {
		System.out.println("Above Average development");
	}
	public static void main(String[] args) {
//		India ind = new TamilNadu();
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		SouthIndia si = new TamilNadu("Narendra Modi");
		si.cultivate(); // accessed TamilNadu class methods this is called Runtime Polymorphism (Overriding).
		si.livingStyle();// accessed TamilNadu class methods this is called Runtime Polymorphism (Overriding).
		si.speakLanguage();
		si.dress();
		si.eat();

	}

	@Override
	void speakLanguage() {
				
	System.out.println("Tamil");
	}

	@Override
	void eat() {
		System.out.println("only healthy food");
	
	}

	@Override
	void dress() {
		System.out.println("simple saree and veatti");
	
	}

}
