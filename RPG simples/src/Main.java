import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        Hero hero = new Hero();
        hero.health = 20;
        hero.strength = 5;

        Enemy enemy = new Enemy();
        enemy.name = "Grozlakh";
        enemy.health = 40;
        enemy.strength = 10;


        int option = 0;
        while (option == 0) {
            System.out.println("======= Menu =======");
            System.out.println("1. Play");
            System.out.println("2. Games started");
            System.out.println("3. Exit");
            System.out.print("Select a option: ");

            option = scanner.nextInt();
            scanner.nextLine();
        }
        switch (option) {
            case 1:
                System.out.print("Enter hero's name: ");
                hero.name = scanner.nextLine();

                game.startStory(hero, enemy);
                scanner.nextLine();
                game.firstChoice(scanner);

                break;

            case 2:
                System.out.println("Games started: ");
                break;

            case 3:
                System.out.println("Exiting game...");
                break;

            default:
                System.out.println("ERROR: Invalid option. Please select a valid option.");
        }


    }
}

