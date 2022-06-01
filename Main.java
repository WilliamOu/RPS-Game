import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char gamemode;

    //Prompts player for gamemode
    System.out.print("Welcome to Rock Paper Scissors! Are you playing [A]lone or [B]attling another player? ");
      gamemode = input.next().charAt(0);
    //Loops until a valid input is given
    while (gamemode != 'a' && gamemode != 'A' && gamemode != 'b' && gamemode != 'B') {
      System.out.print("Invalid input. Are you playing [A] Singleplayer or [B] Multiplayer? ");
      gamemode = input.next().charAt(0);
    }
    if (gamemode == 'a' || gamemode == 'A') {
      versusComputer(input);
    } else if (gamemode == 'b' || gamemode == 'B') {
      versusPlayer(input);
    } else {
      System.out.println("An unexpected error has occured");
      System.exit(0);
    }
    
    //Resource leak management
    input.close();
  }

  public static void versusComputer(Scanner input) {
    System.out.print("[A] How many points are you playing to? ");
    Display.scoreToWin = input.nextInt();
    if (Display.scoreToWin == 0) {
      Display.scoreToWin++;
    }

    Display.screenInitialize();

    //Game loop
    while(Display.playerScore < Display.scoreToWin &&  Display.opponentScore < Display.scoreToWin) {
			int playerMove = input.nextInt();
      //Displays the screen
			Display.screen(playerMove);
		}

    //Win
    if (Display.playerScore >= Display.scoreToWin) {
      Display.screenPlayerWin();
    } else {
      Display.screenPlayerLose();
    }
  }
  
  public static void versusPlayer(Scanner input) {
    System.out.print("[B] How many points are you playing to? ");
    DisplayMultiplayer.scoreToWin = input.nextInt();
    if (DisplayMultiplayer.scoreToWin == 0) {
      DisplayMultiplayer.scoreToWin++;
    }

    DisplayMultiplayer.screenInitialize();

    //Game loop
    while(DisplayMultiplayer.playerOneScore < DisplayMultiplayer.scoreToWin &&  DisplayMultiplayer.playerTwoScore < DisplayMultiplayer.scoreToWin) {
      //Player One Action
      if (DisplayMultiplayer.turn == 1) { 
			  DisplayMultiplayer.screenMoveOne(input);
      }
      //Player Two Action
      else {
        if (DisplayMultiplayer.playerTwoMove == 0) {
          DisplayMultiplayer.screenPlayerQuit();
		    }
			  DisplayMultiplayer.screenMoveTwo(input);
      }
		}

    //Win
    if (DisplayMultiplayer.playerOneScore >= DisplayMultiplayer.scoreToWin) {
      DisplayMultiplayer.screenPlayerWin();
    } else {
      DisplayMultiplayer.screenPlayerLose();
    }
  }
}
