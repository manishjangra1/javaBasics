
// Arrays

public class Code9 {
    public static void main(String[] args) {

        //Declaring and initializing the arrau
        int nums[] = {12, 34,54,23, 22};

        for (int i : nums) {
            System.out.println(i+3);
            
        }


        Student s = new Student(2101999,"Manish");

        System.out.println(s.toString());  // toString method is present in Object class


        //array of references
        Student student[] = new Student[4];  //we can declare array of references using this syntax

        student[0] = new Student(2101983, "Ishan");
        student[1] = new Student(2101999, "Manish");
        student[2] = new Student(2102020,"Piyush" );
        student[3] = new Student(2102039,"Sahil Junior" );
        

        for (Student std : student) {
            System.out.println(std.name+" "+std.rollNo);
        }


    }
}

class Student extends Object{
    // Bydefault, every class extends Object class
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
