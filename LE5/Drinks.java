abstract class Drinks
{
    private void pour(int qty)
    {
        System.out.println("Add "+qty+" amount of bevearge in a glass.");
    }
    protected abstract void addCondimant();
    protected void stir()
    {}
    private void serve()
    {
        System.out.println("Serve the drink through waiter.");
    }
    public final void templateMethod(int qty)
    {
        por(qty);
        addCondimant();
        stir();
        Serve();
    }
}