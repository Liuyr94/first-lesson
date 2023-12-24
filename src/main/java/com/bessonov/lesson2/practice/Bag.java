package com.bessonov.lesson2.practice;

public class Bag {
    String[] items = new String[5];

    public void info() {
        System.out.println("Bag: ");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В сумку положили предмет: " + item);
                return;
            }
        }
        System.out.println("Мы не смогли положить предмет в сумку т.к. в ней уже нету места.");
    }

    public void clearAll() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println("Из сумки будет выкинуто: " + items[i]);
                items[i] = null;
            }
        }
    }

    public void clear(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(item)) {
                System.out.println("Мы выкинули из сумки " + item);
                items[i] = null;
            } else {
                System.out.println("Данного предмета в сумке не нашлось");
            }
        }
    }

    public void contains(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(item)) {
                System.out.println("Предмет " + item + " найдет");
                return;
            }
        }
        System.out.println("Предмета в сумке нету");
    }

    public void count(String item) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(item)) {
                count += 1;
            }
        }
        if (count > 0) {
            System.out.println("В сумке найдено предметов " + item + " в количестве " + count);
        } else {
            System.out.println("В сумке не найдено предметов " + item);
        }
    }
}
