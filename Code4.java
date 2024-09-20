//inheritance

public class Code4 {
    public static void main(String[] args) {
        B newObj = new B();
        newObj.functionCall();
    }
}

class A extends Code4{
    int num = 13;
    String name = "Manish Jangra";
    int rollNo = 2101999;
    String course = "Btech";

    public void func1(){
        System.out.println("Func1 called");
    }
}

class B extends A{
    A obj1 = new A();

    void functionCall(){
        obj1.func1();
    }
    

}
