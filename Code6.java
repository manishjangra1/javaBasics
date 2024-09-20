//Polymorphism

public class Code6 {
    public static void main(String[] args) {
           AdvKeyboard obj = new AdvKeyboard();
           obj.mains();

           Code6 obj2 = new Code6();

           //Compile time polymorphism || Method overloading
           obj2.run();
           obj2.run(50, 39);

    }
    public void throwIt(){
        System.out.println("got hard");
    }

    public void run(){
        System.out.println("Running without preparation");
    }

    public void run(int dis, int speed){
        System.out.println("Running with speed "+speed+" and distance is "+dis);
    }

}

class Keyboard{

    public void throwIt(){
        System.out.println("got hit hard");
    }

}

class AdvKeyboard extends Keyboard{
    
    public void mains(){
        Keyboard obj;
        obj = new Keyboard();

        //Below is method overriding || Runtime polymorphism(same methods in different classes)
        obj.throwIt();
    }

}
