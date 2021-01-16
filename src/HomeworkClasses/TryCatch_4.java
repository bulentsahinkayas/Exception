package HomeworkClasses;

public class TryCatch_4 {
    public static void main(String[] args) {
        String str = "";
        int number = 0;
        System.out.println(getCharacter(str, number));
    }
    public  static  String getCharacter(String str1,int num ){
        char chr = ' ';

        try{
            chr = str1.charAt(num);
            String convertedChr = Character.toString(chr);
            return convertedChr;
        }catch (IndexOutOfBoundsException e){
            return "Invalid number!!!";
        }

    }
}
/*
Create method name is getCharacter()

Parameter is one String str1 and one int num

Return type is String

Get the char in the position of num from the str1

if the num is bigger then str1 length then return Invalid number!!!

NOTE: Do not use if statement use try catch block
 */