public class Code8 {
    public static void main(String[] args) {
        
        //Strings

        String str = "Manish";
        str = str +" Jangra";
        // Here the first string is stored in String pool inside the heap memory but 
        // when we are concatinating the other string then it is not changing the
        // previous string but creating another string and saving.
        // That is why the string is immutable
        // location address is stored in Staack memory.
        System.out.println(str);

        String a = "Prince";
        String b = "Prince";
        // Here these 2 variables are sharing same value instead of creating two different values.

        // to make string mutable we uses the concept of StringBuffer
        StringBuffer strB = new StringBuffer("Sahil");
        strB.append(" Junior");

        System.out.println(strB);

        //some string methods

        System.out.println(a.length());
        System.out.println(a.charAt(3));
        System.out.println(a.substring(2,5));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.concat("AB"));
    }
}
