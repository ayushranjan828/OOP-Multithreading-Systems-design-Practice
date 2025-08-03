/*
 *Create a thread by implementing the Runnable interface. Print even numbers from 2 to 20.
 */

package Q2;

class EvenNumbersRunnable implements Runnable 
{
    public void run() 
    {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

public class Even_2_to_20 
{
    public static void main(String[] args) 
    {
        Thread thread = new Thread(new EvenNumbersRunnable());
        thread.start();
    }
}
