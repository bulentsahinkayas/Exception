package HomeworkClasses;

import java.util.Arrays;

public class TryCatch_1 {
    public static void main(String[] args) {
    String[] myArray = {};
    int num =7;
        System.out.println(nullPointer(myArray,num));
    }
    public static String nullPointer(String[] strArray, int number) {
        try {
            if (strArray.length > number) {
                return Arrays.toString(strArray);
            }
        } catch (NullPointerException e) {

        }
        return "Invalid number!!!";
    }
}

/*
Create a method name is nullPointer()

Parameter is String array and , one int  number

return type is String

if the int number is less then length of the array return the String

if the number is more than array length then return  "Invalid number!!!"

Note: Do not use if statement use try catch block
 */