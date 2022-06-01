import java.util.Scanner;

public class DisplayMultiplayer {
  public static int playerOneScore = 0;
  public static int playerTwoScore = 0;
  public static int scoreToWin = 0;
  public static int turn = 1;
  public static int playerOneMove = 9999;
  public static int playerTwoMove = 9999;

  public static void screenMoveOne(Scanner input) {
    MultiplayerThreadOne threadOne = new MultiplayerThreadOne();
    threadOne.start();
    playerOneMove = input.nextInt();
    if (DisplayMultiplayer.playerOneMove == 0) {
      DisplayMultiplayer.screenPlayerQuit();
		}
    if(playerOneMove < 0 || playerOneMove > 3) {
      screenClear();
      screenTop();
      screenScore();
      screenBodyInvalidOne();
			screenBottom("           (1) Rock (2) Paper (3) Scissors (0) Quit");
      //Draws the screen twice in order to override excess frames drawn by threadOne
      screenWait(100);
      screenClear();
      screenTop();
      screenScore();
      screenBodyInvalidOne();
			screenBottom("           (1) Rock (2) Paper (3) Scissors (0) Quit");
		} else {
      turn++;
    }  
  }
  
  public static void screenMoveTwo(Scanner input) {
    MultiplayerThreadTwo threadTwo = new MultiplayerThreadTwo();
    threadTwo.start();
    playerTwoMove = input.nextInt();
    screenClear();

		//Check if the user's move is valid (rock, paper, or scissors)
		if(playerTwoMove < 0 || playerTwoMove > 3) {
      screenClear();
      screenTop();
      screenScore();
      screenBodyInvalidTwo();
			screenBottom("           (1) Rock (2) Paper (3) Scissors (0) Quit");
      //Draws the screen twice in order to override excess frames drawn by threadTwo
      screenWait(100);
      screenClear();
      screenTop();
      screenScore();
      screenBodyInvalidTwo();
			screenBottom("           (1) Rock (2) Paper (3) Scissors (0) Quit");
		} else {
      screenLoad();
      screenThrowWindup();
      if (playerOneMove == 1 && playerTwoMove == 1) {
        screenScore();
        screenThrowOneOne();
        screenBottom("                           Same hand!");
        //screenBottom("                              ----");
      } else if (playerOneMove == 2 && playerTwoMove == 2) {
        screenScore();
        screenThrowTwoTwo();
        screenBottom("                           Same hand!");
      } else if (playerOneMove == 3 && playerTwoMove == 3) {
        screenScore();
        screenThrowThreeThree();
        screenBottom("                           Same hand!");
      } else if (playerOneMove == 1 && playerTwoMove == 2) {
        playerTwoScore++;
        screenScore();
        screenThrowOneTwo();
        screenBottom("          Rock to Paper! Round conceded to Player Two!");
      } else if (playerOneMove == 1 && playerTwoMove == 3) {
        playerOneScore++;
        screenScore();
        screenThrowOneThree();
        screenBottom("        Rock to Scissors! Round conceded to Player One!");
      } else if (playerOneMove == 2 && playerTwoMove == 1) {
        playerOneScore++;
        screenScore();
        screenThrowTwoOne();
        screenBottom("          Paper to Rock! Round conceded to Player One!");
      } else if (playerOneMove == 2 && playerTwoMove == 3) {
        playerTwoScore++;
        screenScore();
        screenThrowTwoThree();
        screenBottom("        Paper to Scissors! Round conceded to Player Two!");
      } else if (playerOneMove == 3 && playerTwoMove == 1) {
        playerTwoScore++;
        screenScore();
        screenThrowThreeOne();
        screenBottom("         Scissors to Rock! Round conceded to Player Two!");
      } else if (playerOneMove == 3 && playerTwoMove == 2) {
        playerOneScore++;
        screenScore();
        screenThrowThreeTwo();
        screenBottom("        Scissors to Paper! Round conceded to Player One!");
      }
      turn--;
      playerOneMove = 9999;
      playerTwoMove = 9999;
      //System.out.println("\nPress any key to continue");
      //input.next();
      screenWait(2000);
    }
  }
  
  public static void screenInitialize() {
    screenUnroll();
    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    screenBodyBlank();
    screenBottom("           (1) Rock (2) Paper (3) Scissors (0) Quit");
  }
  
  public static void screenUnroll() {
    screenWait(250);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n     ______________________________________________________\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");

    screenWait(250);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");

    screenWait(250);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");

    screenWait(250);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
  }

  public static void screenReload() {
    screenWait(100);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(100);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(100);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenUnroll();
    screenLoad();
  }

  public static void screenLoad() {
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                      ██                              )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(200);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                      ██  ██                          )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(200);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                      ██  ██  ██                      )\n    (                                                      (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(200);
  }

  public static void screenOneLoad() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (                                         ?            (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player One’s Turn");

    screenWait(90);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (         ██                              ?            (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player One’s Turn");

    screenWait(90);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (         ██  ██                          ?            (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player One’s Turn");

    screenWait(90);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (         ██  ██  ██                      ?            (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player One’s Turn");
    screenWait(800);
  }

  public static void screenTwoLoad() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (             ✓                                        (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player Two’s Turn");

    screenWait(90);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (             ✓                      ██                (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player Two’s Turn");

    screenWait(90);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (             ✓                      ██  ██            (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player Two’s Turn");

    screenWait(90);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (             ✓                      ██  ██  ██        (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
    screenBottom("                        Player Two’s Turn");
    screenWait(800);
  }
  
  public static void screenTop() {
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (      - Player One -      ||      - Player Two -      (\n     )-------------------------||---------------------------)");
  }

  public static void screenScore() {
    System.out.println("    (             " + playerOneScore + "            ||            " + playerTwoScore + "             (\n     )----------\\___/----------------------\\___/------------)");
  }

  public static void screenBottom(String message) {
    System.out.println("    (------------------------------------------------------(\n" + message + "\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
  }

  public static void screenThrowWindup() {
    screenWait(200);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                      ╓▄▓▄,           (\n     )           ,▄▓██████▄           ▐████████▄╥           )\n    (      ▓▓▓████████████▓            ██████████████▌     (\n     )     ██████████████▀            ▐█████████████▌       )\n           ▀▀▀█████▀▀               `\"\"▀▀▀▀▀▀▀▀▀\"▌\n    (                                                      (\n     )                                                      )");
    screenBottom("                              ----");
    
    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )            ,▄▄▄,                  ╓▄▄▄               )\n    (    ███▓▓▓██████████µ             ▄▄████████▄▄▄▓▌     (\n     )   ████████████████             -████████████████▌    )\n         ▀▀▀███████████▀              ▀█████████████▌\n    (             `▀▀`                  \"▀▀▀▀▀▀\"\"          (\n     )                                                      )");
    screenBottom("                              ----");

    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                      ╓▄▓▄,           (\n     )           ,▄▓██████▄           ▐████████▄╥           )\n    (      ▓▓▓████████████▓            ██████████████▌     (\n     )     ██████████████▀            ▐█████████████▌       )\n           ▀▀▀█████▀▀               `\"\"▀▀▀▀▀▀▀▀▀\"▌\n    (                                                      (\n     )                                                      )");
    screenBottom("                              ----");
    
    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )            ,▄▄▄,                  ╓▄▄▄               )\n    (    ███▓▓▓██████████µ             ▄▄████████▄▄▄▓▌     (\n     )   ████████████████             -████████████████▌    )\n         ▀▀▀███████████▀              ▀█████████████▌\n    (             `▀▀`                  \"▀▀▀▀▀▀\"\"          (\n     )                                                      )");
    screenBottom("                              ----");

    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                      ╓▄▓▄,           (\n     )           ,▄▓██████▄           ▐████████▄╥           )\n    (      ▓▓▓████████████▓            ██████████████▌     (\n     )     ██████████████▀            ▐█████████████▌       )\n           ▀▀▀█████▀▀               `\"\"▀▀▀▀▀▀▀▀▀\"▌\n    (                                                      (\n     )                                                      )");
    screenBottom("                              ----");
    
    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )            ,▄▄▄,                  ╓▄▄▄               )\n    (    ███▓▓▓██████████µ             ▄▄████████▄▄▄▓▌     (\n     )   ████████████████             -████████████████▌    )\n         ▀▀▀███████████▀              ▀█████████████▌\n    (             `▀▀`                  \"▀▀▀▀▀▀\"\"          (\n     )                                                      )");
    screenBottom("                              ----");

    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                      ╓▄▓▄,           (\n     )           ,▄▓██████▄           ▐████████▄╥           )\n    (      ▓▓▓████████████▓            ██████████████▌     (\n     )     ██████████████▀            ▐█████████████▌       )\n           ▀▀▀█████▀▀               `\"\"▀▀▀▀▀▀▀▀▀\"▌\n    (                                                      (\n     )                                                      )");
    screenBottom("                              ----");

    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                      ╓▄▓▄,           (\n     )           ,▄▓██████▄           ▐████████▄╥           )\n    (      ▓▓▓████████████▓            ██████████████▌     (\n     )     ██████████████▀            ▐█████████████▌       )\n           ▀▀▀█████▀▀               `\"\"▀▀▀▀▀▀▀▀▀\"▌\n    (                                                      (\n     )                                                      )");
    screenBottom("                              ----");
  }

  public static void screenBodyBlank() {
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n                                                         \n    (                                                      (\n     )                                                      )");
  }

  public static void screenBodyInvalidOne() {
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (        Invalid Move                     ?            (\n     )        Try Again                                     )\n                                                         \n    (                                                      (\n     )                                                      )");
  }

  public static void screenBodyInvalidTwo() {
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (             ✓                    Invalid Move        (\n     )                                   Try Again          )\n                                                         \n    (                                                      (\n     )                                                      )");
  }
  
  public static void screenThrowOneOne() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                ,,,                 ,▄▄,              )\n    (            ,▄▓███████▓           ▄▓██████▓▄      ,,  (\n     )  ███████████████████▀         Æ██████████████████    )\n        ██████████████████\"           ████▓█████████████\n    (       ██▀▀▀▀▀▀▀▀▀▀\"`            `▀▀▀▀▀▀▀▀▀▀▀▀        (\n     )                                                      )");
  }

  public static void screenThrowOneTwo() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                ,,,                                   )\n    (            ,▄▓███████▓                      ,,       (\n     )  ███████████████████▀      ╒▄▄▄▄▄▄▄▓▓██████████      )\n        ██████████████████\"           ████▓█████████████\n    (       ██▀▀▀▀▀▀▀▀▀▀\"`                                 (\n     )                                                      )");
  }

  public static void screenThrowOneThree() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                ,,,                  ,                )\n    (            ,▄▓███████▓         ,,,,, ⌠▀███████▓▄▄▄▄  (\n     )  ███████████████████▀       \"▀▀▀▀███████████████⌐    )\n        ██████████████████\"        ▄▄█████████████████⌐\n    (   ██▀▀▀▀▀▀▀▀▀▀\"`           *▀▀    \\████████▀▀\"       (\n     )                                                      )\n");
  }

  public static void screenThrowTwoOne() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                  ,▄▄,                )\n    (                                ▄▓██████▓▄      ,,    (\n     )    ▄▄▄▓▄▄▄▄▄,,               Æ██████████████████     )\n        ████████████████▀▀           ████▓█████████████\n    (                                 `▀▀▀▀▀▀▀▀▀▀▀▀        (\n     )                                                      )");
    
  }

  public static void screenThrowTwoTwo() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                                      )\n    (                                           ,,         (\n     )    ▄▄▄▓▄▄▄▄▄,,               ╒▄▄▄▄▄▄▄▓▓██████████    )\n        ████████████████▀▀            \"▀▀▀▀▀██████████▀▀▀\n    (                                                      (\n     )                                                      )");
  }

  public static void screenThrowTwoThree() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                                     ,                )\n    (                                ,,,,, ⌠▀███████▓▄▄▄▄  (\n     )    ▄▄▄▓▄▄▄▄▄,,              \"▀▀▀▀███████████████⌐    )\n        ████████████████▀▀         ▄▄█████████████████⌐\n    (                             *▀▀    \\████████▀▀\"      (\n     )                                                      )");
  }

  public static void screenThrowThreeOne() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                 ╓▄               ,▄▄,                )\n    (   ▄▄▄▄▄▓████▓▄▓█▀▀\"            ▄▓██████▓▄      ,,    (\n     )  ██████████████▄▄            Æ██████████████████     )\n        █████████████`\"▀▀▀W          ████▓█████████████\n   (      `\"▀▀▀▀▀~                   `▀▀▀▀▀▀▀▀▀▀▀▀         (\n     )                                                      )");
  }

  public static void screenThrowThreeTwo() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                 ╓▄                                   )\n    (   ▄▄▄▄▄▓████▓▄▓█▀▀\"                       ,,         (\n     )  ██████████████▄▄            ╒▄▄▄▄▄▄▄▓▓██████████    )\n        █████████████`\"▀▀▀W          \"▀▀▀▀▀██████████▀▀▀\n   (      `\"▀▀▀▀▀~                                         (\n     )                                                      )");
  }

  public static void screenThrowThreeThree() {
    screenClear();
    screenTop();
    screenScore();
    System.out.println("\n    (                                                      (\n     )                 ╓▄                  ,                )\n    (   ▄▄▄▄▄▓████▓▄▓█▀▀\"            ,,,,, ⌠▀███████▓▄▄▄▄  (\n     )  ██████████████▄▄           \"▀▀▀▀███████████████⌐    )\n        █████████████`\"▀▀▀W        ▄▄█████████████████⌐\n    (      `\"▀▀▀▀▀~               *▀▀    \\████████▀▀\"      (\n     )                                                      )");
  }

  public static void screenPlayerWin() {
    screenWait(2000);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                          ----                        (\n     )                  Player One Wins                       )\n    (                          ----                        (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(2500);
    screenClear();
    System.exit(0);
  }

  public static void screenPlayerLose() {
    screenWait(2000);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                          ----                        (\n     )                  Player Two Wins                       )\n    (                          ----                        (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(2500);
    screenClear();
    System.exit(0);
  }

  public static void screenPlayerQuit() {
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                          ----                        (\n     )                       You Quit                       )\n    (                          ----                        (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(100);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                          ----                        (\n     )                       You Quit                       )\n    (                          ----                        (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(2500);
    screenClear();
    System.exit(0);
  }

  public static void screenClear() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }

  public static void screenWait(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      System.out.println("Sleep Exception Thrown.");
      e.printStackTrace();
    }
  }
}
