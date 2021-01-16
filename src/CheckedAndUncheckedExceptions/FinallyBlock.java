package CheckedAndUncheckedExceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            String str = null;
            char n = str.charAt(9);
            System.out.println(n);
        }catch (NullPointerException e){
            System.out.println("Outside of try catch finally block");
        }finally {
            System.out.println("it executes all the time no matter what happens");
        }

    }
}
