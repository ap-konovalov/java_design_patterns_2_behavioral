package ru.netology;

// https://github.com/netology-code/jd-homeworks/blob/master/behave/task1/README.md
public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(50, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}