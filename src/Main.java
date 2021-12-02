import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        int dice_value = rand.nextInt(5 + 1);
        System.out.println(dice_value);


        boolean programRunning = true;
        int Menu = 0;

        while (programRunning) {
            switch (Menu) {
                case 1:
                    System.out.println("1.Kasta tärning");
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


            }
        }

    }
}





    

