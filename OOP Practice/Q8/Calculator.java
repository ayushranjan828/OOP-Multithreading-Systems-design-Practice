/*
 *Write a class Calculator with overloaded methods add() to add integers, floats, and arrays.
 */
package Q8;

public class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }  
    
    public float add(float a, float b)
    {
        return a + b;
    }

    public int add(int[] numbers)
    {
        int sum = 0;
        for (int number : numbers) 
        {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();


        int intSum = calculator.add(5, 10);
        System.out.println("Sum of integers: " + intSum);

        float floatSum = calculator.add(5.5f, 10.2f);
        System.out.println("Sum of floats: " + floatSum);

        int[] numbers = {1, 2, 3, 4, 5};
        int arraySum = calculator.add(numbers);
        System.out.println("Sum of array: " + arraySum);
        
    }
}
