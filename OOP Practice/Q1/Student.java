package Q1;
/*
 * Create a class Student with attributes name, rollNumber, and marks.
 *  Write methods to input and display student details.
 */

import java.util.Scanner;
public class Student 
{
    String name;
    int rollNumber;
    double marks;

    void inputStudentDeatils()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        marks = sc.nextDouble();

        sc.close();
    }

    void displayStudentDetails()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) 
    {
        Student st = new Student();

        st.inputStudentDeatils();
        st.displayStudentDetails();
    }
}