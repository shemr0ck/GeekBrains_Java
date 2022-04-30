package Homework_01;

public class HomeWorkApp {

    public static void main (String [] args) {

        printThreeWords();
        checkSumSign(1, 1);
        printColor(101);
        compareNumbers(5, 3);
    }



    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b){
        int sum = a+b;

        if (sum >= 0)
        {
            System.out.println("Sum positive");
        } else System.out.println("Sum negative");
    }

    public static void printColor(int value){

        if (value <= 0){
            System.out.println("Red");
        } else if (value <= 100){
            System.out.println("Yellow");
        } else System.out.println("Green");
    }

    public static void compareNumbers(int a, int b){

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
