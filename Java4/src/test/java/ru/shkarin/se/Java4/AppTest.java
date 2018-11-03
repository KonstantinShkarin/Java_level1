package ru.shkarin.se.Java4;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
        public static char [][]map;
        public static final int SIZE = 3;
        public static final int DOTS_TO_WIN =3;
        public static final char DOR_EMPTY = '.';
        public static final char DOR_X = 'X';
        public static final char DOT_O = 'O';

    public static void main(String[] args) {

    }

@Test
    public static void intMap() {
    map = new char[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            map[i][j] = DOR_EMPTY;
        }
    }
}
}
