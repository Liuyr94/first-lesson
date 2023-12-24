package com.bessonov.lesson2.practice;

import java.util.Arrays;
import java.util.Scanner;

class MainApplication {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void fieldDreams() {
        Scanner scanner = new Scanner(System.in);
        String aiWord = "watermelon";
        System.out.println("Поле чудес: слово загадано, введите букву или слово");
        boolean[] opened = new boolean[aiWord.length()];
        while (true) {
            String answer = scanner.next();
            if (answer.length() > 1) {
                if (answer.equals(aiWord)) {
                    System.out.println("Вы победили ура!!!");
                    return;
                } else {
                    System.out.println("Не угадали попробуйте ещё раз");
                }
            } else {
                char letter = answer.charAt(0);
                for (int i = 0; i < aiWord.length(); i++) {
                    if (aiWord.charAt(i) == letter) {
                        opened[i] = true;
                    }
                }
                for (int i = 0; i < aiWord.length(); i++) {
                    if (opened[i]) {
                        System.out.print(aiWord.charAt(i));
                    } else {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
    }

    public static void palindrom(String s) {
        char[] palindrom = s.toLowerCase().toCharArray();
        for (int i = 0; i < palindrom.length / 2; i++) {
            if (palindrom[i] != palindrom[palindrom.length - i - 1]) {
                System.out.println("Слово - " + s + " не является палиндром ");
                return;
            }
        }
        System.out.println("Слово - " + s + " является палиндромом");
    }

    public static void guessNumber() {
        System.out.println("Эта игра: Угадай слово");
        Scanner scanner = new Scanner(System.in);
        String[] words = { "apple", "apricot", "avocado", "nectarine", "lime", "coconut", "papaya", "passion fruit",
                "pineapple" };

        String aiWords = words[(int) (Math.random() * words.length)];
        System.out.println("Компьютер загадал какой-то из следующего списка: " + Arrays.toString(words) + ". " +
                "Попробуйте отгадать");

        while (true) {
            String answer = scanner.next();
            if (aiWords.equalsIgnoreCase(answer)) {
                System.out.println("Ура вы победили!!!");
                return;
            }
            char[] aiWordsChar = aiWords.toCharArray();
            char[] answerChar = answer.toCharArray();
            int minLength = Math.min(aiWordsChar.length, answerChar.length);
            for (int i = 0; i < minLength; i++) {
                if (aiWordsChar[i] == answerChar[i]) {
                    System.out.print(answerChar[i]);
                } else {
                    System.out.print('*');
                }
            }
            for (int i = 0; i < 20 - minLength; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
