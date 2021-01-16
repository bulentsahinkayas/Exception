package HomeworkClasses;

public class TryCatch_5 {
    public static void main(String[] args) {
        String str = null;
        int number = 3;
        System.out.println(getChar(str, number));

    }
    public static String getChar (String str1, int num) {
        char chr = ' ';
        try {
            if (str1.equals(null)) ;
        } catch (NullPointerException e) {
            return "String can not be null";
        }

        try {
            chr = str1.charAt(num);
            String convertedChr = Character.toString(chr);
            return convertedChr;
        } catch (IndexOutOfBoundsException e) {
            return "Invalid number!!!";
        }
    }

}
/*
Create a method name is getChar()

Parameter is one string and one int

return type is String

Get the char in the position of num from the str1

if the String is null

return String can not be null
 */