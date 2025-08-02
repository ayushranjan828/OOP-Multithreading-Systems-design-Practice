/*
 * Demonstrate encapsulation by creating a Person class with private fields and public getters/setters.
 */
package Q9;

public class Person 
{
    private String name;
    private int age;
    
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        if (age >= 0) 
        {
            this.age = age;
        } else 
        {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) 
    {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(25);
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        person.setAge(-5); // This will trigger the validation message
    }
}
