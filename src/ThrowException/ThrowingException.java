package ThrowException;

public class ThrowingException {
    public static void main(String[] args) {
        try {
            throw new Exception("My custom exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
