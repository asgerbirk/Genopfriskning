package Exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    public static void main(String[] args) {
sort();
    }

    public static void sort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 5 strings");
        ArrayList<String> randomWords = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            randomWords.add(input);
            Collections.sort(randomWords);

        }
        System.out.println(randomWords);

    }
}
