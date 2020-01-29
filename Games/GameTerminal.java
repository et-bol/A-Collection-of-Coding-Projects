package Games;

import java.util.Scanner;
public class GameTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("(1 for Dice Roll Game, 2 for RPS)\nEnter Your Choice:  ");
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    DiceRoll();
                case 2:
                    RPS();
            }
        } while (choice != 1 || choice != 2) ;
    }

    public static void DiceRoll() {
        DRPlayer newPlayer = new DRPlayer();
        newPlayer.play();
    }

    public static void RPS() {
        RPSGame rps = new RPSGame();
        RPSPlayer rpsOpponent = new RPSPlayer();
        Scanner input = new Scanner(System.in);
        int rounds;
        String user;
        user = rps.getUser();
        do {
            System.out.print("OK, -" + user + "-.\nHow many rounds would you like to play?? ");
            rounds = input.nextInt();
            if (rounds < 1) {
                System.out.print("Not a Valid Number! You Can't Play a Negative Number of Rounds!\n");
            }
            if (rounds > 15) {
                System.out.print("Whoa There! That's Too Many Rounds!\n");
            }
        } while (rounds < 1 || rounds > 15);
        for (int i = 0; i < rounds; i++) {
            rpsOpponent.makeThrow();
            rps.makeCompThrow();
            rps.announceWinner(rpsOpponent.getThrow());
        }
        rps.bigWinner();
    }
}
