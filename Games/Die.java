package Games;

import java.util.Random;
import java.util.Scanner;
public class Die {
    private int number;
    private int die1;
    private int die2;
    private int total;
    public void roll() {
        Random r = new Random();
        Random r2 = new Random();
        die1 = r.nextInt(6) + 1;
        die2 = r2.nextInt(6) + 1;
    }
    public int getTotal(){
        total = die1 + die2;
        return total;
    }
    public String highOrLow() {
        String highOrLow = "";
        switch (total) {
            case 2: highOrLow = "LOW"; break;
            case 3: highOrLow = "LOW"; break;
            case 4: highOrLow = "LOW"; break;
            case 5: highOrLow = "LOW"; break;
            case 6: highOrLow = "LOW"; break;
            case 7: highOrLow = "NEITHER"; break;
            case 8: highOrLow = "HIGH"; break;
            case 9: highOrLow = "HIGH"; break;
            case 10: highOrLow = "HIGH"; break;
            case 11: highOrLow = "HIGH"; break;
            case 12: highOrLow = "HIGH"; break;
        }
        return highOrLow;
    }
   }
