package unicorns;

import java.util.Scanner;

public class unicornPowers {

    public static Scanner inputWhatUnicorn = new Scanner(System.in);

    public static int timesRun = 0;

    public static int whatUnicornChosen;

    public static void main(String[] args) {
        getWhatUnicorn();
        if (whatUnicornChosen == 1) {
            unicornDefense();
        } else if (whatUnicornChosen == 2) {
            unicornHeal();
        } else if (whatUnicornChosen == 3) {
            unicornTalk();
        } else {
                System.out.println("You didn't choose a unicorn. Thanks for playing!");
            }
        }

    public static void unicornDefense() {
        System.out.println("I'm using magic to defend myself!");
    }

    public static void unicornHeal() {
        System.out.println("I'm a unicorn that can heal people (and myself)!");
    }

    public static void unicornTalk() {
        System.out.println("Neigh neigh... oh here we go! Magic translator on!");
    }

    public static int countTimesRun() {
        ++timesRun;
        return timesRun;
    }

    public static void getWhatUnicorn() {
        try {
            System.out.println("Please enter 1 (unicorn defense), 2 (healing unicorn), or 3 (talking unicorn).");
            whatUnicornChosen = inputWhatUnicorn.nextInt();
        } catch (Exception intNotPut) {
            System.out.println("Sorry, but you didn't input an integer.");
            }
    }
}