public class SingletonEager
{
    public static int count=0;
    private static SingletonEager UniqueInstance=new SingletonEager();
    private SingletonEager()
    {count++;}
    public static SingletonEager getInstance()
    {
        return UniqueInstance;
    }
}


// DP2={"Single Object Creation"," Eager Solution","Multi Threaded Environment"}