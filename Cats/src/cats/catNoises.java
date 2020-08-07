package cats;

import java.util.Scanner;

public class catNoises {

    public static Scanner getWhatCat = new Scanner(System.in);

    public static void happyCat() {
        System.out.println("I am a happy kitten! Purr purr!");
    }

    public static void annoyedCat() {
        System.out.println("I'm getting annoyed...");
    }

    public static void hungryCat() {
        System.out.println("I'm hungry! Feed me some tuna!");
    }

    public static void madCat() {
        System.out.println("Back off or I'll start scratching!");
    }

    public static void main(String[] args) {
        System.out.println("Please enter 1 (happy cat), 2 (annoyed cat), 3 (hungry cat), or 4 (mad cat).");
        int whatCat = getWhatCat.nextInt();
        if (whatCat == 1) {
            happyCat();
        }
        else if (whatCat == 2) {
            annoyedCat();
        }
        else if (whatCat == 3) {
            hungryCat();
        }
        else if (whatCat == 4) {
            madCat();
        }
        else {
            System.out.println("Please enter 1 (happy cat), 2 (annoyed cat), 3 (hungry cat), or 4 (mad cat).");
            whatCat = getWhatCat.nextInt();
        }
}
}
