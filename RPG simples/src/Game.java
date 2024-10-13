import java.util.Scanner;

public class Game {

    public static void startStory(Hero hero, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== The " + hero.name + "'s Odyssey ===");
        System.out.println("\nA letter arrived.");
        System.out.println("\nPress Enter to read the letter...");

        scanner.nextLine();

        System.out.println("\nDear " + hero.name + ",");
        System.out.println("We need your help! The terrible " + enemy.name + " is attacking our village.");
        System.out.println("The only way to defeat him is using the sacred sword.");
        System.out.println("Please come quickly!\n");
    }

    public void firstChoice(Scanner scanner) {
        int choice = 0;

        System.out.println("\nMake your first choice: ");
        System.out.println("1. Go to the village.");
        System.out.println("2. Go in search of the sacred sword.");
        System.out.println("3. Stay at home.");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                goToVillage(false);
                break;

            case 2:
                searchForSword(scanner);
                break;

            case 3:
                System.out.println("\nYou stay at home. The village needs you! Game Over.");
                return;
            default:
                System.out.println("\nInvalid choice. Please try again.");
                firstChoice(scanner);
                break;
        }
    }

    public void goToVillage(boolean hasSword) {
        System.out.println("\nYou head to the village, where you find chaos.");
        System.out.println("The villagers are trying to defend themselves, but the enemy's forces are overwhelming.");

        if (hasSword) {
            System.out.println("Now that you have the sacred sword, there's a chance for victory!");
            fightOrReturn(true);
        } else {
            System.out.println("Without the sacred sword, the battle may be impossible to win.");
            fightOrReturn(false);
        }
    }

    public void searchForSword(Scanner scanner) {
        System.out.println("\nYou set off in search of the sacred sword.");
        System.out.println("After hours of journeying through dense forests and treacherous mountains,");
        System.out.println("you finally find the sacred sword.");

        System.out.println("\nWith the sword in hand, what will you do next?");
        System.out.println("1. Go to the village.");
        System.out.println("2. Return home.");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                goToVillage(true);
                break;

            case 2:
                System.out.println("\nYou return home, but the village still needs you! Game Over.");
                return;
            default:
                System.out.println("\nInvalid choice. Please try again.");
                searchForSword(scanner);
                break;
        }
    }

    public void fightOrReturn(boolean hasSword) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat will you do?");
        if (hasSword) {
            System.out.println("1. Fight with the sacred sword.");
            System.out.println("2. Return home.");
        } else {
            System.out.println("1. Fight without the sword.");
            System.out.println("2. Retreat to search for the sword.");
        }

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (hasSword) {
                    System.out.println("\nYou bravely fight with the sacred sword and defeat the enemy! Victory is yours!");
                } else {
                    System.out.println("\nYou fight bravely, but without the sacred sword, the enemy is too strong. You are defeated.");
                }
                break;

            case 2:
                if (hasSword) {
                    System.out.println("\nYou return home, but the village is left defenseless. Game Over.");
                } else {
                    System.out.println("\nYou retreat to search for the sacred sword.");
                    searchForSword(scanner);
                }
                break;

            default:
                System.out.println("\nInvalid choice. Please try again.");
                fightOrReturn(hasSword);
                break;
        }
    }
}
