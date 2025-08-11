// Abstraction
interface Baker 
{
    void bake();
}

// Low-level module 1
class BreadBaker implements Baker 
{
    @Override
    public void bake() 
    {
        System.out.println("Baking bread...");
    }
}

// Low-level module 2
class CakeBaker implements Baker 
{
    @Override
    public void bake() 
    {
        System.out.println("Baking cake...");
    }
}

// High-level module
class Bakery 
{
    private Baker baker;

    // Inject the dependency (Constructor Injection)
    public Bakery(Baker baker) 
    {
        this.baker = baker;
    }

    public void startBaking()
    {
        baker.bake();
    }
}

// Main
public class BakeryDIP 
{
    public static void main(String[] args) 
    {
        // We can change baking style without touching Bakery class
        Bakery breadBakery = new Bakery(new BreadBaker());
        Bakery cakeBakery = new Bakery(new CakeBaker());

        breadBakery.startBaking();
        cakeBakery.startBaking();
    }
}
