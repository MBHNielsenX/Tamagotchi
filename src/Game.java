import java.util.Timer;
import java.util.Scanner;
import java.util.Random;

public class Game {
    //Random generator, scanner and a boolean validator
    public static Random randomNum = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean validation = false;

    public static void main(String[] args) {
        //Needed to create a tamagotchi object and give it a value in order to process it in a method later
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
        int randomEnergyLv = 6 + randomNum.nextInt(4);
        validation = false;
        String[] activities = {"play","feed","sleep"};
        String race = null;
        String raceAciiArt1 = null;
        String raceAciiArt2 = null;
        String raceAciiArt3 = null;
        String raceAciiArtSleep1 = null;
        String raceAciiArtSleep2 = null;
        String raceAciiArtEat1 = null;
        String raceAciiArtEat2 = null;
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
            //If the players choice is 1 then the tamagotchi will be set to a snake and the strings will be given the value of the drawings
            tamagotchi = new Snake(nameTamagotchi(),0,moodTamagotchi(),1 + randomEnergyLv,randomNum.nextInt(1)+1);
            race = "Snake";
            raceAciiArt1 = "_/\\__/\\__0>";
            raceAciiArt2 = "_________0>";
            raceAciiArt3 =
                    "      /0>  \n"+
                    "_____/       ";
            aciiArtBall1 =
                    "                ┈┈┈☆☆☆☆☆☆☆┈┈┈\n" +
                    "                ┈┈╭┻┻┻┻┻┻┻┻┻╮┈┈\n" +
                    "                ┈┈┃╱╲╱╲╱╲╱╲╱┃┈┈\n" +
                    "                ┈╭┻━━━━━━━━━┻╮┈\n" +
                    "            /0> ┈┃╱╲╱╲╱╲╱╲╱╲╱┃┈\n" +
                    "      _____/    ┈┗━━━━━━━━━━━┛┈";
            aciiArtBall2 =
                    "                ┈┈┈☆☆☆☆☆☆☆┈┈┈\n" +
                    "                ┈┈╭┻┻┻┻┻┻┻┻┻╮┈┈\n" +
                    "                ┈┈┃╱╲╱╲╱╲╱╲╱┃┈┈\n" +
                    "                ┈╭┻━━━━━━━━━┻╮┈\n" +
                    "          \\0>  ┈┃╱╲╱╲╱╲╱╲╱╲╱┃┈\n" +
                    "      _____\\   ┈┗━━━━━━━━━━━┛┈";
            raceAciiArtSleep1 = null;
            raceAciiArtSleep2 = null;
            raceAciiArtEat1 = null;
            raceAciiArtEat2 = null;

        } else if (choice == 2) {
            //If the players choice is 2 then the tamagotchi will be set to a blob and the strings will be given the value of the drawings
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
                    "                                      \n" +
                    "             ░░░░░░░░░░░░             \n" +
                    "         ░░░░          ░░░░░░         \n" +
                    "       ░░                    ░░       \n" +
                    "     ░░                      ░░░░    \n" +
                    "   ░░                        ░░░░░░  \n" +
                    "   ░░                  ░░    ░░░░░░  \n" +
                    " ░░                    ██    ██░░░░░░\n" +
                    " ░░                    ██    ██  ░░░░\n" +
                    " ░░                ░░  ░░    ░░  ░░░░\n" +
                    " ░░                              ░░░░\n" +
                    " ░░░░░░                        ░░░░░░\n" +
                    "   ░░░░░░░░░░░░░░░░░░░░░░░░  ░░░░░░  \n" +
                    "   ░░░░░░░░                ░░░░░░░░  \n" +
                    "                                     \n" +
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

            raceAciiArt3 =
                    "                                                                                              \n" +
                            "                                                                                      \n" +
                            "              ░░░░░░░░░░                                                              \n" +
                            "          ░░            ░░                                                            \n" +
                            "        ░░                ░░░░                                                        \n" +
                            "      ░░                  ░░░░░░                                                      \n" +
                            "    ░░              ██  ░░██░░░░░░                                                    \n" +
                            "    ░░              ████  ████░░                                                      \n" +
                            "  ░░                  ██  ▒▒██░░░░░░                                                  \n" +
                            "  ░░                  ██    ▓▓  ░░░░                                                  \n" +
                            "  ░░                            ░░░░                                                  \n" +
                            "  ░░                            ░░░░                                                  \n" +
                            "  ░░░░                        ░░░░░░                                                  \n" +
                            "    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░                                                    \n" +
                            "    ░░░░░░░░              ░░░░░░░░                                                      " +
                                                                                                                     "";

            raceAciiArtEat1 =
                            "          ░░░░░░░░░░░░                                           \n" +
                            "      ░░░░            ░░░░                                       \n" +
                            "                      ░░░░                                      \n" +
                            "    ░░                    ░░░░                               \n" +
                            "   ░░                      ░░░░░░                           \n" +
                            "   ░░                        ░░░░                                \n" +
                            "   ░░                        ░░░░                            \n" +
                            "   ░░                        ░░░░                             \n" +
                            "  ░░                        ░░░░                               \n" +
                            "░░                        ░░░░░░░░          ┈┈┈☆☆☆☆☆☆☆┈┈┈   \n" +
                            "░░                ▓▓    ░░██  ░░░░          ┈┈╭┻┻┻┻┻┻┻┻┻╮┈┈     \n" +
                            "░░              ██▓▓    ████  ░░░░          ┈┈┃╱╲╱╲╱╲╱╲╱┃┈┈    \n" +
                            "░░              ██░░    ██░░  ░░░░          ┈╭┻━━━━━━━━━┻╮┈    \n" +
                            "░░░░░░      ░░              ░░░░░░          ┈┃╱╲╱╲╱╲╱╲╱╲╱┃┈       \n" +
                            "  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░            ┈┗━━━━━━━━━━━┛┈         ";

            raceAciiArtEat2 =
                            "                                                                 \n" +
                            "          ░░░░░░░░░░░░                                           \n" +
                            "      ░░░░            ░░░░                                       \n" +
                            "    ░░                    ░░░░                               \n" +
                            "   ░░                      ░░░░░░                           \n" +
                            "   ░░                        ░░░░                                \n" +
                            "   ░░                        ░░░░                            \n" +
                            "   ░░                        ░░░░                             \n" +
                            "  ░░                        ░░░░                               \n" +
                            "░░                ▓▓    ░░██  ░░░░                     ☆┈┈┈     \n" +
                            "░░              ██▓▓    ████  ░░░░                     ┻╮┈┈    \n" +
                            "░░              ██░░    ██░░  ░░░░                     ╱┃┈┈    \n" +
                            "░░                   ░        ░░░░                   ━━━┻╮┈    \n" +
                            "░░░░░░      ░░              ░░░░░░                  ╱╲╱╲╱┃┈      \n" +
                            "  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░                  ━━━━━━━┛┈         ";



        }
        System.out.println("\nYou have now made a " + race.toLowerCase() + " that is named " + tamagotchi.name + "." );
        System.out.println(tamagotchi.name + " is " + tamagotchi.age + " years old and is " + tamagotchi.mood + ".");
        System.out.println("\nThis is " + tamagotchi.name + "\n");


        do {
            System.out.println(raceAciiArt1);
            setMood(tamagotchi);
            stats(tamagotchi);
            System.out.println("What would you like to do now?");
            displayActivities(activities);
            int activityChoice = scanner.nextInt();

            if (activityChoice == 1) {
                play(tamagotchi, aciiArtBall1,aciiArtBall2);
                clearScreen();
            } else if (activityChoice == 2) {
                feed(tamagotchi,raceAciiArt2,raceAciiArt3,raceAciiArtEat1,raceAciiArtEat2);
                clearScreen();
            } else if (activityChoice == 3) {
                sleep(tamagotchi,raceAciiArtSleep1,raceAciiArtSleep2);
                clearScreen();
            } else {
                System.out.println("Please enter 1 to play, 2 to feed or 3 to sleep:");

            }
            if (tamagotchi.energy <= 0) {
                validation = true;

            }
        } while (!validation);

        //If the energy level reaches 0 or below then the game ends and prints this message
        System.out.println("//////////////////////////////////////////////////////////");
        System.out.println("                    GAME OVER                             ");
        System.out.println("//////////////////////////////////////////////////////////");
        System.out.println("\nYour Tamagotchi died because it lost all of its energy");


    }
    public static Mood setMood (Tamagotchi tamagotchi) {
        //Sets the mood of the tamagotchi after its level of energy
        if (tamagotchi.energy < 3) {
            tamagotchi.mood = Mood.ANGRY;
        } else if (tamagotchi.energy < 6) {
            tamagotchi.mood = Mood.NEUTRAL;
        } else if (tamagotchi.energy < 9) {
            tamagotchi.mood = Mood.HAPPY;
        } else if (tamagotchi.energy <= 10){
            tamagotchi.mood = Mood.ENERGETIC;
        }
        return tamagotchi.mood;
    }

    public static void stats (Tamagotchi tamagotchi) {
        //Prints the mood and energy so the player can see how much energy is left
        System.out.println("//////////////////////////////////////////////");
        System.out.println("  Moood = " + tamagotchi.mood + " ---- Energy = " + tamagotchi.energy);
        System.out.println("//////////////////////////////////////////////");
    }
    public static void play (Tamagotchi tamagotchi, String aciiArtBall1, String aciiArtBall2) {
        //A method that makes the tamagotchi play with a ball
        System.out.println(tamagotchi.name + " rolls a ball and chases after it");
        try {
            Thread.sleep(1*2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        //Prints the action 7 times with delay so it looks like it is running
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
            //Decreases the energy level of the tamagotchi
            tamagotchi.energy += 1 - randomNum.nextInt(6);

        }
    }
    public static void feed (Tamagotchi tamagotchi,String raceAciiArt2,String raceAciiArt3, String raceAciiArtEat1, String raceAciiArtEat2) {
        //A method that makes the tamagotchi eat a cake.
        System.out.println(tamagotchi.name + " eats a cake");
        System.out.println(raceAciiArt2);
        try {
            Thread.sleep(1*4000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        //Prints the tamagotchi 7 times with a delay so it looks like it eats.
        for (int i = 0; i < 7; i++) {
            System.out.println(raceAciiArtEat1);
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            clearScreen();
            System.out.println(raceAciiArtEat2);
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            clearScreen();
        }
        System.out.println(raceAciiArt3);
        try {
            Thread.sleep(1 * 2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        clearScreen();
        //Increases the energy level of the tamagotchi
        tamagotchi.energy += 2 + randomNum.nextInt(3);


    }
    public static void sleep(Tamagotchi tamagotchi,String raceAciiArtSleep1,String raceAciiArtSleep2) {
        //A method that makes it look like the tamagotchi is sleeping
        System.out.println(tamagotchi.name + " goes to sleep");
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        //Prints the action 7 times with a delay
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
            //Increases the energy level of the tamagotchi
            tamagotchi.energy += 2 + randomNum.nextInt(7);
        }


    }

    public static void clearScreen () {
        //A for loop that prints 15 lines. Makes it look like it clears the terminal
        for (int i = 0; i < 15; i++) {
            System.out.println("");

        }
    }

    public static void displayActivities (String[] activities) {
        //Prints the activity options to the terminal
        for (int i = 0; i < activities.length; i++) {
            System.out.println((i+1) + " - " + activities[i]);
        }
    }


    public static void gameInfo (String playerInput, boolean validation) {
        //A loop that makes you choose which tamagotchi the player wants to create
        do {

            if (playerInput == null || playerInput == "") {
                System.out.println("\n\n\n\n\nWelcome to Tamagotchi");
                System.out.println("\nIn this game you choose a Tamagotchi to look after, feed and play with");
                //A try catch function that forces the terminal to pause for the set amount of time
                //Functioning as a sort of delay
                try {
                    Thread.sleep(1 * 6000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("\nIf your Tamagotchi's energy goes to 0 or below then it will die and you loose the game");
                try {
                    Thread.sleep(1 * 6000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
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
        //A bit of an overkill method that essentially saves the choice that the player makes in an integer
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
        //Method that takes the name the player wants to give the tamagotchi and returns it as a String
        System.out.println("What you would like your Tamagotchi to be named");
        String tamagotchiName = scanner.next();
        return tamagotchiName;
    }

    public static Mood moodTamagotchi () {
        //sets the first mood for the tamagotchi when first created
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
