package AoC2020;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AoC3 {
    public static void main(String[] args) {
        ArrayList<String> al = fileReader(System.getProperty("user.dir") + "/src/AoC2020/input/input4.txt");

        int[] tempout = {al.get(0).length(), al.size()};
        System.out.println(Arrays.toString(tempout));
        int[] tempout2 = {treeFinder(al, 1, 1), treeFinder(al, 3, 1), treeFinder(al, 5, 1), treeFinder(al, 7, 1), treeFinder(al, 1, 2)};
        System.out.println(Arrays.toString(tempout2));
        long a = 1;
        for (int i : tempout2) {
            a *= i;
        }
        System.out.println(a);

    }

    public static String characterReplacement(String s, int pos) {
        char[] c = s.toCharArray();
        if (c[pos] == '#') {
            c[pos] = 'X';
        } else if (c[pos] == '.') {
            c[pos] = 'O';
        }
        return String.valueOf(c);
    }

    public static ArrayList<String> fileReader(String path) {
        ArrayList<String> al = new ArrayList<>();
        try {
            File f = new File(path);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                al.add(data);
            }
            s.close();
        } catch (Exception ignored) {

        }
        return al;
    }

    public static int treeFinder(ArrayList<String> al, int right, int down) {
        int a = 0;
        int sl = al.get(0).length();
        int tree = 0;
        for (int i = 0; i < al.size(); i += down) {
            String ss = characterReplacement(al.get(i), a);
            if (ss.indexOf('X') >= 0) {
                tree++;
            }
            a = (a + right) % sl;
        }
        return tree;
    }
}
