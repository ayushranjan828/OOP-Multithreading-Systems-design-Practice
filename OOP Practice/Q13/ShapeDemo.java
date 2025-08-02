/*
 * Create an abstract class Shape with abstract method draw(). 
 * Implement it in classes like Circle, Rectangle, and Triangle.
 */

abstract class Shape 
{
    public abstract void draw();
}

class Circle extends Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Triangle");
    }
}

class ShapeDemo 
{
    public static void main(String[] args) 
    {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }
}