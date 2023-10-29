package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInDelhi cmid = new CommonManInDelhi();
	cmid.goByBicycle();
	cmid.dontGoByDieselVehicle();
	cmid.goByDieselVehicle();
	
	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("good for earth");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("it is exercise");
	}//trafficrules chennai and delhi 2 class having goByBicycle() methods but, 
	//java just override a method only one time.

	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("wrong move");
	}
	
}//we use easily other package class methods is using by a METHOD OVERRIDE(polimarphism).
