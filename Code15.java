
// Runnable Interface

public class Code15 {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{
        t1.join();
        t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Byeee....");
        
    }
    
}

class A implements Runnable{
    // Priority is not available in this
    public void run(){
        show();
    }

    public void show(){
        System.out.println("A thread..");
    }

}

class B implements Runnable{

    public void run(){
        show();
    }

    public void show(){
        System.out.println("B thread..");
    }

}