// Step 1: Abstract Product Interfaces
interface Button 
{
    void paint();
}

interface Checkbox 
{
    void paint();
}

// Step 2: Concrete Products - Windows
class WindowsButton implements Button 
{
    public void paint() 
    {
        System.out.println("Rendering a Windows style button");
    }
}

class WindowsCheckbox implements Checkbox 
{
    public void paint() 
    {
        System.out.println("Rendering a Windows style checkbox");
    }
}

// Step 3: Concrete Products - Mac
class MacButton implements Button 
{
    public void paint() 
    {
        System.out.println("Rendering a Mac style button");
    }
}

class MacCheckbox implements Checkbox 
{
    public void paint() 
    {
        System.out.println("Rendering a Mac style checkbox");
    }
}

// Step 4: Abstract Factory Interface
interface GUIFactory 
{
    Button createButton();
    Checkbox createCheckbox();
}

// Step 5: Concrete Factories
class WindowsFactory implements GUIFactory 
{
    public Button createButton() 
    {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() 
    {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIFactory 
{
    public Button createButton() 
    {
        return new MacButton();
    }
    public Checkbox createCheckbox() 
    {
        return new MacCheckbox();
    }
}

// Step 6: Client Code
public class Abstract_Factory_Main 
{
    public static void main(String[] args) 
    {
        // You can easily switch the factory without changing client code
        GUIFactory factory;

        // Example: choose factory based on OS
        String os = "Windows"; // could come from config
        if (os.equalsIgnoreCase("Windows")) 
        {
            factory = new WindowsFactory();
        } 
        else 
        {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
