
// Exceptions and Errors

// Compile time errors --> due to syntax
// Logical errors --> due to logic errors
// Run time errors --> stop the execution due to some issues

// Exception

public class Code12 {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;
        int result = 0;
        int nums[] = { 1, 4, 6 };

        // to hamdle the exceptions we use try-catch blocks
        try {
            result = i / j;
            System.out.println(nums[3]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong..");
        } catch (Exception e) {
            System.out.println("Unchecked Exception...");
        }
        finally{
            System.out.println("Finally block is called..");
        }
        System.out.println(result);
    }
}

class AnotherClass extends Code12 {
    public void anotherFun() {
        int a = 5;
        int b = 6;
        int result = 10;
        try {

            // if i want to throw the error manually then,
            // throw keyword is used
            result = a / b;
            if (result == 0) {
                throw new ArithmeticException();
            }

        } catch (Exception e) {
            System.out.println("Cannot divide by zero...");
        }
    }

    // Two types of Exceptions:
    // --> Unchecked : (Compiler is not focusing on)
    // --> Checked : (Compiler will force to handle exceptions), such as IO
    // Exception. for this we use throws keyword
}
