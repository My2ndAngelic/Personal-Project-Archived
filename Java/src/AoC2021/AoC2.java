package AoC2021;

import java.util.ArrayList;

public class AoC2 {
    public static int problemOne(ArrayList<Integer> data) {
        int temp = 0;
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i) < data.get(i+1)) {
                temp++;
            }
        }
        return temp;
    }

    public static int problemTwo(ArrayList<Integer> data) {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        for (int i = 0; i < data.size() - 2; i++) {
            testArray.add(data.get(i) + data.get(i+1) + data.get(i+2));
        }
        return problemOne(testArray);
    }
}