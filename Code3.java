import java.security.Key;

public class Code3{
    public static void main(String[] args) {

    Code3 obj1 = new Code3();

        
    }
    
}

class Keyboard{

    //instance variables
    int keys = 12;
    String color = "White";

    //constant
    final int keysCount = 100;


    //Method or function declaration
    public void KeyboardFunction(int keys, String color){
        System.out.println("This keyboard has "+keys+" keys and color is "+color);
    }

    public int numberOfKeys(int keys){
        System.out.println("Number of keys are "+keys);
        return keys;
    }

    public int simpleMethod(){
        System.out.println("This method is taking no arguments");
        int updatedKeys = 200;  //Block variable
        return updatedKeys;
    }

   // obj is Reference variable
    Keyboard obj = new Keyboard();  //object creation and declaration
                    // Keyboard() <--- this is a constructor same as class name but no return type
    

    
    // Constructor declaration below
    public Keyboard(){
        System.out.println("Constructor Called");
    }


    void customMethod(){
        System.out.println("Custom method called");
    }
    

}
