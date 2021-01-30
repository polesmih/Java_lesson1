package hw_lesson1;

public class Lesson1 {

    // task 1
    public static void main(String[] args) {

        printSomething();
        calculateExpression();
        compareNumbers(10, 10);
        isRealNumber(0);
        returnNumber(-9);
        printString("Lis");
        isLeapYear(1600);
    }
    // task 2
    public static void printSomething() {
        byte a = -120;
        short b = 0;
        int c = 2020;
        long d = 1000L;
        float e = 15.45f;
        double f = 456.654;
        char ch = 'M';
        boolean bool = a > f;
        System.out.println(c);
    }

    // task 3
    public static void calculateExpression() {
        float a = 1f, b = 2f, c = 3f, d = 4f;
        float calculate = a * (b + (c / d));
        System.out.println(calculate);
    }

    // task 4
    public static void compareNumbers(int a1, int a2) {
        if (10 <= (a1 + a2) && (a1 + a2) <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // task 5
    public static void isRealNumber(int a3) {
        if (a3 >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    // task 6
    public static boolean returnNumber(int a4) {
        if (a4 < 0) {
            return true;
        } else {
            return false;
        }
    }

    // task 7
    public static void printString(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // task 8
    public static void isLeapYear(int year) {
        if ((year % 100 == 0) && (year % 400 != 0)) {
            System.out.println("Год не високосный");
        } else if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }


}
