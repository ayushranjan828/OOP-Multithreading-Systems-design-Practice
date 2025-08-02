/*
 * Create a class Circle with a static method to calculate the area given radius. 
 * Demonstrate the use of static keyword.
 */
package Q7;

public class Circle 
{
    static double calculateArea(double radius) 
    {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) 
    {
        double radius = 5.0;
        double area = Circle.calculateArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}
