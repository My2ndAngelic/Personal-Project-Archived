package MathUtils;

import java.util.Scanner;

public class Temperature {

    public static int doSomething(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        int s = Integer.parseInt(sc.nextLine());
        System.out.println("Hello " + s);
    }
}
