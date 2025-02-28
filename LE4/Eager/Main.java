public class Main
{
	public static void main(String[] args) {
	    System.out.println("\nEager Solution");
	    
	    SingletonEager se1=SingletonEager.getInstance();
	    System.out.println(SingletonEager.count);
	    SingletonEager se2=SingletonEager.getInstance();
	    System.out.println(SingletonEager.count);
	    SingletonEager se3=SingletonEager.getInstance();
	    System.out.print(SingletonEager.count);
	    
	}
}