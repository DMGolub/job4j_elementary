package ru.job4j.condition;

public class WeeklySalary {

    private static final int NORMAL_TAX = 10;
    private static final int HIGH_TAX = 15;

    public static int calculate(int[] hours) {
        int salarySum = 0;
        for (int i = 0; i < hours.length; ++i) {
            int daySalary = NORMAL_TAX * Math.min(hours[i], 8)
                    + HIGH_TAX * (hours[i] > 8 ? hours[i] - 8 : 0);
            if (i > 4) {
                daySalary *= 2;
            }
            salarySum += daySalary;
        }
        return salarySum;
    }
}