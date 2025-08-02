/*
 * Write a class Car with properties like model, speed, and fuel. Implement a method to accelerate and refuel.
 */
package Q4;

public class Car 
{
    public String model;
    public int speed;
    public int fuel;

    Car(String model, int speed, int fuel) 
    {
        this.model = model;
        this.speed = speed;
        this.fuel = fuel;
    }

    public void accelerate(int increment) 
    {
        if (fuel > 0) 
        {
            speed += increment;

            // Assume fuel consumption is half the speed increment
            fuel -= increment / 2; 

            if (fuel < 0) 
            {
                fuel = 0; 
            }
        } 
        else 
        {
            System.out.println("Not enough fuel to accelerate.");
        }
    }

    public void refuel(int amount) 
    {
        if (amount > 0) 
        {
            fuel += amount;
            System.out.println("Refueled " + amount + " units. Current fuel: " + fuel);
        } 
        else 
        {
            System.out.println("Invalid refuel amount.");
        }
    }

    public String toString() 
    {
        return "Car Model: " + model + ", Speed: " + speed + " km/h, Fuel: " + fuel + " units";
    }

    public static void main(String[] args) 
    {
        Car myCar = new Car("Toyota", 0, 50);
        System.out.println(myCar);
        
        myCar.accelerate(20);
        System.out.println(myCar);
        
        myCar.refuel(30);
        System.out.println(myCar);
        
        myCar.accelerate(10);
        System.out.println(myCar);
    }
}
