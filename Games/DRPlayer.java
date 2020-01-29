package Games;

import java.util.Scanner;
public class DRPlayer {
    private static int points = 1000;
    private final int flag = -1;
    private final int low = 0;
    private final int high = 1;
    private int call;
    Die pairODie = new Die();
    public int returnPoints() {
        return points;
    }
    Scanner input = new Scanner(System.in);
    public void play() {
        int pointsRisked;
        do {
            System.out.print("\n\nYou Have " + returnPoints() + " Points.\nHow Many Points Would You Like To Risk?" +
                    "\n(-1 TO EXIT):  ");
            pointsRisked = input.nextInt();
            if (pointsRisked == -1) {
                System.exit(0);
            }
            while (pointsRisked > points || pointsRisked < -1 || pointsRisked == 0) {
                System.out.print("\nYou Have " + returnPoints() + " Points.\nHow Many Points Would You Like To Risk?" +
                        "\n(-1 TO EXIT):  ");
                pointsRisked = input.nextInt();
            }
            System.out.print("Make A Call (0 FOR LOW, 1 FOR HIGH):  ");
            call = input.nextInt();
            while (call < 0 || call > 1) {
                System.out.print("Make A Call (0 FOR LOW, 1 FOR HIGH):  ");
                call = input.nextInt();
            }
            pairODie.roll();
            System.out.print("You Rolled " + pairODie.getTotal());
            if (call == 0 && pairODie.highOrLow() == "LOW"){
                System.out.print("\nCORRECT!");
                points += pointsRisked;
            } else {
                if (call == 0 && pairODie.highOrLow() == "NEITHER") {
                    System.out.print("\nNeither");
                } else {
                    if (call == 0 && pairODie.highOrLow() == "HIGH") {
                        System.out.print("\nWRONG!");
                        points -= pointsRisked;
                    }
                }
            }
            if (call == 1 && pairODie.highOrLow() == "LOW"){
                System.out.print("\nWRONG!");
                points -= pointsRisked;
            } else {
                if (call == 1 && pairODie.highOrLow() == "NEITHER") {
                    System.out.print("\nNeither");
                } else {
                    if (call == 1 && pairODie.highOrLow() == "HIGH") {
                        System.out.print("\nCORRECT!");
                        points += pointsRisked;
                    }
                }
            }
        } while (pointsRisked != flag);
        if (points <= 0) {
            System.out.print("You Lose!");
            System.exit(0);
        }
    }
}
