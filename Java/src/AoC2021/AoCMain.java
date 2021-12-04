package AoC2021;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class AoCMain {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
//        System.out.print("Enter the path to folder: ");
//        String folder = userInput.nextLine();
        String folder = System.getProperty("user.dir")+"/src/AoC2021/input/";
        int minDay = 1;
        int maxDay = 3;

        for (int i = minDay; i <= maxDay; i++) {
            Class<?> c = Class.forName("AoC2021.AoC"+i);
            ArrayList<String> input = AoCUtilities.fileImportToStringArrayList(folder+"/input"+i+".txt");
            Method m1 = c.getDeclaredMethod("problemOne",ArrayList.class);
            Method m2 = c.getDeclaredMethod("problemTwo",ArrayList.class);
            System.out.println("Day "+i+": " + m1.invoke(ArrayList.class, input) + " | " + m2.invoke(ArrayList.class, input));
        }
    }
}
