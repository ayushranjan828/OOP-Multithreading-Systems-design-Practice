// Singleton class
class Singleton 
{
    // Step 1: Create a private static variable to store the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private so no other class can instantiate it
    private Singleton() 
    {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to return the single instance
    // Thread-safe using synchronized keyword
    public static synchronized Singleton getInstance() 
    {
        if (instance == null) 
        {
            instance = new Singleton();  // Lazy initialization
        }
        return instance;
    }

    public void showMessage() 
    {
        System.out.println("Hello from Singleton!");
    }
}

// Main class to test the Singleton
public class Singleton_Main 
{
    public static void main(String[] args) 
    {
        // Try to get two instances
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Call method
        obj1.showMessage();

        // Check if both objects are same
        System.out.println("Are both instances same? " + (obj1 == obj2));
    }
}
