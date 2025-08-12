// Step 1: Product Interface
interface Shape 
{
    void draw();
}

// Step 2: Concrete Products
class Circle implements Shape 
{
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Creator (Factory)
abstract class ShapeFactory 
{
    abstract Shape createShape(); // Factory Method
}

// Step 4: Concrete Factories
class CircleFactory extends ShapeFactory 
{
    @Override
    Shape createShape() 
    {
        return new Circle();
    }
}

class RectangleFactory extends ShapeFactory 
{
    @Override
    Shape createShape() 
    {
        return new Rectangle();
    }
}

// Step 5: Client
public class Factory_Method_Main 
{
    public static void main(String[] args) {
        
        ShapeFactory factory1 = new CircleFactory();
        Shape shape1 = factory1.createShape();
        shape1.draw();

        ShapeFactory factory2 = new RectangleFactory();
        Shape shape2 = factory2.createShape();
        shape2.draw();
    }
}
