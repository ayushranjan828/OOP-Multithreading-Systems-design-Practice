/*
 * Demonstrate the use of this keyword with constructors and method chaining using a class Employee.
 */
package Q6;

public class Employee 
{
    public String name;
    public int age;
    public String department;

    Employee(String name, int age, String department) 
    {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    Employee(String name, int age) 
    {
        this(name, age, "General"); // Default department
    }

    Employee(String name) 
    {
        this(name, 0, "General"); // Default age and department
    }

    public String displayInfo() 
    {
        return "Employee Name: " + name + ", Age: " + age + ", Department: " + department;
    }

    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("Alice", 30, "HR");
        System.out.println(emp1.displayInfo());

        Employee emp2 = new Employee("Bob", 25);
        System.out.println(emp2.displayInfo());

        Employee emp3 = new Employee("Charlie");
        System.out.println(emp3.displayInfo());
    }    
}
