package AoC2021;

import java.util.ArrayList;
import java.util.Arrays;

public class AoC2 {
    public enum Movement {forward, down, up};

    public static int problemOne(ArrayList<String> dataIn) {
        System.out.println(dataIn);
        for (String s : dataIn) {
            String[] ss = s.split(" ");
            System.out.print(Arrays.toString(ss) + " ");
            Movement inS = Movement.valueOf(ss[0]);
            switch (inS) {
                case forward:
                    System.out.println("f");
                    break;
                case down:
                    System.out.println("d");
                    break;
                case up:
                    System.out.println("u");
                    break;
                default:
                    System.out.println("fu");
                    break;
            }
        }
        return -1;
    }

    public static int problemTwo(ArrayList<String> dataIn) {
        return -1;
    }
}
