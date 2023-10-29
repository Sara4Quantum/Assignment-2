package assignment;

public class SQLTrainer extends Trainer{
public SQLTrainer(String s1, String s2) {
		super(s1, s2);
	}

public static void main(String[] args) 
{
	SQLTrainer ram =new SQLTrainer("CSE","payilagam");
	ram.training();
	ram.set_salary(5);
	
	System.out.println(ram.get_salary());
	System.out.println(ram.dept);
	System.out.println(ram.institute);
}
}
