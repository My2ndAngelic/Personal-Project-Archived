package AoC2021;

import java.util.ArrayList;

public class AoC4 {
    public class Board {
        private int[][] data;

        Board(int[][] input) {
            this.data = input;
        }

        public int getPos(int x, int y) {
            return this.data[x-1][y-1];
        }
    }

    public static int problemOne(ArrayList<String> input) {
        return -1;
    }

    public static int problemTwo(ArrayList<String> input) {
        return -1;
    }
}
