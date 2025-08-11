/*
 * Open for extension:
 *     If we need a new bakery operation (e.g., DecorateCakeTask), we just add a new class implementing BakeryTask.
 *
 * Closed for modification:
 *     We don’t touch existing BakeryTask classes or BakeryOCP logic.
*/

// Common interface for bakery tasks
interface BakeryTask 
{
    void execute();
}

// Task for baking bread
class BakeBreadTask implements BakeryTask 
{
    @Override
    public void execute() 
    {
        System.out.println("Baking high-quality bread...");
    }
}

// Task for managing inventory
class ManageInventoryTask implements BakeryTask 
{
    @Override
    public void execute() {
        System.out.println("Managing inventory...");
    }
}

// Task for ordering supplies
class OrderSuppliesTask implements BakeryTask 
{
    @Override
    public void execute() {
        System.out.println("Ordering supplies...");
    }
}

// Task for serving customers
class ServeCustomerTask implements BakeryTask 
{
    @Override
    public void execute() {
        System.out.println("Serving customers...");
    }
}

// Task for cleaning the bakery
class CleanBakeryTask implements BakeryTask 
{
    @Override
    public void execute() {
        System.out.println("Cleaning the bakery...");
    }
}

// Main Bakery class
public class BakeryOCP 
{
    public static void main(String[] args) 
    {
        BakeryTask[] tasks = {
            new BakeBreadTask(),
            new ManageInventoryTask(),
            new OrderSuppliesTask(),
            new ServeCustomerTask(),
            new CleanBakeryTask()
        };

        // Run all tasks
        for (BakeryTask task : tasks) 
        {
            task.execute();
        }
    }
}


