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

  public void play()
  {
    boolean solved = false;
    currentPlayer = player1;
    
    Scanner input = new Scanner(System.in);

    boolean correct = true;


    while (!solved) 
    {

      /* your code here - game logic */
      System.out.println("Player: " + currentPlayer.getName());
      System.out.println("Current Points: " + currentPlayer.getPoints());
      System.out.println("Current Phrase: " + game.getSolvedPhrase());
    

      /* your code here - determine how game ends */
      solved = true; 
    } 

  }

}