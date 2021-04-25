package ru.geekbrains.lesson_1_intro;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        // ЗАДАНИЕ 2
        byte a = 20;
        short b = 21;
        int c = -15;
        long d = 200000L;
        float e = 12.43f;
        double f = 120.26262262;
        char g = '*';
        boolean z = true;
        
        // ЗАДАНИЕ 3
        System.out.println("Это было просто: " + (calc(10.23f, 27.15f, 36f, 5.041f)));
        // ЗАДАНИЕ 4
        System.out.println("С этими числами будет: " + (isTrueOrNot(15, 20)) + "!");
        // ЗАДАНИЕ 5
        negPos(-21);
        // ЗАДАНИЕ 6
        System.out.println("Как бы там ни было но: " + (posNeg(-10)) + "!");
        // ЗАДАНИЕ 7
        nameOf("Деметрос");
        // ЗАДАНИЕ 8 
        leapYear(2020);
        
    }
            static float calc(float a, float b, float c, float d){
                return a * (b + (c / d));
            }

            static boolean isTrueOrNot(int a, int b) {
            int summ = a + b;
                if (summ > 10 && summ < 20){
                    return true;
            } else {
                    return false;
                }
            }

            static int negPos(int a) {
                if (a >= 0){
                    System.out.println("Число " + a + " положительное!))");
                }
                else {
                    System.out.println("Число " + a + " отрицательное((");
                }
                return a;
            }
            static boolean posNeg(int a) {
                if (a >= 0){
                    return false;
                } else {
                    return true;
                }
            }

            static void nameOf(String name) {
                System.out.println("Привет! " + name + "!");
            }

            static void leapYear(int year){
                if ((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 > 0)) {
                    System.out.println(year + " вискосный.");
                } else {
                    System.out.println(year + " невисокосный!");
                }
            }
}
