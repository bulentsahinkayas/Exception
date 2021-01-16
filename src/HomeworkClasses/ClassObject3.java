package HomeworkClasses;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class ClassObject3 {

}
class Total{
    public double StringToDouble(String str){
        str = str.replace("$","");
        str = str.trim();
        double convertedStr = Double.parseDouble(str);
        return convertedStr;
    }
    public double getTotal(LinkedHashMap<String,String> hashMap){
        double value;
        double total = 0.0;
        //  Set<String> keys = hashMap.values();
        for (String value1:hashMap.values()) {
            value = StringToDouble(value1);
            total += value;
        }
        return total;
    }

}
/*
Class Total {
1. Create method named as StringToDouble.
Parameter is a String and Return type is double.
Remove the $ in the String, then change it to double.
Return the double.
2. Create method named as getTotal
Parameter is LinkedHashMap<String,String> and Return type is double.
By using the method StringToDouble:
 a. change values in the LinkedHashMap<String,String> into double values,
 b. sum all the double values and return the total.
}
 */

class Cart{
    String userName;
    LinkedHashMap<String , String> LMap=new LinkedHashMap<>();
    Total total = new Total();

    public void addItem(String str1, String str2){
       LMap.put(str1,str2);


    }
    public void getPrice(Total total){

        total.getTotal(LMap);
    }
    @Override
    public String toString() {

    return "User name is : "+userName+"\nAll elements are : "+LMap+"\nTotal price : "+total.getTotal(LMap);
    }
}
/*
Class Cart {
Create instance variables as:
1. String userName
2. LinkedHashMap<String , String> LMap
Create method named as addItem
Return type is void and parameters are String str1, String str2
Add str1 as key to LMap  and add str2 as value to LMap

Create method named as getPrice
Return type is void and Parameter is Total class
Call getTotal method from Total class.

Create a toString method and print the datas in order such as:
User name is : Your Object username
All elements are : All the key and values in the linkedHashmap
Total price : Total Price of all the values
}
 */
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String username = scan.nextLine();
        String item1 = scan.nextLine();
        String item1Price = scan.nextLine();
        String item2 = scan.nextLine();
        String item2Price = scan.nextLine();
        String item3 = scan.nextLine();
        String item3Price = scan.nextLine();

        Cart cart1 =new Cart();
        cart1.userName=username;

        cart1.addItem(item1,item1Price);
        cart1.addItem(item2,item2Price);
        cart1.addItem(item3,item3Price);

        Total total1 = new Total();
        cart1.getPrice(total1);

        System.out.println(cart1);

    }



}
/*

Class Main {
Create scanners for username, items and itemPrices.
Add the items and itemPrices to LinkedHashMap from Cart class.
Print your object
For example:
 username = Junior
 item1 -- Eggs     item1Price -- $3.19
 item2 -- Bread    item2Price -- $5.23
 item3 --  Water   item3Price -- $6.23
Print should be as
User name is : James
All elements are :{Eggs=$3.19, Bread=$5.23, Water=$6.23}
Total price : 14.65
}

 */
