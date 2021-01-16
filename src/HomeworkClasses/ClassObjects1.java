package HomeworkClasses;

public class ClassObjects1 {
    public static void main(String[] args) {
        int number1 = -5;
        int number2 = -65;
        int number3 = -30;
        System.out.println( result(number1, number2, number3));
    }
    public static String result(int num1, int num2,int num3){
        Calculation calculation = new Calculation();
        String result = calculation.examResult(num1, num2, num3);

            if (result.equals("A++")) {
                return "Your result is good and it is A++ You passed Yeayyy";
            } else if (result.equals("A")) {
                return "Your result is good and it is A You passed Yeayyy";
            } else if (result.equals("B++")) {
                return "Your result is okay and it is B++ You passed Yeayyy";
            } else if (result.equals("B")) {
                return "Your result is okay and it is B You passed Yeayyy";
            } else if (result.equals("C")) {
                return "Your result could be better but you passed and it is C";
            } else if (result.equals("F")) {
                return "Your result is Not good enough it is F . See you next year bro.";
            } else {
                return "This is not a valid input";
            }

    }
}
class Calculation{
    public int average(int num1, int num2,int num3){

            int average = (int) (num1 + num2 + num3)/3;
            return average;

    }
    public String examResult(int number1, int number2,int number3) {
        int result = average(number1, number2, number3);
        if((number1 >= 0 && number1 <= 100) && (number2 >= 0 && number2 <= 100) && (number3 >= 0 && number3 <= 100)){
           result = average(number1, number2, number3);
            if (result <= 100 && result >= 90) {
                return "A++";
            }
            if (result < 90 && result >= 70) {
                return "A";
            }
            if (result < 70 && result >= 60) {
                return "B++";
            }
            if (result < 60 && result >= 50) {
                return "B";
            }
            if (result < 50 && result >= 40) {
                return "C";
            }
            if (result < 40 && result >= 0) {
                return "F";
            } else {
                return "This is not a valid input";
            }
        }else {
            return "This is not a valid input";
        }

    }
}
/*

Main class{
     Create a method name is result()
    This method has 3 int as parameters
    Inside result method, call method average in the Calculation class using by 3 int as parameters
     Inside result method, call method examResult in the Calculation class using by number from the average method as int parameter
    If the result from examResult is = A++ or A
    Return "Your result is good and it is A++ You passed Yeayyy" or "Your result is good and it is A You passed Yeayyy"
    If the result from examResult is = B++ or B
    Return "Your result is okay and it is B++ You passed Yeayyy" or "Your result is okay and it is B You passed Yeayyy"
    If the result from  examResult is = C
    Return "Your result could be better but you passed and it is C"
    If the result from  examResult is = F
    Return "Your result is Not good enough it is F . See you next year bro."
}
Calculation Class{
1) Create a method name is average
parameter is 3 int
return type is int
this method return the average of 3 numbers
2) Create a method name is examResult
Parameter is 1 int num
if the num less then or equal to 100 and bigger equal to 90
return is A++
if the num less then 90 and bigger equal to 70
return is A
if the num less then 70 and bigger equal to 60
return is B++
if the num less then 60 and bigger equal to 50
return is B
if the num less then 50 and bigger equal to 40
return is C
if the num less then 40 and bigger equal to 0
return F
if the num less then 0 and more then 100
return This is not a valid input
}
 */