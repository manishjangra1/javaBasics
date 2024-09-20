public class Code2 {
    public static void main(String...args){

        //Declaring a variables
        int a =23;
        int b = 89;

        //Operators
        int result = a+b;
        int result2 = a/b;
        int result3 = a*b;

        boolean b1  = a>b;
        boolean b2  = a<b;
        boolean b3 = a ==b;
        boolean b4 = a!=b;


        // a && b;
        // a || b;
        // a ! b;
        

        System.out.println(result);
        System.out.println(result2);

        //Flow Control
        //if-else

        if (a >b) {
            System.out.println(a+ "is greater");
        }else{
            System.out.println(b+"is greater");
        }


        if (b4) {
            System.out.println("valid");
        } else if(b3) {
            System.out.println(b3+" valid");
        } else{
            System.out.println("Not vaid");
        }

        //Seitch case
        switch (a) {
            case 21:
                System.out.println(" 21 is value");
                break;
            case 22:
                System.out.println("22 si pressed");
                break;
        
            default:
                System.out.println("Nothing pressed");
                break;
        }


        //Loops

        for(int i =0; i< 10; i++){
            System.out.println(i);
        }

        //other method of declaring for loop
        int i=0;
        for(;i<10;){
            System.out.println(i);
        }

        // for ( String i : students) {
        //     System.out.println(i);
        // }

        while (b >10) {
            System.out.println(b);
            b--;
        }

        do {
            System.out.println(b);
            b++;
        } while (b >10);
        

    }
}
