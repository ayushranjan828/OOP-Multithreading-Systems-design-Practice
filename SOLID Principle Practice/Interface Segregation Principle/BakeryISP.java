/*
 * "Clients should not be forced to depend on methods they do not use."

    This means:
        Instead of having one fat interface that forces classes to implement unused methods,

        We break it into smaller, specific interfaces so classes only implement what they need.
 */

// Small, specific interfaces
interface Baking 
{
    void bake();
}

interface InventoryManagement 
{
    void manageInventory();
}

interface SupplyOrdering 
{
    void orderSupplies();
}

interface CustomerServiceOps 
{
    void serveCustomer();
}

interface Cleaning 
{
    void clean();
}

// Implement only what is needed
class BreadBaker implements Baking 
{
    @Override
    public void bake() 
    {
        System.out.println("Baking high-quality bread...");
    }
}

class InventoryManager implements InventoryManagement 
{
    @Override
    public void manageInventory() 
    {
        System.out.println("Managing inventory...");
    }
}

class Supplier implements SupplyOrdering 
{
    @Override
    public void orderSupplies() 
    {
        System.out.println("Ordering supplies...");
    }
}

class Waiter implements CustomerServiceOps 
{
    @Override
    public void serveCustomer() 
    {
        System.out.println("Serving customers...");
    }
}

class Janitor implements Cleaning 
{
    @Override
    public void clean() 
    {
        System.out.println("Cleaning the bakery...");
    }
}

// Main program
public class BakeryISP 
{
    public static void main(String[] args) 
    {
        Baking baker = new BreadBaker();
        InventoryManagement inventoryManager = new InventoryManager();
        SupplyOrdering supplier = new Supplier();
        CustomerServiceOps waiter = new Waiter();
        Cleaning janitor = new Janitor();

        baker.bake();
        inventoryManager.manageInventory();
        supplier.orderSupplies();
        waiter.serveCustomer();
        janitor.clean();
    }
}
