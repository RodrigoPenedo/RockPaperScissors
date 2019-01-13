import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private static final String[] HAND = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
        String player1 = HAND[(int)(Math.random() * 3)];
        String player2 = "";

        System.out.println("Welcome To Rock Paper Scissors!");

        while (!Arrays.asList(HAND).contains(player2)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choice: ");
            player2 = scan.nextLine().toLowerCase();
        }

        if (player1.equals(player2)) {
            System.out.println("It's a tie!");
        }
        else if (player1.equals("rock")) {
            if (player2.equals("paper")) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }
        }
        else if (player1.equals("paper")) {
            if (player2.equals("scissors")) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }
        }
        else if (player1.equals("scissors")) {
            if (player2.equals("paper")) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }
        }
        else {
            System.out.println("Invalid input please try again.");
        }
    }
}
