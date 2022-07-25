package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnomalyTest {

    @Test
    public void whenNoAnomaly() {
        int[][] expected = {};
        int[] data = {5, 10, 15};
        int up = 16;
        int down = 4;
        assertArrayEquals(expected, Anomaly.found(data, up, down));
    }

    @Test
    public void whenOneAnomalyInPoint() {
        int[][] expected = {new int[] {1, 1}};
        int[] data = {5, 16, 15};
        int up = 16;
        int down = 4;
        int[][] out = Anomaly.found(data, up, down);
        assertArrayEquals(expected, out);
    }

    @Test
    public void whenOneAnomalyInPointInDiapason() {
        int[][] expected = {new int[] {1, 2}};
        int[] data = {5, 16, 17, 15};
        int up = 16;
        int down = 4;
        assertArrayEquals(expected, Anomaly.found(data, up, down));
    }

    @Test
    public void whenTwoAnomalyInPointInDiapason() {
        int[][] expected = {new int[] {1, 2}, new int[] {5, 6}};
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        int[][] out = Anomaly.found(data, up, down);
        assertArrayEquals(expected, out);
    }
}