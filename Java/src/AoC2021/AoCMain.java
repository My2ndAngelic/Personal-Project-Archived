package AoC2021;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AoCMain {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
//        System.out.print("Enter the path to folder: ");
//        String folder = userInput.nextLine();
//        for (int i = 1; i <= 5; i ++) {
//            ArrayList<Integer> al = AoCUtilities.fileImportToIntegerArrayList(folder+"\\input"+i+".txt");
//       }
        String folder = "C:\\Users\\My2ndAngelic\\Documents\\GitHub\\Personal-Project\\Java\\src\\AoC2021\\input";
        int i = 1;
        Class<?> c = Class.forName("AoC2021.AoC1");
        ArrayList<Integer> al = AoCUtilities.fileImportToIntegerArrayList(folder+"\\input"+i+".txt");
        Method m = c.getDeclaredMethod("problemOne",ArrayList.class);
        System.out.println(m.invoke(ArrayList.class, al));
    }
}
