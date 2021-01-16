package TrialClass.com;

public class Letters {
    {
        System.out.println("initializer");
    }
    public Letters(){
        System.out.println("constructor");
    }
    {
        System.out.println("c");
    }

    public static void main(String[] args) {
        Letters a = new Letters();
        System.out.println("d");
    }
}
