public class Voice
{
    public void prepareVoice()
    {
        Animal[] animal=new Animal[5];
        animal [0]=new Cow();
        animal [1]=new Goat();
        animal [2]=new Pig();
        animal [3]=new Lion();
        animal [4]=new Dog();
        hear(animal);
    }
    void hear(Animal [] animal)
    {
        for(int a=0;a<5;a++)
            animal[a].makeVoice();
    }
}