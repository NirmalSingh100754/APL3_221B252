
public class Main{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Rum(offering);
		offering = new RoohAfza(offering);
		System.out.println(" Contents : " + offering.getName());
		System.out.println(" Total :  $ " + offering.getPrice());
	}
}