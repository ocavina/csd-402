// Oscar Avina
// 06/14/2026
// Module 2.2 Assignment
// This program simulates a Rock-Paper-Scissors game

import java.util.Scanner;

public class Avina_mod_2_csd402 {

  public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    // generates the computer's selection
    int computerRandomSelection = (int)(Math.random() * 3) + 1;

    int userSelection;
    String computerChoice = "";
    String userChoice = "";
    String result = "";

    // gets the user's selection
    System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
    userSelection = input.nextInt();

    // switch statement converts the computer's number to a string
    switch (computerRandomSelection) {
      case 1:
        computerChoice = "Rock";
        break;
      case 2:
        computerChoice = "Paper";
        break;
      case 3:
        computerChoice = "Scissors";
        break;
    }

    // switch statement converts the user's number to a string
    switch (userSelection) {
      case 1:
        userChoice = "Rock";
        break;
      case 2:
        userChoice = "Paper";
        break;
      case 3:
        userChoice = "Scissors";
        break;
    }

    // determines the result of the game
    if (userSelection == computerRandomSelection) {
      result = "It is a tie.";
    } else if ((userSelection == 1 && computerRandomSelection == 3)
        || (userSelection == 2 && computerRandomSelection == 1)
        || (userSelection == 3 && computerRandomSelection == 2)) {
      result = "You win.";
    } else {
      result = "The computer wins.";
    }

    // displays the selections and result
    System.out.println("Computer selected: " + computerChoice);
    System.out.println("You selected: " + userChoice);
    System.out.println("Result: " + result);
  }
}