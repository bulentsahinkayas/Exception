package HomeworkClasses;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestion {
    public static void main(String[] args) {
        int min = 50;
        int max = 80;
        int num1 = 7;
        int num2 = 5;
        System.out.println(myFancyPants(min,max,num1,num2));
    }
    public static ArrayList<String> myFancyPants(int low ,int high ,int A ,int B){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        int count = 0;
        do {
            list.add(low);
            low++;
        }while(low <= high);

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % A == 0) && (list.get(i) % B == 0)){
                stringArrayList.add("FancyPants");

            }
            else if (list.get(i) % A == 0){
                stringArrayList.add("Fancy");

            }
            else if (list.get(i) % B == 0){
                stringArrayList.add("Pants");

            }
            else{
                stringArrayList.add(list.get(i).toString());
            }


        }

        return stringArrayList;
    }
}
/*
Create a method name is myFancyPants
Parameters are 4 integers (low , high , A , B)
Return type is ArrayList<String>

Note: low ,high , A , B positive numbers


You method need to count from low to high
If the number evenly divisible by A --> add Fancy to ArrayList
If the number evenly divisible by B --> add Pants to ArrayList
If the number evenly divisible by A and B --> add FancyPants to ArrayList

return ArrayList

Note : Low and High values both included

For example:
Low = 50
High = 80
A is 7
B  is 5

result should be

Pants
51
52
53
54
Pants
Fancy
57
58
59
Pants
61
62
Fancy
64
Pants
66
67
68
69
FancyPants
.....

 */