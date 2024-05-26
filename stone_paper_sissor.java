import java.util.Scanner;
import java.util.Random;

public class stone_paper_sissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Stone Paper Scissors!");

        while (true) {
            System.out.print("Choose your move \n1 for Stone \n2 for Paper \n3 for Scissor\n");
            int playerMove = sc.nextInt();

            // Validate player's move
            if (playerMove < 1 || playerMove > 3) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            int computerMoveIndex = random.nextInt(3);  // Generate random number between 0 and 2
            String[] moves = {"Rock", "Paper", "Scissors"};
            String computerMove = moves[computerMoveIndex];

            System.out.println("Computer's move: " + computerMove);

            // Determine the winner
            int result = (playerMove - computerMoveIndex + 3) % 3;
            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing Rock-Paper-Scissors!");
    }

    private static int getPlayerMove(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
