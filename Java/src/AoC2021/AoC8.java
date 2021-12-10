package AoC2021;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AoC8 {
    public static int problemOne(ArrayList<String> dataIn) {
        return -1;
    }

    public static int problemTwo(ArrayList<String> dataIn) {
        return -1;
    }

    public static void main(String[] args) {
        LeDisplay ld = new LeDisplay("afc");
        System.out.println(ld.getInput());
        System.out.println(ld.getLength());
        System.out.println(ld.getNumber());
    }
}

class LeDisplay {
    public String getInput() {
        return input;
    }

    private String input;

    LeDisplay(String in) {
        this.input = Stream.of(in.split("")).sorted().collect(Collectors.joining());
    }

    public int getLength() {
        return input.length();
    }

    public void setWire(String input) {
        this.input = input;
    }

    public int getNumber() {
        return switch (input) {
            case ("abcefg") -> 0;
            case ("cf") -> 1;
            case ("acdeg") -> 2;
            case ("acdfg") -> 3;
            case ("bcdf") -> 4;
            case ("abdfg") -> 5;
            case ("abdefg") -> 6;
            case ("acf") -> 7;
            case ("abcdefg") -> 8;
            case ("abcdfg") -> 9;
            default -> -1;
        };
    }
}
