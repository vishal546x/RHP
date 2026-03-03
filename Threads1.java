import java.util.*;
class Threads1 extends Thread 
{
    public static void main(String[] args)
    {
        Main t1 = new Main();
        t1.start();  
    }
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Count: " + i);
            try
            {
            	Thread.sleep(50);
            }
            catch(InterrupteException e)
            {
            	System.out.println("Exception");
            }
        }
    }
}
