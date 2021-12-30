//Question1
	public class Assignment01 extends Thread  
{  
   public void run()  
    {  
      try {  
          System.out.println("thread is executing now........");  
      } catch(Exception e) {  
      }   
    }  
    public static void main (String[] args) {  
        Assignment01 m1= new Assignment01();  
        m1.start();  
        m1.start();  
    }  
}
/* Expected output:
Exception in thread "main" thread is executing now........
java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:793)
	at myproject/myproject.Multithread1.main(Multithread1.java:16)
*/

//Question02
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.TimeUnit;  
  
public class TestThread {  
   public static void main(final String[] arguments) throws InterruptedException {  
      ExecutorService e = Executors.newSingleThreadExecutor();  
  
      try {  
         e.submit(new Thread());  
         System.out.println("Shutdown executor");  
         e.shutdown();  
         e.awaitTermination(5, TimeUnit.SECONDS);  
      } catch (InterruptedException ex) {  
         System.err.println("tasks interrupted");  
      } finally {  
  
         if (!e.isTerminated()) {  
            System.err.println("cancel non-finished tasks");  
         }  
         e.shutdownNow();  
         System.out.println("shutdown finished");  
      }  
   }  
  
   static class Task implements Runnable {  
        
      public void run() {  
           
         try {  
            Long duration = (long) (Math.random() * 20);  
            System.out.println("Running Task!");  
            TimeUnit.SECONDS.sleep(duration);  
         } catch (InterruptedException ex) {  
            ex.printStackTrace();  
         }  
      }  
   }         
}

/* Expected Output:
Shutdown executor
shutdown finished*/

//Question03
import java.util.concurrent.BlockingQueue;  
import java.util.concurrent.LinkedBlockingQueue;  
import java.util.logging.Level;  
import java.util.logging.Logger;  
public class ProducerConsumerProblem {  
    public static void main(String args[]){  
     
     BlockingQueue sharedQueue = new LinkedBlockingQueue();  
  
  
     Thread prod = new Thread(new Producer(sharedQueue));  
     Thread cons = new Thread(new Consumer(sharedQueue));  
  
    
     prod.start();  
     cons.start();  
    }  
   
}  
  

class Producer implements Runnable {  
  
    private final BlockingQueue sharedQueue;  
  
    public Producer(BlockingQueue sharedQueue) {  
        this.sharedQueue = sharedQueue;  
    }  
  
    @Override  
    public void run() {  
        for(int i=0; i<10; i++){  
            try {  
                System.out.println("Produced: " + i);  
                sharedQueue.put(i);  
            } catch (InterruptedException ex) {  
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);  
            }  
        }  
    }  
  
}  
  

class Consumer implements Runnable{  
  
    private final BlockingQueue sharedQueue;  
  
    public Consumer (BlockingQueue sharedQueue) {  
        this.sharedQueue = sharedQueue;  
    }  
    
    @Override  
    public void run() {  
        while(true){  
            try {  
                System.out.println("Consumed: "+ sharedQueue.take());  
            } catch (InterruptedException ex) {  
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);  
            }  
        }  
    }  
}


/*
Produced: 0
Produced: 1
Produced: 2
Produced: 3
Produced: 4
Produced: 5
Produced: 6
Produced: 7
Produced: 8
Produced: 9
Consumed: 0
Consumed: 1
Consumed: 2
Consumed: 3
Consumed: 4
Consumed: 5
Consumed: 6
Consumed: 7
Consumed: 8
Consumed: 9*/
// Question4

import java.util.Random;  
import java.util.concurrent.ArrayBlockingQueue;  
import java.util.concurrent.BlockingQueue;  
  
public class TestThread {  
  
   public static void main(final String[] arguments) throws InterruptedException {  
      BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);  
  
      Insert i = new Insert(queue);  
      Retrieve r = new Retrieve(queue);  
  
      new Thread(i).start();  
      new Thread(r).start();  
  
      Thread.sleep(2000);  
   }    
  
  
   static class Insert implements Runnable {  
      private BlockingQueue<Integer> queue;  
  
      public Insert(BlockingQueue queue) {  
         this.queue = queue;  
      }  
  
      @Override  
      public void run() {  
         Random random = new Random();  
  
         try {  
            int result = random.nextInt(200);  
            Thread.sleep(1000);  
            queue.put(result);  
            System.out.println("Added: " + result);  
              
            result = random.nextInt(10);  
            Thread.sleep(1000);  
            queue.put(result);  
            System.out.println("Added: " + result);  
              
            result = random.nextInt(50);  
            Thread.sleep(1000);  
            queue.put(result);  
            System.out.println("Added: " + result);  
         } catch (InterruptedException e) {  
            e.printStackTrace();  
         }  
      }      
   }  
  
   static class Retrieve implements Runnable {  
      private BlockingQueue<Integer> queue;  
  
      public Retrieve(BlockingQueue queue) {  
         this.queue = queue;  
      }  
        
      @Override  
      public void run() {  
           
         try {  
            System.out.println("Removed: " + queue.take());  
            System.out.println("Removed: " + queue.take());  
            System.out.println("Removed: " + queue.take());  
         } catch (InterruptedException e) {  
            e.printStackTrace();  
         }  
      }  
   }  
}
/* Expected Output:
Added: 183
Removed: 183
Added: 1
Removed: 1
Added: 40
Removed: 40 */

// Question5
import java.util.concurrent.Executor;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ThreadPoolExecutor;  
import java.util.concurrent.TimeUnit;  
  
public class TestThread {  
   public static void main(final String[] arguments) throws InterruptedException {  
      Executor e = Executors.newCachedThreadPool();  
      e.execute(new Thread());  
      ThreadPoolExecutor pool = (ThreadPoolExecutor)e;  
      pool.shutdown();  
   }    
  
   static class Thread implements Runnable {  
      public void run() {  
         try {  
            Long duration = (long) (Math.random() * 5);  
            System.out.println("Running Thread!");  
            TimeUnit.SECONDS.sleep(duration);  
            System.out.println("Thread Completed");  
         } catch (InterruptedException ex) {  
            ex.printStackTrace();  
         }  
      }  
   }  
}
/* Expected output:
Running Thread!
Thread Completed
*/






