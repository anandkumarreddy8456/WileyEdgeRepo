package multi_Threading_Practises;

public class JoinDemo {
	
	// join will wait to complete the excution of Mentioned Thread
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new VenueFixing().start();
		new CardsPrinting().start();
		new CardsDistrubtion().start();
		new CardsDistrubtion().join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
class VenueFixing extends Thread{
	public void run() {
		for(int i=0;i<10;i++) 
			System.out.println(" Venue Fixing");
	}
}
class CardsPrinting extends Thread{
	
	public void run() {
		
		try {
			
			new VenueFixing().join();
			
		} catch ( Exception e) {
			
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) 
			System.out.println(" Cards Printing");
	}
}
class CardsDistrubtion extends Thread{
	public void run() {
		try {
			new CardsPrinting().join();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) 
			System.out.println(" Cards Distrubution");
	}
}
