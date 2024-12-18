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
                    System.out.println("You have been served your cheese pizza");

                }
                if (restaurantChoice.equals("pasta") || restaurantChoice.equals("Pasta")) {
                    System.out.println("You have chosen Sally's Italian Diner");
                    System.out.println("Do you want noodles or ravioli?");
                    String pastaChoice = scanner.nextLine();
                    if (pastaChoice.equals("noodles") || pastaChoice.equals("Noodles")) {
                        System.out.println("You have been served noodles.");
                    }
                    if (pastaChoice.equals("ravioli") || pastaChoice.equals("Ravioli")) {
                        System.out.println("You have been served ravioli.");

                    }

                }

            }

        }
        // This is the entire code if the user chooses West Mall
        if (mallChoice.equals("West Mall") || mallChoice.equals("west mall")) {
            System.out.println("You have chosen the West Mall");
            System.out.println("Would you like to eat mexican or chinese?");
            String secondRestaurantChoice = scanner.nextLine();
            if (secondRestaurantChoice.equals("mexican") || secondRestaurantChoice.equals("Mexican")) {
                System.out.println("You are now at Raphael's Tacos and Burritos");
                System.out.println("Do you want quesedillas or tacos?");
                String mexicanChoice = scanner.nextLine();
                if (secondRestaurantChoice.equals("quesedillas") || secondRestaurantChoice.equals("Quesedillas")) {
                    System.out.println("You have been served a quesedilla.");
                }
                if (secondRestaurantChoice.equals("tacos") || secondRestaurantChoice.equals("Tacos")) {
                    System.out.println("You have been served tacos.");
                }
            }
            if (secondRestaurantChoice.equals("chinese") || secondRestaurantChoice.equals("Chinese")) {
                System.out.println("You are now at DJ's Chinese");
                System.out.println("Do you want potstickers or lo mein?");
                String chineseChoice = scanner.nextLine();
                if (chineseChoice.equals("potstickers") || secondRestaurantChoice.equals("Potstickers")) {
                    System.out.println("You have been served potstickers.");
                }
                if (chineseChoice.equals("lo mein") || secondRestaurantChoice.equals("Lo mein")) {
                    System.out.println("You have been served lo mein.");
                }
            }
        }
    }
}