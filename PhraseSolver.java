/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private Boolean solved;
  private Player currentPlayer;

  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
    currentPlayer = player1;
  }
  /* your code here - accessor(s) */
  public Player getPlayer1() {
    return player1;
  }
  public Player getPlayer2() {
    return player2;
  }
  public Board getGame() {
    return game;
  }
  public Boolean getSolved() {
    return solved;
  }
  /* your code here - mutator(s)  */

public void play() {
  Scanner input = new Scanner(System.in);
  while (!solved) {
    System.out.println("Player: " + currentPlayer.getName());
    System.out.println("Current Points: " + currentPlayer.getPoints());
    System.out.println("Current Phrase: " + game.getSolvedPhrase());
    System.out.println(" ");
    game.setLetterValue();
    // System.out.println("Phrase: " + solvedPhrase.substring(0,solvedPhrase.length()/2));
    System.out.println("Current Letter Value: " + game.getCurrentLetterValue());

    System.out.println(" ");
    System.out.println("Enter 'guess' to guess a letter, 'solve' to solve: ");
    String inputGuess = input.nextLine();

    if (inputGuess.equals("guess")) {
      System.out.println(" ");
      System.out.println("Enter a letter to guess: ");
      
      char guess = input.nextLine().toLowerCase().charAt(0);
      boolean letterFound = game.guessLetter(guess);
      if (letterFound) {
        currentPlayer.addToPoints(game.getCurrentLetterValue());
      } else {
        System.out.println("That letter isn't in the phrase. Next player.");
        System.out.println(" ");
      }
    } else if (inputGuess.equals("solve")) {
      System.out.println(" ");
      System.out.println("What do you think the phrase is? ");
      String solveAttempt = input.nextLine().toLowerCase();
      if (solveAttempt.equals(game.getPhrase().toLowerCase())) {
        solved = true;

        currentPlayer.addToPoints(game.getCurrentLetterValue());
        break;
      } else {
        System.out.println("That is not correct. Next player.");
        System.out.println(" ");
      }
    } else {
      System.out.println(" ");
      System.out.println("Invalid choice. Please enter 'guess' to guess a letter or 'solve' to solve.");
    }

    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  System.out.println("Player " + currentPlayer.getName() + " wins! They had " + currentPlayer.getPoints() + " points!");
}
}