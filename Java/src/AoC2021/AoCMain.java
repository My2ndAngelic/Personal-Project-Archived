package AoC2021;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class AoCMain {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the path to folder: ");
        String folder = userInput.nextLine();
        for (int i = 1; i <= 5; i ++) {
            ArrayList<Integer> al = AoCUtilities.fileImportToIntegerArrayList(folder+"\\input"+i+".txt");
            System.out.println("Day 1: " + Package.getPackages("AoC2021").getClass().problemOne(al) + " " + AoC1.problemTwo(al));
        }

    }
}
