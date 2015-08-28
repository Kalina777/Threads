/**
 * Author: admin
 * Description:
 *         This file contains the SumThread class.  
 *         
 **/
 

 
/**
 * This class supports running a thread that adds numbers
 * to a sum.  The sum is a class
 * variable.
 */
public class SumThread implements Runnable{
         
    // class variable holding a sum  
    private static int sum = 0;
     
    // static holding the number of times to increment 
    // the sum
    private static final int ITERATIONCOUNT = 10;
     
    private static long startTime;
        private long endTime;
    // name of the running thread    
    private String threadName = "";
     
    /**
     * Constructor
     * @param threadName - name of the thread
     */
    public SumThread(String threadName) {
        this.threadName = threadName;
    }
     
    /**
     * run method
     */
    public void run() {
         startTime = System.nanoTime();
            System.out.println("Thread " + threadName +" start time is " + startTime);
        try{
        sum = 0;
         
        for (int i = 0; i < ITERATIONCOUNT; i++) {           
            sum += 1;
            
        }
        System.out.println("Thread: " + threadName + " balance= " + sum);
        }
        finally{
                    endTime = System.nanoTime();
                                System.out.println("Thread " + threadName +" end time is " + endTime);
                                System.out.println("Thread " + threadName +" Runtime is " + (endTime-startTime) + " nano seconds.");
 
                }
    }
     
    //        private void setStartTime (long startTime){
//            this.startTime = startTime;
//        }
         
        public static long getStartTime(){
            return startTime;
        }
}
