package ru.job4j.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    @Test
    public void LettersLowerCaseWithDigits() {
        char[] input = "alpha012".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }

    @Test
    public void LettersLowerCaseWithDigitsWithSymbols() {
        char[] input = "alpha-12@?-".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }
    @Test
    public void LettersLowerCaseAndOneUpperCaseDigitsSymbolsSpace() {
        char[] input = "aLpha - 1-0!@#$5".toCharArray();
        char[] expect = "APHA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }
    @Test
    public void LettersLowerCaseAndTwoUpperCaseDigitsSpace() {
        char[] input = "aLpHa - 1".toCharArray();
        char[] expect = "APA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }
}