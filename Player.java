/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  private String name = ""; 
  private double points;
  private String guess = "";
  private Boolean hasTurn;

  /* your code here - constructor(s) */ 
  public Player() {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name? ");
    String input = sc.nextLine();
    
    name = input;
    System.out.println("Welcome to the game, "+ name);
    points = 0;
  }
  public Player(String inputName) {
    name = inputName;
    points = 0;
    System.out.println("Welcome to the game, "+ name);
  }



  /* your code here - accessor(s) */ 
  public String getName() {
    return name;
  }
  public double getPoints() {
    return points;
  }
  public String getGuess() {
    return guess;
  }

  /* your code here - mutator(s) */ 
  public void setName(String name) {
    this.name = name;
  }
  public void addToPoints(double points) {
    this.points += points;
  }



  public void skipTurn() {
    hasTurn = false;
  }

}

