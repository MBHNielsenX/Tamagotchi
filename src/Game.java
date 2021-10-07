import java.util.Timer;
import java.util.Scanner;
import java.util.Random;

public class Game {

    public static Random randomNum = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean validation = false;

    public static void main(String[] args) {
        Tamagotchi playerTamagotchi = null;
        System.out.println("////////////////////////////////////////////////////");
        System.out.println("                   Tamagotchi                       ");
        System.out.println("          Press enter to start the game             ");
        System.out.println("////////////////////////////////////////////////////");

        String playerInput = scanner.nextLine();

        gameInfo(playerInput, validation);
        validation = false;
        int choice = choiceOfTamagotchi();


        startGame(playerTamagotchi,choice);



    }

    public static void startGame (Tamagotchi tamagotchi,int choice) {
        int randomEnergyLv = randomNum.nextInt(9);
        validation = false;
        String[] activities = {"play","feed","sleep"};
        String race = null;
        String raceAciiArt1 = null;
        String raceAciiArt2 = null;
        String raceAciiArtSleep1 = null;
        String raceAciiArtSleep2 = null;
        String aciiArtBall1 =
                "          ___\n" +
                "      _.-'___'-._\n" +
                "    .'--.`   `.--'.\n" +
                "   /.'   \\   /   `.\\\n" +
                "  | /'-._/```\\_.-'\\ |\n" +
                "  |/    |     |    \\|\n" +
                "  | \\ .''-._.-''. / |\n" +
                "   \\ |     |     | /\n" +
                "    '.'._.-'-._.'.'\n" +
                "      '-:_____;-'";
        String aciiArtBall2 =
                        "               \n" +
                        "          ___\n" +
                        "      _.-'___'-._\n" +
                        "    .'--.`   `.--'.\n" +
                        "   /.'   \\   /   `.\\\n" +
                        "  | /'-._/```\\_.-'\\ |\n" +
                        "  |/    |     |    \\|\n" +
                        "  | \\ .''-._.-''. / |\n" +
                        "   \\ |     |     | /\n" +
                        "    '.'._.-'-._.'.'\n" +
                        "      '-:_____;-'";
        if (choice == 1) {
            tamagotchi = new Snake(nameTamagotchi(),0,moodTamagotchi(),1 + randomEnergyLv,randomNum.nextInt(1)+1);
            race = "Snake";
            raceAciiArt1 = "_/\\__/\\__0>";
        } else if (choice == 2) {
            tamagotchi = new Blob(nameTamagotchi(),0,moodTamagotchi(),1 + randomEnergyLv,randomNum.nextInt(1)+1);
            race = "Blob";
            raceAciiArt1 =
                    "              ░░░░░░░░░░            \n" +
                    "          ░░░░        ░░░░░░        \n" +
                    "        ░░                  ░░      \n" +
                    "      ░░                    ░░░░    \n" +
                    "    ░░                      ░░░░░░  \n" +
                    "    ░░                        ░░░░  \n" +
                    "  ░░                ░░    ░░  ░░░░░░\n" +
                    "  ░░                ██░░  ██    ░░░░\n" +
                    "  ░░                ██░░  ██    ░░░░\n" +
                    "  ░░            ░░            ░░░░░░\n" +
                    "  ░░░░░░                      ░░░░░░\n" +
                    "    ░░░░░░                  ░░░░░░  \n" +
                    "    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  \n" +
                    "        ░░░░░░░░░░░░░░░░░░░░░░         ";

            raceAciiArt2 =
                    "                                     \\n\" +\n" +
                    "             ░░░░░░░░░░░░            \\n\" +\n" +
                    "         ░░░░          ░░░░░░        \\n\" +\n" +
                    "       ░░                    ░░      \\n\" +\n" +
                    "     ░░                      ░░░░    \\n\" +\n" +
                    "   ░░                        ░░░░░░  \\n\" +\n" +
                    "   ░░                  ░░    ░░░░░░  \\n\" +\n" +
                    " ░░                    ██    ██░░░░░░\\n\" +\n" +
                    " ░░                    ██    ██  ░░░░\\n\" +\n" +
                    " ░░                ░░  ░░    ░░  ░░░░\\n\" +\n" +
                    " ░░                              ░░░░\\n\" +\n" +
                    " ░░░░░░                        ░░░░░░\\n\" +\n" +
                    "   ░░░░░░░░░░░░░░░░░░░░░░░░  ░░░░░░  \\n\" +\n" +
                    "   ░░░░░░░░                ░░░░░░░░  \\n\" +\n" +
                    "                                     \\n\" +\n" +
                    "";

            raceAciiArtSleep1 =
                    "                                      Z \n" +
                    "                                    Z   \n" +
                    "            ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒      z     \n" +
                    "          ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓  z       \n" +
                    "        ▒▒    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        \n" +
                    "      ▒▒▒▒  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓      \n" +
                    "    ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓    \n" +
                    "  ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  \n" +
                    "▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██\n" +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████";

            raceAciiArtSleep2 =
                    "                                       Z\n" +
                    "                                     Z  \n" +
                    "                                   Z    \n" +
                    "            ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒     z      \n" +
                    "          ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓ z        \n" +
                    "        ▒▒    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        \n" +
                    "      ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓      \n" +
                    "    ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓    \n" +
                    "  ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  \n" +
                    "▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██";

            aciiArtBall1 =
                    "                                                                                              \n" +
                    "              ░░░░░░░░░░                                                                      \n" +
                    "          ░░░░        ░░░░░░                                                                  \n" +
                    "        ░░                  ░░                                                                \n" +
                    "      ░░                    ░░░░                                                              \n" +
                    "    ░░                      ░░░░░░                               ___                          \n" +
                    "    ░░                        ░░░░                           _.-'___'-._                      \n" +
                    "  ░░                ░░    ░░  ░░░░░░                       .'--.`   `.--'.                    \n" +
                    "  ░░                ██░░  ██    ░░░░                      /.'   \\   /   `.\\                 \n" +
                    "  ░░                ██░░  ██    ░░░░                     | /'-._/```\\_.-'\\ |                \n" +
                    "  ░░            ░░            ░░░░░░                     |/    |     |    \\|                 \n" +
                    "  ░░░░░░                      ░░░░░░                     | \\ .''-._.-''. / |                 \n" +
                    "    ░░░░░░                  ░░░░░░                        \\ |     |     | /                  \n" +
                    "    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░                         '.'._.-'-._.'.'                    \n" +
                    "        ░░░░░░░░░░░░░░░░░░░░░░                               '-:_____;-'                         ";

            aciiArtBall2 =
                    "                                                                                              \n" +
                    "             ░░░░░░░░░░░░                                                                     \n" +
                    "         ░░░░          ░░░░░░                                                                 \n" +
                    "       ░░                    ░░                                                               \n" +
                    "     ░░                      ░░░░                                                             \n" +
                    "   ░░                        ░░░░░░                              ___                          \n" +
                    "   ░░                  ░░    ░░░░░░                          _.-'___'-._                      \n" +
                    " ░░                    ██    ██░░░░░░                      .'--.`   `.--'.                    \n" +
                    " ░░                    ██    ██  ░░░░                     /.'   \\   /   `.\\                 \n" +
                    " ░░                ░░  ░░    ░░  ░░░░                    | /'-._/```\\_.-'\\ |                \n" +
                    " ░░                              ░░░░                    |/    |     |    \\|                 \n" +
                    " ░░░░░░                        ░░░░░░                    | \\ .''-._.-''. / |                 \n" +
                    "   ░░░░░░░░░░░░░░░░░░░░░░░░  ░░░░░░                       \\ |     |     | /                  \n" +
                    "   ░░░░░░░░                ░░░░░░░░                        '.'._.-'-._.'.'                    \n" +
                    "                                                             '-:_____;-'                      \n" +
                                                                                                                     "";

        }
        System.out.println("\nYou have now made a " + race.toLowerCase() + " that is named " + tamagotchi.name + "." );
        System.out.println(tamagotchi.name + " is " + tamagotchi.age + " years old and is " + tamagotchi.mood + ".");
        System.out.println("\nThis is " + tamagotchi.name + "\n");
        System.out.println(tamagotchi.energy);
        System.out.println(raceAciiArt1 + "\n");

        do {
            System.out.println("What would you like to do now?");
            displayActivities(activities);
            int activityChoice = scanner.nextInt();
            if (activityChoice == 1) {
                play(tamagotchi,raceAciiArt1,raceAciiArt2,aciiArtBall1,aciiArtBall2);
            } else if (activityChoice == 2) {
                feed(tamagotchi);
            } else if (activityChoice == 3) {
                sleep(tamagotchi,raceAciiArtSleep1,raceAciiArtSleep2);
            } else {
                System.out.println("Please enter 1 to play, 2 to feed or 3 to sleep:");

            }
            if (tamagotchi.energy == 0) {
                validation = true;

            }
        } while (!validation);


        System.out.println("//////////////////////////////////////////////////////////");
        System.out.println("                    GAME OVER                             ");
        System.out.println("//////////////////////////////////////////////////////////");
        System.out.println("\nYour Tamagotchi died because it lost all of its energy");


    }
    public static void play (Tamagotchi tamagotchi, String raceAciiArt1, String raceAciiArt2, String aciiArtBall1, String aciiArtBall2) {
        int randomNumber = 1;
        if (randomNumber == 1) {
            System.out.println(tamagotchi.name + " rolls a ball and chases after it");
            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            for (int i = 0; i < 7; i++) {
                System.out.println(aciiArtBall1);
                try {
                    Thread.sleep(1*1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                clearScreen();
                System.out.println(aciiArtBall2);
                try {
                    Thread.sleep(1*1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                clearScreen();
            }

        }
    }
    public static void feed (Tamagotchi tamagotchi) {

    }
    public static void sleep(Tamagotchi tamagotchi,String raceAciiArtSleep1,String raceAciiArtSleep2) {
        System.out.println(tamagotchi.name + " goes to sleep");
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(raceAciiArtSleep1);
            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            clearScreen();
            System.out.println(raceAciiArtSleep2);
            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            clearScreen();
        }


    }

    public static void clearScreen () {
        for (int i = 0; i < 15; i++) {
            System.out.println("");

        }
    }

    public static void displayActivities (String[] activities) {
        for (int i = 0; i < activities.length; i++) {
            System.out.println((i+1) + " - " + activities[i]);
        }
    }


    public static void gameInfo (String playerInput, boolean validation) {
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


    public static int choiceOfTamagotchi () {
        int tamagotchiChoice = scanner.nextInt();
        int choice = 0;
        do {
            if (tamagotchiChoice == 1) {
                choice = 1;

                validation = true;

            } else if (tamagotchiChoice == 2) {
                choice = 2;

                validation = true;

            } else {
                System.out.println("Please enter 1 for snake or 2 for blob");
                tamagotchiChoice = scanner.nextInt();
            }
        } while (!validation);

        return choice;
    }

    public static String nameTamagotchi () {
        System.out.println("What you would like your Tamagotchi to be named");
        String tamagotchiName = scanner.next();
        return tamagotchiName;
    }

    public static Mood moodTamagotchi () {
        Mood tamagotchiMood = Mood.HAPPY;
        int moodNumber = randomNum.nextInt(5);
        if (moodNumber == 0) {
            tamagotchiMood = Mood.HAPPY;
        } else if (moodNumber == 1) {
            tamagotchiMood = Mood.ANGRY;
        } else if (moodNumber == 2) {
            tamagotchiMood = Mood.ENERGETIC;
        } else if (moodNumber == 3) {
            tamagotchiMood = Mood.NEUTRAL;
        } else if (moodNumber == 4) {
            tamagotchiMood = Mood.SAD;
        } else if (moodNumber == 5) {
            tamagotchiMood = Mood.SLEEPY;
        }

        return tamagotchiMood;
    }

}
