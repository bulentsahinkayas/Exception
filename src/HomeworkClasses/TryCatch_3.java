package HomeworkClasses;

import java.util.ArrayList;

public class TryCatch_3 {
    public static void main(String[] args) {
    ArrayList<Integer> myArray = new ArrayList<>();
    myArray = null;

        System.out.println(sum(myArray));
    }
    public static int sum(ArrayList<Integer> arrayList){


            try {
                int total = arrayList.get(0);
                for (int i = 1; i < arrayList.size(); i++) {

                    total += arrayList.get(i);

                }
                return total;

            } catch (NullPointerException e) {

                        return -1;
            }


    }
}
/*
Create a method sum()

parameter is one ArrayList Integer

return type is int

sum all the numbers in the Arraylist and return the total.

If there is a null in the arraylist return -1

NOTE : Do not use if statement use try catch block
 */