package CheckedAndUncheckedExceptions;

public class AnotherException {
    public static void main(String[] args) {
        int c = 0;
        try {
            int a = 10;
            int b = 0;
            c = a / b; // exception occurs here
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("You handled ");
        }catch (Exception e){
            System.out.println("You can't do this");
        }
    }
}
