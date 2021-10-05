import java.util.Scanner;
public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean validation = false;

    public static void main(String[] args) {



        System.out.println("////////////////////////////////////////////////////");
        System.out.println("                   Tamagotchi                       ");
        System.out.println("          Press enter to start the game             ");
        System.out.println("////////////////////////////////////////////////////");

        String playerInput = scanner.nextLine();

        startGame(playerInput, validation);
        choiceOfTamagotchi();




    }


    public static void startGame (String playerInput, boolean validation) {
        do {
            if (playerInput == null || playerInput == "") {
                System.out.println("\n\n\n\n\nWelcome to Tamagotchi");
                System.out.println("\nIn this game you choose a Tamagotchi to look after, feed and play with");
                System.out.println("\nYou can choose between 2 Tamagotchi's");
                System.out.println("\nPress 1 for snake or 2 for blob: ");
                validation = true;
            } else {
                System.out.println("\nClosing the game");
                break;
            }
        } while (!validation);
    }


    public static void choiceOfTamagotchi () {
        int tamagotchiChoice = scanner.nextInt();

        do {
            if (tamagotchiChoice == 1) {

                validation = true;

            } else if (tamagotchiChoice == 2) {

                validation = true;

            } else {
                System.out.println("Please enter 1 for snake or 2 for blob");
                tamagotchiChoice = scanner.nextInt();
            }
        } while (!validation);



    }
}
