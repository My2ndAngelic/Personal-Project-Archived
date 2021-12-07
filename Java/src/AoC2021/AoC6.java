package AoC2021;

import java.util.ArrayList;
import java.util.Arrays;

public class AoC6 {
    public static ArrayList<Integer> spawn(ArrayList<Integer> dataIn, int maxDay) {
        ArrayList<Integer> dataOut = new ArrayList<>(dataIn);
        for (int i = 0; i < maxDay; i++) {
            int k = dataOut.size();
            for (int j = 0; j < k; j++) {
                if (dataOut.get(j) > 0) {
                    dataOut.set(j, dataOut.get(j) - 1);
                } else {
                    dataOut.set(j, 6);
                    dataOut.add(8);
                }
            }
        }
        return dataOut;
    }

    public static int problemOne(ArrayList<String> dataIn) {
        return -1;
    }

    public static int problemTwo(ArrayList<String> dataIn) {
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> k = new ArrayList<>();
        k.add(3);k.add(4);k.add(3);k.add(1);k.add(2);

        System.out.println(spawn(k,1));
        System.out.println(spawn(k,2));
    }
}
