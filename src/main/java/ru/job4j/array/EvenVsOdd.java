package ru.job4j.array;

public class EvenVsOdd {

    public static int whoWin(int[] players) {
        int teamOne = 0;
        int teamTwo = 0;
        for (int i = 0; i < players.length; ++i) {
            if (i % 2 == 0) {
                teamOne += players[i];
            } else {
                teamTwo += players[i];
            }
        }
        return teamOne == teamTwo ? 0 : (teamOne > teamTwo ? 1 : 2);
    }
}