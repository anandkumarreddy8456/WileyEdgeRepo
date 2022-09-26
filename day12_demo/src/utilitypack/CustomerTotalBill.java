package utilitypack;

public class CustomerTotalBill {

	
	
	public static double totalBill(int numberOfUnitsConsumed) {
		if(numberOfUnitsConsumed<=100) {
			return numberOfUnitsConsumed*0.5;
		}else if(numberOfUnitsConsumed<=150) {
			return (numberOfUnitsConsumed-100)*0.75+(100*0.5);
		}else {
			double temp=numberOfUnitsConsumed-150;
			return (temp*1)+(50)*0.75+(100*0.5);
		}
	}

}
