public class SingletonLazy
{
    private static SingletonLazy UniqueInstance;
    static int count=0;
    private SingletonLazy()
    {count++;}
    public static SingletonLazy getInstance()
    {
        if(UniqueInstance==null){
            UniqueInstance=new SingletonLazy();
            
        }
        return UniqueInstance;
    }
}


// DP1={"Single Object Creation"," Lazy Solution","Single Threaded Environment"}