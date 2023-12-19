package com.bessonov.practice1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
    }

    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Выберите одно из действий:\n1.Сложить два числа.\n2.Вычесть первое второе число из " +
                "первого.\n3.Умножить первое число на второе.\n4.Разделить первое число на второе без остатка.");
        int numberOperations;

        while (true) {
            numberOperations = scanner.nextInt();
            if (numberOperations > 0 && numberOperations < 5) {
                break;
            } else {
                System.out.println("Начните всё сначала");
            }
        }

        if (numberOperations == 1) {
            System.out.println(firstNumber + secondNumber);
        } else if (numberOperations == 2) {
            System.out.println(firstNumber - secondNumber);
        } else if (numberOperations == 3) {
            System.out.println(firstNumber * secondNumber);
        } else {
            System.out.println(firstNumber / secondNumber);
        }
    }

    public static void wordsGame() {
        Scanner scanner = new Scanner(System.in);
        int triesCount;
        int interval;
        System.out.println("Добро пожаловать в игру выберите сложность:\n1 - легко, \n2 - средняя, \n3 - сложная");
        int difficult = scanner.nextInt();
        if (difficult == 1) {
            triesCount = 5;
            interval = 8;
        } else if (difficult == 2) {
            triesCount = 3;
            interval = 10;
        } else {
            System.out.println("Ах ты так...... ну получай!!!");
            triesCount = 1;
            interval = 999999999;
        }


        int aiNumber = (int) (Math.random() * interval) + 1;
        System.out.println("Компьютер загадал число от 1 до " + interval);
        while (true) {
            System.out.println("Попробуйте отгадать число. Количество попыток: " + triesCount);
            int answer = scanner.nextInt();
            if (aiNumber == answer) {
                System.out.println("Вы победили");
                break;
            }

            triesCount--;

            if (triesCount == 0) {
                System.out.println("Вы потратили все свои попытки игра проиграна :(");
                break;
            }

            if (answer < aiNumber) {
                System.out.println("Не отгадали .Загаданное число больше вашего ответа. Попробуйте увеличить ваш " +
                        "ответ");
            } else {
                System.out.println("Не отгадали .Загаданное число меньше вашего ответа. Попробуйте увеличить ваш" +
                        " " +
                        "ответ");
            }
        }
    }


    public static void getNumberInterval(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите число от " + min + " до " + max);
        while (true) {
            n = scanner.nextInt();
            if (n >= min || n <= max) {
                break;
            }
            System.out.println("Вы не правы");
        }
        System.out.println("Вы ввели число: " + n);
    }
}