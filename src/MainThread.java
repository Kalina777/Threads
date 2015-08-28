
/**
 * Author: admin
 * Description:
 *         This file contains the MainThread class.  
 *         It's a controller class that instantiates 5 objects of each class and runs each object
 */
 

 
/**
 *
 * @author Admin
 */
public class MainThread {
 
    /**
     * main - it creates 5 objects of each class and runs each object
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting threads...");
         
        // create five IO threads
        Thread IOThread1 = new Thread(new IOThread("IOThread1"));
        Thread IOThread2 = new Thread(new IOThread("IOThread2"));
        Thread IOThread3 = new Thread(new IOThread("IOThread3"));
        Thread IOThread4 = new Thread(new IOThread("IOThread4"));
        Thread IOThread5 = new Thread(new IOThread("IOThread5"));
         
                // create five Sum threads
        Thread SumThread1 = new Thread(new SumThread("SumThread1"));
        Thread SumThread2 = new Thread(new SumThread("SumThread2"));
        Thread SumThread3 = new Thread(new SumThread("SumThread3"));
        Thread SumThread4 = new Thread(new SumThread("SumThread4"));
        Thread SumThread5 = new Thread(new SumThread("SumThread5"));
         
         
        // start IO threads      
        IOThread1.start();
        IOThread2.start();
        IOThread3.start();
        IOThread4.start();
        IOThread5.start();
                 
                // start Sum threads         
        SumThread1.start();
        SumThread2.start();
        SumThread3.start();
        SumThread4.start();
        SumThread5.start();
         
        // put the main threads asleep for 15 seconds        
        Thread.sleep(15000);
         
        System.out.println("ending threads...");
//                long t;
//        t = IOThread.getStartTime();
//        System.out.println("my t is ... " +t);
    }
     
}