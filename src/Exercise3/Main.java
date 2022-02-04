package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lenght of grass");
        double grassLength = scanner.nextDouble();
        System.out.println("max lenght");
        double maxLength = scanner.nextDouble();
        System.out.println(grass(grassLength,maxLength));
    }

    public static double grass(double grassLength, double maxGrassLength) {
        double growPerDay = 0.8;
        int countDays = 0;
        while (grassLength < maxGrassLength) {
            countDays++;
            grassLength += growPerDay;
        }
        return countDays;
    }
}