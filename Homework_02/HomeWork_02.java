package Homework_02;

public class HomeWork_02 {

    public static void main (String [] args) {

        System.out.println(TaskOne (10, 0));
        TaskTwo(-1);
        System.out.println(TaskThree(-1));
        TaskFour("Anna", 3);

    }

    public static boolean TaskOne (int a, int b){
        System.out.println("TaskOne:");
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        } else return false;

    }
    public static void TaskTwo(int a){
        System.out.println();
        System.out.println("TaskTwo:");
        if (a >= 0)
            System.out.println( a + " " + "positive");
        else System.out.println( a + " " + "negative");
    }
    public static boolean TaskThree(int a){
        System.out.println();
        System.out.println("TaskThree:");
        if (a < 0) return true;
        else return false;
    }
    public static void TaskFour(String a, int b){
        System.out.println();
        System.out.println("TaskFour:");

        for (int i = 1; i <= b; i++) {
            System.out.println( i + ":" + " " + a);
        }
    }



}
