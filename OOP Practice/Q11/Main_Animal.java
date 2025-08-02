/*
 * Create a class Animal with method makeSound(). 
 * Inherit it into classes like Dog, Cat, Cow, each overriding the method. 
 * Demonstrate runtime polymorphism.
 */
package Q11;

class Animal 
{
    void makeSound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal 
{
    @Override
    void makeSound() 
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal 
{
    @Override
    void makeSound() 
    {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal 
{
    @Override
    void makeSound() 
    {
        System.out.println("Cow moos");
    }
}

public class Main_Animal
{
    public static void main(String[] args) 
    {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();
        Animal animal = new Animal();

        myDog.makeSound(); 
        myCat.makeSound(); 
        myCow.makeSound(); 
        animal.makeSound();
    }
}