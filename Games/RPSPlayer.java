package Games;

import java.util.Scanner;
public class RPSPlayer {
    private String playerThrow;
    public void makeThrow() {
        int number = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n(1 For Rock, 2 For Paper, 3 For Scissors ) \nEnter Your Throw:  ");
            number = input.nextInt();
            if (number == 1) {
                playerThrow = "rock";
            } else {
                if (number == 2) {
                    playerThrow = "paper";
                } else {
                    if (number == 3) {
                        playerThrow = "scissors";
                    } else {
                        System.out.println("Not a valid number, try again!!!");
                    }
                }
            }
        } while (number >= 4 || number <= 0);
    }
    public String getThrow () {
        return playerThrow;
    }
}
