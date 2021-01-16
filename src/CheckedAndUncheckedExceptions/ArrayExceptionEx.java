package CheckedAndUncheckedExceptions;

public class ArrayExceptionEx {
    public static void main(String[] args) {
        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
        try {
            int[] myIntArray = new int[]{1, 2, 3}; //0,1,2
            print4hItemInArray(myIntArray);
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        System.out.println("Fourth line");
        System.out.println("Fifth line");
        try {
            Thread.sleep(3000); // checked exception ( it is mandatory to handle during compile  )
        }catch (Exception e){

        }

    }

    private static void print4hItemInArray(int[] myIntArray) {
        System.out.println(myIntArray[3]);
        System.out.println("Fourth element successfully displayed!");
    }
}
