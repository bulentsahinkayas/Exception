package HomeworkClasses;

import java.util.Scanner;

public class ClassObject2 {

    public static void main(String[] args) {

        Family f1 = new Family();
        PhonePlan p1 = new PhonePlan();

        // int amountOfUser;

        // String familyName;

        // String familyPrimaryUser;

        // String planType;

        //System.out.println("Enter number of user" );
        Scanner s1 = new Scanner(System.in);
        f1.totalUser = Integer.parseInt(s1.nextLine());
        // f1.totalUser = amountOfUser;

        //System.out.println("Enter your family name ");
        // Scanner s2 = new Scanner(System.in);
        f1.familyName = s1.nextLine();
        // f1.familyName = familyName;

        //System.out.println("Enter familyPrimaryUser ");
        // Scanner s3 = new Scanner(System.in);
        f1.familyPrimaryUser = s1.nextLine();
        // f1.familyPrimaryUser = familyPrimaryUser;

        //System.out.println("Enter planType ");
        // Scanner s4 = new Scanner(System.in);
        p1.planType = s1.nextLine();
        // p1.planType = planType;

        f1.getTotalAmount(p1);

    }
    /*
    Main{

  Use Main method here

  Create 4 scanner variable

    int- amountOfUser

    String - familyName

    String - familyPrimaryUser

    String - planType

  Create one object for each class

  While defining the instance variables use scanner variables

  Print the object

  For example:

    Scanner s1 = new Scanner(System.in);

    String familyNameFromScanner = s1.nextLine();

     Family f1 = new Family();

     f1.familyName =familyNameFromScanner;

  Print example
     System.out.println(f1);

4
Testing6
Tester6
premium

}
     */
}
class Family{
    int totalUser;
    int totalAmount;
    String familyName;
    String familyPrimaryUser;

    public void getTotalAmount(PhonePlan plan){
        totalAmount = plan.amount(totalUser) * totalUser;
        System.out.println("total Amount is : "+totalAmount+"\nfamily name is : "+familyName+"\nprimary user is : "+ familyPrimaryUser);
    }

    /*
    Family class{
  Create instance variables

    2 int-  totalUser, totalAmount

    2 String - familyName , familyPrimaryUser

  Create one method name is getTotalAmount

    Parameter is PhonePlan (next Class)

    This method will call the amount method from the PhonePlan class and multiply the result with amountOfUser
    result should be equal to totalAmount

     print  total Amount is : totalAmount
     family name is : familyName
     primary user is : familyPrimaryUser

  Use toString method while printing
}
    print  total Amount is : totalAmount
     family name is : familyName
     primary user is : familyPrimaryUser
     */
}
class PhonePlan{
    String planType;
    int priceForEach;
    public int amount(int totalUser){
        if (planType.equals("eco") && totalUser <= 3){
            priceForEach = 50;
        }
        if (planType.equals("eco") && totalUser > 3 && totalUser <=5){
            priceForEach = 45;
        }
        if (planType.equals("eco") && totalUser > 5){
            priceForEach = 35;
        }
        if (planType.equals("premium") && totalUser <= 3 ){
            priceForEach = 70;
        }
        if (planType.equals("premium") && totalUser > 3 && totalUser <= 5){
            priceForEach = 60;
        }
        if (planType.equals("premium") && totalUser > 5){
            priceForEach = 55;
        }
        return priceForEach;
    }
}
/*
Family class{
  Create instance variables

    2 int-  totalUser, totalAmount

    2 String - familyName , familyPrimaryUser

  Create one method name is getTotalAmount

    Parameter is PhonePlan (next Class)

    This method will call the amount method from the PhonePlan class and multiply the result with amountOfUser
    result should be equal to totalAmount

     print  total Amount is : totalAmount
     family name is : familyName
     primary user is : familyPrimaryUser

  Use toString method while printing
}
PhonePlan class{

  Create instance variables

    1 String - planType

    1 int - priceForEach

  Create one method name is amount

    Parameter is 1 int (totalUser from Family class)

    if planType equal to eco and int is less or equal to 3
      priceForEach is 50

    if planType equal to eco and int is bigger then 3 and less or equal 5
      priceForEach is 45

    if planType equal to eco and int is bigger then 5
      priceForEach is 35

    if planType equal to premium and int is less or equal to 3
      priceForEach is 70

    if planType equal to premium and int is bigger then 3 and less or equal 5
      priceForEach is 60

    if planType equal to premium and int is bigger then 5
      priceForEach is 55

return the priceForEach

}





 */