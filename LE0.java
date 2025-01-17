import java.util.Scanner;
public class Nirmal
{
    int age;
    String name;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public static void main(String[] args)
    {
        Nirmal n=new Nirmal();
        //n-> reference variable
        n.setName("Nirmal Singh");
        n.setAge(23);
        
        System.out.println(n.getName()+" "+n.getAge());
    }
}