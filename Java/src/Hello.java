import java.util.Scanner;

public class Hello {
    static String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "urmom"};
    static double[] gravity = {0.39, 0.91, 1.00, 0.38, 2.87, 1.32, 0.93, 1.23, 4.20};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a weight on earth. Enter 0 to exit: ");
        double weightNumber = 69;

        if (weightNumber == 0) {
            System.out.println("Goodbye!");
        }

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a valid planet name: ");
        String planetName = "urmom";
        int valid = findByPlanet(planetName);
        if (valid == 1) {
            System.out.print("NOT VALID!\n");
        }

        System.out.println("The weight of the object on the planet " + planetName + " is " + weightOnPlanet(weightNumber, findByPlanet(planetName)));
    }

    public static int findByPlanet(String planetName) {
        for (int i = 0; i < planets.length; i++) {
            if (planetName.equals(planets[i])) {
                return i;
            }
        }
        return -1;
    }


    public static double weightOnPlanet(double weightNumber, int planet) {
        return weightNumber * gravity[planet];
    }
}