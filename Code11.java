
// Abstraction and Interface

public class Code11 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Dev dev1 = new Dev();
        dev1.code(desk);

        InterCode1 inte = new InterCode1();
        inte.fun1();

    }
}

//abstract class below
// --> Objects cannot be created of abstract class

abstract class Computer{

    //abstract method below
    //if we are inheriting abstract class in some other class then,
    //the method inside the abstract class must be implemented.
    public abstract void compiler();
}


//below classes are extending abstract class
class Laptop extends Computer{
    public void compiler(){
        System.out.println("Compiling....");
    }
}

class Dev{
    public void code(Computer device){
        System.out.println("Coding...");
        device.compiler();
    }
}

class Desktop extends Computer{
    public void compiler(){
        System.out.println("Compiling faster...");
    }
}


// <------------------------->

//Interface

// Instead of creating Abstract class and only abstract method inside that class,
// we can create interface in which method is only declared.
// Interface is bydefault  public and abstract. we need not to write that.

//interface created
interface InterCode{
    // variables are final inside interface
    int price = 100000;
    void run();
}

interface Portable{
    void move();

    // dafault method can also be created in which body can also be provided to the method.
    default void fun1(){
        System.out.println("Fun1 running....");
    }
}

//other class can implements this interface

class InterCode1 implements InterCode, Portable{
    public void run(){
        System.out.println("Implemented class running...");
    }

    public void move(){
        // price = 20000; <--- we can't change as variables inside an interface are bydefault final.
        System.out.println("Interface moving...");
    }

    @Override
    public void fun1() {
        // TODO Auto-generated method stub
        Portable.super.fun1();
    }
}