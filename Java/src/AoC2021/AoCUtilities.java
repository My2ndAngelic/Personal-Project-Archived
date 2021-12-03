package AoC2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AoCUtilities {
    /**
     * Read file and return in ArrayList<String>
     * @param path to the file
     * @return 
     * @throws FileNotFoundException if file is not found
     */
    public static ArrayList<String> fileImportToStringArrayList(String path) throws FileNotFoundException {
        File myFile = new File(path);
        Scanner sc = new Scanner(myFile);
        ArrayList<String> myData = new ArrayList<>();
        while  (sc.hasNextLine()) {
            myData.add(sc.nextLine());
        }
        return myData;
    }

    public static String[] fileImportToStringArray(String path) throws FileNotFoundException {
        File myFile = new File(path);
        Scanner sc = new Scanner(myFile);
        String[] myData = new String[Math.toIntExact(myFile.length())];
        int i = 0;
        while  (sc.hasNextLine()) {
            myData[i] = sc.nextLine();
            i++;
        }
        return myData;
    }

    public static ArrayList<Integer> fileImportToIntegerArrayList(String path) throws FileNotFoundException, NumberFormatException {
        File myFile = new File(path);
        Scanner sc = new Scanner(myFile);
        ArrayList<Integer> myData = new ArrayList<>();
        while  (sc.hasNextLine()) {
            myData.add(Integer.parseInt(sc.nextLine()));
        }
        return myData;
    }
}
