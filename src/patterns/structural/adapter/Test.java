package patterns.structural.adapter;


public class Test {

	public static void main(String[] args) {
		// In US with Turkish home appliance
		USPowerSource usPowerSource = new USPowerProvider();
		TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter1 = new TwoWayUSTurkishPowerAdapter(usPowerSource);
		
		System.out.println();

		
		System.out.println();
		
		// In Turkey with US home appliance
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();
		TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter2 = new TwoWayUSTurkishPowerAdapter(turkishPowerSource);
		
		System.out.println();
		

	}
}
