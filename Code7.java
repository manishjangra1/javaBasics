public class Code7 {

    public static String brand = "Apple";
    // static variables can be accessed all over the classes.
    // these can be called without creating the object.
    public static void main(String[] args) {
        // this main ,ethod has its stack memory.

        Keyboard obj1 = new Keyboard();
        // there is reference variable obj1 whose values are stored in heap memory
        // but there memory locations are stored in stack memory.
        // the number of objects are created in heap memory that's why the heap memory is expandable
        // but fixed shape stack memory.

    }

    public void throwIt(){

        int nums = 100;  //this is stored in stack. Every method has their own stack.
        System.out.println("got hit");
    }

}

class Keyboard{

}
