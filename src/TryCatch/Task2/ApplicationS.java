package TryCatch.Task2;

import java.util.Scanner;

public class ApplicationS {
    public static boolean signUp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password");
        String password = scanner.nextLine();
        return RegistrationS.checkPassword(password);
    }

    public static void main(String[] args) {
        int count = 0;
        do {
            count++;
            try {
                if(signUp()) {
                    System.out.println("Success!");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (count < 3);
    }
}
/*
Create class Application,
a. Create method signUp, where user will provide a password(Scanner)
b. In main method try signUp method until successful or until user tries 3 times
 */