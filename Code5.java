//Working with constructors

public class Code5 {
    public static void main(String[] args) {
        int keys = 104;
        String color = "White";

        Keyboard obj = new Keyboard();
        obj.setNumber(9053015360l);
        System.out.println(obj.getNumber());

    }
    
}

class Keyboard{
    private long number;
    private String name;

    public void setNumber(long number){
        this.number = number;

    }

    public long getNumber(){
        return this.number;
    }

}
