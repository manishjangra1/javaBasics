
// Threads in Java

/*Thread is a subprocess of process as smallest unit of processes. 
 * also has separate path of execution. 
 * High Efficiency.
 */
/*Multiple threads running at same time --> Mutlithreading */

/*
 * Multitasking can be enabled in two ways given below
 * Process-Based Multitasking --> 
 *      cost of communication high as process are heavyweight
 * 
 * Thread-Based Multitasking -->
 *      are lightweight and share same address space, cost of communication low
 */

 public class Code14 {
    public static void main(String[] args) {
        new A().start();
        new B().start();

        // Priority can also be set
    }   
}

/* To make these both classes or methods work together we have to extend these
 * classes with Thread.
 * Secondly, the method should be run() in which the other methods are called
 */

 /* There is time sharing between different methods or threads executing parallely */

class A extends Thread{

    public void run(){
        show();
    }

    public void show(){
        for(int i = 1; i<=500; i++){
            System.out.println("Hii");
            try {
                Thread.sleep(10);  /* checked exception. To handle this we have to write this in try-catch block or throws exception */
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    
        }
    }
}

class B extends Thread{

    public void run(){
        show();
    }

    public void show(){
        for(int i =1; i<=600; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10); /* checked exception. To handle this we have to write this in try-catch block or throws exception */
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* The one major limitation of using threads is that we cannot extends further classes
     * as JAVA does not support multiple inheritance.
     * So we can Implements Runnable discussed in Code15.java.
     * 
     */
}

