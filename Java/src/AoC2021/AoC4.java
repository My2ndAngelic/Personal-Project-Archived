package AoC2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class AoC4 {
    public static int problemOne(ArrayList<String> input) {
        ArrayList<Integer> number = Arrays.stream(input.get(0).split(",")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Board> boardArray = new ArrayList<>();
        Board temp = new Board(5, 5);
        for (int i = 2; i < input.size(); i++) {
            String dataFromInput = input.get(i);
            if (dataFromInput.isEmpty()) { // If empty line, add board and empty it
                boardArray.add(temp);
                temp = new Board(5,5);
            } else { // Copy all the array to each line of the board
                String[] a = dataFromInput.split("\\s+");
                if (a[0].isEmpty()) {
                    System.arraycopy(a, 1, a, 0, a.length - 1);
                }
                int[] line = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
                temp.setLine(line,(i-1) % 5);
            }
        }
        return -1;
    }

    public static int problemTwo(ArrayList<String> input) {
        return -1;
    }
}

class Board {
    private int[][] data;

    Board(int[][] input) {
        this.data = input;
    }
    Board() {
    }
    Board(int x, int y) {
        this.data = new int[x][y];
    }

    public int getPos(int x, int y) {
        return this.data[x-1][y-1];
    }

    public void setData(int[][] input) {
        this.data = input;
    }

    public void setLine(int[] line, int pos) {
        data[pos] = line;
    }

    public int[][] getBoard() {
        return data;
    }
}