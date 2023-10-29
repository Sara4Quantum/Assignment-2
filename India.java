package assignment;

public abstract class India {
	static String capital ="New Delhi"; 
	public India(String primeMinister) {
		System.out.println("our Prime Minister is " + primeMinister);
		
	}
	
	abstract void speakLanguage();
	abstract void eat();
	abstract void dress();


}
