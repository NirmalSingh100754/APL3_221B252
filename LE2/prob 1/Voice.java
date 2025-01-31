public class Voice
{
    private Animal[] animal=new Animal[5];
    public void prepareVoice()
    {
        animal [0]=new Cow();
        animal [1]=new Goat();
        animal [2]=new Pig();
        animal [3]=new Lion();
        animal [4]=new Dog();
    }
    void hear()
    {
        for(int a=0;a<5;a++)
            animal[a].makeVoice();
    }
}