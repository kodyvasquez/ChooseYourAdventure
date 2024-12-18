import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        // Adding the scanner to the code
        Scanner scanner = new Scanner(System.in);
        // Introducing the project to the reader
        System.out.println("Welcome to Choose Your Adventure! Today you will be finding and ordering a meal!");

        System.out.println("Do you want to go to the West Mall or East Mall?");
        String mallChoice = scanner.nextLine();
        // This is the entire code if the user chooses East Mall
        if (mallChoice.equals("East Mall") || mallChoice.equals("east mall")) {
            System.out.println("You have chosen the East Mall");
            System.out.println("Would you like to eat pizza or pasta?");
            // They pick what type of food they want
            String restaurantChoice = scanner.nextLine();
            if (restaurantChoice.equals("pizza") || restaurantChoice.equals("Pizza")) {
                System.out.println("You have chosen Sam's Pizza Parlor");
                System.out.println("Do you want peperoni or cheese?");
                String pizzaChoice = scanner.nextLine();
                if (pizzaChoice.equals("peperoni") || pizzaChoice.equals("Peperoni")) {
                    System.out.println("You have been served your peporoni pizza");
                }
                if (pizzaChoice.equals("cheese") || pizzaChoice.equals("Cheese")) {
                    System.out.println("You have been served your peporoni pizza");

                }
                if (restaurantChoice.equals("pasta") || restaurantChoice.equals("Pasta")) {
                    System.out.println("You have chosen Sally's Italian Diner");
                    System.out.println("Do you want bolognese or butter pasta?");
                    String pastaChoice = scanner.nextLine();

                }
            }

        }

    }
}