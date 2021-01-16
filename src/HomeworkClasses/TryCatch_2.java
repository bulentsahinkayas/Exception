package HomeworkClasses;

public class TryCatch_2 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 0;
        System.out.println(divide(number1, number2));
    }
    public static int divide(int num1,int num2){
        int result = 1;
        try{
            result = num1 / num2;
            return result;

        }catch(ArithmeticException e){
            return -1;
        }
    }
}
