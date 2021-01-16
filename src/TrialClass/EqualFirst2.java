package TrialClass;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class EqualFirst2 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Total total = new Total();
        LinkedHashMap<String , String> LMap = new LinkedHashMap<>();

        String item1 = "Eggs";
        String item1Price = "$3.19";
        String item2 = "Bread";
        String item2Price = "$5.23";
        String item3 = "Water";
        String item3Price = "$6.23";

        addItem(item1,item1Price);
        addItem(item2,item2Price);
        addItem(item3,item3Price);
        System.out.println(total.getTotal(LMap));
    }
    public static void addItem(String str1, String str2){
        LinkedHashMap<String , String> LMap;

 //       Set<String> stringSet = LMap.keySet();


//        str2 = LMap.get(str1);
//        LMap.put(str1,str2);
 //       System.out.println(LMap);
    }
    @Override
    public  String toString() {

        return "\nAll elements are : ";
    }

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
        Set<String> keys = hashMap.keySet();
        for (String key:keys) {
            value = Double.parseDouble(hashMap.get(key));
            total += value;
        }
        return total;
    }

}
/*
 item1 -- Eggs     item1Price -- $3.19
 item2 -- Bread    item2Price -- $5.23
 item3 --  Water   item3Price -- $6.23
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