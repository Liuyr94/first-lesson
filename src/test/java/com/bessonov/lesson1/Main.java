package com.bessonov.lesson1;

public class Main {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        System.out.println(x);
    }

    public static void sum(int oneNumber, int twoNumber) {
        System.out.println("Введите первое число: ");
        System.out.println("Введите второе число: ");
        System.out.println("Результат сложения первого и второго числа = " + (oneNumber + twoNumber));
    }

    public static void printStartTimes(int times) {
        while (times > 0) {
            System.out.println('*');
            times--;
        }
    }

    public static void printMap() {
        System.out.println("0 1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void sumThree(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
