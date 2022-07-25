package ru.job4j.array;

public class Initials {

    public static String convert(String[] fio) {
        StringBuilder builder = new StringBuilder(fio[0]);
        builder.append(" ");
        for (int i = 1; i <= 2; ++i) {
            builder.append(fio[i].charAt(0));
            builder.append(".");
        }
        return builder.toString();
    }
}