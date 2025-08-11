// Base class
abstract class BakeryItem 
{
    public abstract void prepare();
    public abstract void pack();
}

// Bread is a BakeryItem
class Bread extends BakeryItem 
{
    @Override
    public void prepare() 
    {
        System.out.println("Preparing fresh bread dough...");
    }

    @Override
    public void pack() 
    {
        System.out.println("Packing bread in paper bag.");
    }
}

// Cake is a BakeryItem
class Cake extends BakeryItem 
{
    @Override
    public void prepare() 
    {
        System.out.println("Baking and decorating a cake...");
    }

    @Override
    public void pack() 
    {
        System.out.println("Packing cake in a cake box.");
    }
}

// Main class
public class BakeryLSP 
{
    public static void main(String[] args) 
    {
        BakeryItem bread = new Bread();
        BakeryItem cake = new Cake();

        deliverItem(bread);
        deliverItem(cake);
    }

    // Method accepts BakeryItem, works for any subclass
    public static void deliverItem(BakeryItem item) 
    {
        item.prepare();
        item.pack();
        System.out.println("Delivered!\n");
    }
}
