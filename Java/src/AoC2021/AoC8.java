package AoC2021;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AoC8 {
    public static int problemOne(ArrayList<String> dataIn) {
        int count = 0;
        ArrayList<LeDisplay> ld = getDisplayOut(dataIn);
        for (LeDisplay ldc : ld) {
            switch (ldc.getLength()) {
                case 2, 3, 4, 7 -> count++;
            }
        }
        return count;
    }

    public static ArrayList<LeDisplay> getDisplayOut(ArrayList<String> dataIn) {
        ArrayList<LeDisplay> ld = new ArrayList<>();
        for (String i : dataIn) {
            String[] tempStringArray = stringSplitOut(i);
            for (String j : tempStringArray) {
                if (j.chars().allMatch(Character::isLetter)) {
                    ld.add(new LeDisplay(j));
                }
            }
        }
        return ld;
    }

    public static int problemTwo(ArrayList<String> dataIn) {
        int count = 0;
        ArrayList<LeDisplay> ld = getDisplayOut(dataIn);
        for (int i = 0; i < ld.size() - 4; i++) {
            count += 1000 * ld.get(i).getNumber() + 100 * ld.get(i+1).getNumber() + 10 * ld.get(i+2).getNumber() + 1 * ld.get(i+3).getNumber();
        }
        return count;
    }

    public static void main(String[] args) {
//        ArrayList<String> a = new ArrayList<>();
//        a.add("be cfbegad cbdgef fgaecd cgeb fdcge agebfd fecdb fabcd edb | fdgacbe cefdb cefbgd gcbe");
//        System.out.println(problemTwo(a));
//        a.add("edbfga begcd cbg gc gcadebf fbgde acbgfd abcde gfcbed gfec | fcgedb cgb dgebacf gc");
//        a.add("fgaebd cg bdaec gdafb agbcfd gdcbef bgcad gfac gcb cdgabef | cg cg fdcagb cbg");
//        a.add("fbegcd cbd adcefb dageb afcb bc aefdc ecdab fgdeca fcdbega | efabcd cedba gadfec cb");
//        a.add("aecbfdg fbg gf bafeg dbefa fcge gcbea fcaegb dgceab fcbdga | gecf egdcabf bgf bfgea");
//        a.add("fgeab ca afcebg bdacfeg cfaedg gcfdb baec bfadeg bafgc acf | gebdcfa ecba ca fadegcb");
//        a.add("dbcfg fgd bdegcaf fgec aegbdf ecdfab fbedc dacgb gdcebf gf | cefg dcbef fcge gbcadfe");
//        a.add("bdfegc cbegaf gecbf dfcage bdacg ed bedf ced adcbefg gebcd | ed bcgafe cdgba cbgef");
//        a.add("egadfb cdbfeg cegd fecab cgb gbdefca cg fgcdab egfdb bfceg | gbdfcae bgc cg cgb");
//        a.add("gcafb gcf dcaebfg ecagb gf abcdeg gaef cafbge fdbac fegbdc | fgae cfgab fg bagce");
//        System.out.println(problemOne(a));
//        System.out.println(problemTwo(a));
        LeDisplay ld = new LeDisplay("cefbgd");
        System.out.println(ld.getNumber());
    }

    public static String[] stringSplit(String in) {
        return in.split("\\s+");
    }

    public static String[] stringSplitOut(String in) {
        String[] in2 = in.split("\\|");
        return in2[1].split("\\s+");
    }
}

class LeDisplay {
    public String getInput() {
        return input;
    }

    private String input;

    LeDisplay(String in) {
        if (in.chars().allMatch(Character::isAlphabetic)) {
            this.input = Stream.of(in.split("")).sorted().collect(Collectors.joining());
        }
    }

    public int getLength() {
        return input.length();
    }

    public void setWire(String input) {
        this.input = input;
    }

    public int getNumber() {
        String[] comp = new String[] {"cagedb", "ab", "gcdfa", "fbcad", "eafb", "cdfbe", "cdfgeb", "dab", "acedgfb", "cefabd"};
        for (int i = 0; i < comp.length; i++) {
            comp[i] = Stream.of(comp[i].split("")).sorted().collect(Collectors.joining());
        }
        if (input.equals(comp[0])) {
            return 0;
        } else if (input.length() == 2) {
            return 1;
        } else if (input.equals(comp[2])) {
            return 2;
        } else if (input.equals(comp[3])) {
            return 3;
        } else if (input.length() == 4) {
            return 4;
        } else if (input.equals(comp[5])) {
            return 5;
        } else if (input.equals(comp[6])) {
            return 6;
        } else if (input.length() == 3) {
            return 7;
        } else if (input.length() == 7) {
            return 8;
        } else if (input.equals(comp[9])) {
            return 9;
        } return -1;
    }
}
