package Q2;
/*
 * Create a class Rectangle with attributes length and breadth. Include methods to calculate the area and perimeter.
 */

public class Traiangle 
{
    int length;
    int breadth;
    int area;
    int perimeter;

    void Calculation()
    {
        area = (int)(0.5 * length * breadth);
        perimeter = length + breadth + (int)Math.sqrt(length*length + breadth*breadth);
    }

    void display()
    {
        System.out.println("Area of Triangle: " + area);
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

    public static void main(String[] args) 
    {
        Traiangle t = new Traiangle();
        t.length = 5;
        t.breadth = 10;
        t.Calculation();
        t.display();
    }
}
