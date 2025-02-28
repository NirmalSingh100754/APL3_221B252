public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("\nLazy Solution");
	    
	    SingletonLazy s1=SingletonLazy.getInstance();
	    System.out.println(SingletonLazy.count);
	    SingletonLazy s2=SingletonLazy.getInstance();
	    System.out.println(SingletonLazy.count);
	    SingletonLazy s3=SingletonLazy.getInstance();
	    System.out.println(SingletonLazy.count);
	    
	}
}