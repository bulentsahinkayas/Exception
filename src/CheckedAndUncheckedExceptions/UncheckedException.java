package CheckedAndUncheckedExceptions;

public class UncheckedException {
    public static void main(String[] args) {
        int c = 0;
        try {
            int a = 10;
            int b = 0;
            c = a / b; // exception occurs here
            System.out.println(c);
        }catch (NullPointerException e){
            System.out.println("You handled your exception");
        }catch (ArithmeticException e){

            System.out.println("You have the correct exception");

        }
        // unchecked exception
        int sum = 5 * 8;
        System.out.println(sum);
        String myName = "Bulent";
        System.out.println(myName);
    }
}
