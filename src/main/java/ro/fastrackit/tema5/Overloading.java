package ro.fastrackit.tema5;


public class Overloading {
    public static void main(String[] args) {
        int number1 = 52;
        long number2 = 5023;
        double number3 = 75.02;
        String someString = "Cristi";
        Object someObject = "Florin";
        Long wrapperLong = number2;
        Double wrapperDouble = number3;

        printAnything(someString);
        printAnything(number1);
        printAnything(someObject);
        printAnything(wrapperLong);
        printAnything(wrapperDouble);
        printAnything(number2);


    }

    static void printAnything(int printInt) {
        System.out.println("int :" + printInt);
    }

    static void printAnything(long printLong) {
        System.out.println("long :" + printLong);
    }

    static void printAnything(Long wrappedLong) {
        System.out.println("LONG :" + wrappedLong);
    }

    static void printAnything(String printString) {
        System.out.println("String :" + printString);
    }

    static void printAnything(Double wrappedDouble) {
        System.out.println("DOUBLE :" + wrappedDouble);
    }

    static void printAnything(Object someObject) {
        System.out.println("Object :" + someObject);
    }

    static void printAnything(int[] anotherInt) {
    }

    static void printAnything(long[] anotherLong) {
    }

}
