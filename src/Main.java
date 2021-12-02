import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();



        int Menu;
        System.out.println("1. Kasta tärning");
        System.out.println("2. Avsluta program");
        int intInput = myScanner.nextInt();

        boolean programRunning = true;
        while (programRunning) {
            switch (intInput) {
                case 1:
                    myScanner.nextInt();
                    System.out.println("Kastar tärning");
                    int dice_value = rand.nextInt(6)+ 1;
                    if (dice_value == 1) {
                        System.out.println(dice_value);
                        System.out.println("Du gick 3 steg bakåt");
                    } else if (dice_value == 2) {
                        System.out.println("Du gick 1 steg fram");
                    } else if (dice_value == 3) {
                        System.out.println("You dead!!!!!!!");
                        break;
                    } else if (dice_value == 4) {
                        System.out.println("Du gick 4 steg framåt");
                    } else if (dice_value == 5) {
                        System.out.println("Du vann!");
                    } else if (dice_value == 6) {
                        System.out.println("Godnatt!");
                    }
                    break;
                case 2: programRunning = false;
            }
        }
    }
}





    

