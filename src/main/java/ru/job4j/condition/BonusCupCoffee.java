package ru.job4j.condition;

public class BonusCupCoffee {

    public static int countCup(int count, int n) {
        if (count >= n) {
            return count + count / n;
        } else {
            return count;
        }
    }
}