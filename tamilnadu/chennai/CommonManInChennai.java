package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules {
  public static void main (String[] args) {
	  CommonManInChennai cic = new CommonManInChennai();
	  cic.goByDieselVehicle();
      cic.goByBicycle();
  }

@Override
public void goByDieselVehicle() {
	// TODO Auto-generated method stub
	System.out.println("danger for our planet");
}

@Override
public void goByBicycle() {
	// TODO Auto-generated method stub
	System.out.println("cycling is good");
}
}
