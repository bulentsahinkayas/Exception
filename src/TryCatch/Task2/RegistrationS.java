package TryCatch.Task2;

public class RegistrationS {
    public static int countLetters(String input) {
        if(input == null){
//            return 0;
            throw new IllegalArgumentException("The input cannot be null");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = Character.toLowerCase(input.charAt(i));
            if(charAt >= 'a' && charAt <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static int countNumbers(String input) {
        if(input == null){
            throw new IllegalArgumentException("The input cannot be null");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if(charAt >= '0' && charAt <= '9') {
                count++;
            }
        }
        return count;
    }
    public static boolean checkPassword(String password){
        if(password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        if(password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if(password.trim().isEmpty()){
            throw new IllegalArgumentException("Password cannot contain only spaces");
        }
        if(countNumbers(password) < 3) {
            throw new IllegalArgumentException("Password must contain at least 3 digits");
        }
        if(countLetters(password) < 3){
            throw new IllegalArgumentException("Password must contain at least 3 letters");
        }
        if(password.length() < 6) {
            throw  new IllegalArgumentException("Password should be at least 6 characters long");
        }
        return true;
    }
}
/*
Create class Registration
________________________________________________________
create a methods that take a string and return int:
first method should count how many letters are in a string
second method should count how many numbers are in a string
--------------------------------------------------------
 */
/*
Inside class Registration:
Create method checkPassword, where we will check password for validity

Password rules:
* must not be null
* must not be empty
* must not contain only spaces
* must contain at least 3 digits
* must contain at least 3 letters
* must have a length of 6

throw IllegalArgumentException for any rule that's not valid
 */