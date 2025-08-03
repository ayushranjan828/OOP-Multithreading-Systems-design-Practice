/*
 * 1.	Create a thread by extending the Thread class. Print numbers from 1 to 10 in the thread.
 */
class PrintNumbersThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(i);
        }
    }
}

public class Print_1_to_10 {
    public static void main(String[] args) 
    {
        PrintNumbersThread thread = new PrintNumbersThread();
        thread.start();
    }
}