import java.util.*;
class Threads2 implements Runnable 
{
    public static void main(String[] args) 
    {
        Main obj = new Main();
        Thread t1 = new Thread(obj);
        t1.start();
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try 
            {
                Thread.sleep(500);
            } catch (InterruptedException e) 
            {
                System.out.println("Exception");
            }
        }
    }
}
