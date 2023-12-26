package com.bessonov.lesson3.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainApplication {

    private static final char[][] MAP = new char[3][3];

    private static char[][] createMap(char[][] chars) {
        IntStream.range(0, MAP.length).forEach(i -> Arrays.fill(MAP[i], '-'));
        return MAP;
    }

    public static void main(String[] args) {
        printMap();

    }


    private static void printMap() {
        for (int i = 0; i < MAP.length; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < MAP.length; i++) {
            System.out.print(i + 1);
            for (char c : MAP[i]) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
