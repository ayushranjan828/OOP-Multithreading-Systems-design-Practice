/*
 * Demonstrate the difference between shallow copy and deep copy using a Cloneable interface. 
 * Use a class Student with a reference to Address.
 */
package Q15;

class Address implements Cloneable 
{
    String city;
    String state;

    public Address(String city, String state) 
    {
        this.city = city;
        this.state = state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone(); 
    }

    @Override
    public String toString() 
    {
        return city + ", " + state;
    }
}

class Student implements Cloneable 
{
    String name;
    Address address;

    public Student(String name, Address address) 
    {
        this.name = name;
        this.address = address;
    }

    public Student shallowCopy() throws CloneNotSupportedException 
    {
        return (Student) super.clone(); 
    }

    public Student deepCopy() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.address = (Address) address.clone(); 
        return cloned;
    }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}

public class CloneTest 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        Address address = new Address("New York", "NY");
        Student student1 = new Student("Alice", address);

        Student shallowCopy = student1.shallowCopy();
        Student deepCopy = student1.deepCopy();

        System.out.println("Original:     " + student1);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy:    " + deepCopy);

        System.out.println("\n--- Modifying address of original ---");
        address.city = "Los Angeles";

        System.out.println("Original:     " + student1);
        System.out.println("Shallow Copy: " + shallowCopy); 
        System.out.println("Deep Copy:    " + deepCopy);    
    }
}
