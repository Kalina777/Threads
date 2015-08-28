/**
 * Author: admin
 * Description:
 *         This file contains the IOThread class.  
 *         
 **/
 

/**
 *
 * @author Admin
 */
//This class supports a running thread that runs an IO intensive operation - writing numbers to the system out 100 times
public class IOThread implements Runnable{
     
        // static holding the number of times to write numbers to the system 
    private static final int ITERATIONCOUNT = 10;
        // name of the running thread    
    private String threadName = "";
     
        private static long startTime;
        private long endTime;
    /**
     * Constructor
     * @param threadName - name of the thread
     */
    public IOThread(String threadName) {
        this.threadName = threadName;
                 
    }
     
    /**
     * run method
     */
    public void run() {
            startTime = System.nanoTime();
            System.out.println("Thread " + threadName +" start time is " + startTime);
        try{
        for (int i = 0; i < ITERATIONCOUNT; i++) {           
             
            System.out.println("Thread: " + threadName + " " + i*10);
        }
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
