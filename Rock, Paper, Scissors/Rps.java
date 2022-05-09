public class Rps {
  
  public static void main(String[] args) {
    result("rock", "scissors");
    result("paper", "rock");
    result("scissors", "paper");

    result("rock", "rock");
    result("paper", "paper");
    result("scissors", "scissors");

    result("rock", "paper");
    result("paper", "scissors");
    result("scissors", "rock");

    String winner = result2("rock", "scissors");
    System.out.println(winner);
  }

  public static void result(String p1, String p2) {    
    if (p1 == p2) {
      System.out.println("Draw!");
    }
    else if (p1 == "rock" && p2 == "scissors") {
      System.out.println("Player 1 won!");
    }
    else if  ( p1 == "scissors" && p2 == "paper") { 
      System.out.println("Player 1 won!");
    }
    else if ( p1 == "paper" && p2 == "rock") {
      System.out.println("Player 1 won!");
    }
    else {
      System.out.println("Player 2 won!");
    }
  }

  public static String result2(String p1, String p2) {    
    if (p1 == p2) {
      return "Draw!";
    }
    else if (p1 == "rock" && p2 == "scissors") {
      return "Player 1 won!";
    }
    else if  ( p1 == "scissors" && p2 == "paper") { 
      return "Player 1 won!";
    }
    else if ( p1 == "paper" && p2 == "rock") {
      return "Player 1 won!";
    }
    else {
      return "Player 2 won!";
    }
  }


}