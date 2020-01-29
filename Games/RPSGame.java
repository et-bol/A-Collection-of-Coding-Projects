package Games;

import java.util.Random;
import java.util.Scanner;
public class RPSGame {
    private String compThrow;
    private String userName;
    private int cThrow = 0;
    private int amtCompWins;
    private int amtPlayerWins;
    public void makeCompThrow() {
        Random rand = new Random();
        cThrow = rand.nextInt((3) + 1);
        switch (cThrow) {
            case 1: compThrow = "rock"; break;
            case 2: compThrow = "paper"; break;
            case 3: compThrow = "scissors"; break;
        }
    }
    public String getUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Username:  ");
        userName = input.nextLine();
        return userName;
    }
    public void announceWinner(String playerThrow){
        System.out.print(userName + " Throws: ");
        switch (playerThrow){
            case "rock": System.out.print("\nROCK!"); break;
            case "paper": System.out.print("\nPAPER!"); break;
            case "scissors": System.out.print("\nSCISSORS"); break;
        }
        System.out.println("\nComputer Throws: ");
        switch (compThrow) {
            case "rock": System.out.print("ROCK!"); break;
            case "paper": System.out.print("PAPER!"); break;
            case "scissors": System.out.print("SCISSORS"); break;
        }
        if(playerThrow == "rock" && compThrow == "rock"){
            System.out.println("\nIt's a tie!");
        } else {
            if (playerThrow == "rock" && compThrow == "paper"){
                System.out.println("\nComputer Wins This Round!");
                amtCompWins += 1;
            } else {
                if (playerThrow == "rock" && compThrow == "scissors") {
                    System.out.println("\n" + userName + " Wins This Round!");
                    amtPlayerWins += 1;
                }
            }
        }
        if(playerThrow == "paper" && compThrow == "rock"){
            System.out.println("\n" + userName + " Wins This Round!");
            amtPlayerWins += 1;
        } else {
            if (playerThrow == "paper" && compThrow == "paper"){
                System.out.println("\nIt's a Tie!");
            } else {
                if (playerThrow == "paper" && compThrow == "scissors") {
                    System.out.println("\nComputer Wins This Round!");
                    amtCompWins += 1;
                }
            }
        }
        if(playerThrow == "scissors" && compThrow == "rock"){
            System.out.println("\nComputer Wins This Round!");
            amtCompWins += 1;
        } else {
            if (playerThrow == "scissors" && compThrow == "paper"){
                System.out.println("\n" + userName + " Wins This Round!");
                amtPlayerWins += 1;
            } else {
                if (playerThrow == "scissors" && compThrow == "scissors") {
                    System.out.println("\nIt's a Tie!");
                }
            }
        }
    }
    public void bigWinner() {
        System.out.print("Out of all Rounds of RPS, ");
        if (amtPlayerWins > amtCompWins) {
            System.out.println("\n" + userName + " Wins! \nYou Should Feel Proud in Yourself!");
        } else {
            if (amtCompWins > amtPlayerWins) {
                System.out.println("\nComputer Wins! \nBetter Luck Next Time :( ");
            } else {
                System.out.println("\nIt's a Tie!\nAt least you didn't lose.");
            }
        }
    }
}