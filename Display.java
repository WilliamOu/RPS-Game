public class Display {
  public static int playerScore = 0;
  public static int opponentScore = 0;
  public static int scoreToWin = 0;

  public static void screen(int playerMove) {
    //Check if the user wants to quit the game
		if (playerMove == 0) {
      screenPlayerQuit();
		}

    screenClear();
    //screenReload();
    screenLoad();

		//Check if the user's move is valid (rock, paper, or scissors)
		if(playerMove < 0 || playerMove > 3) {
      screenClear();
      screenTop();
      screenScore();
      screenBodyBlank();
			screenBottom("                       Your move is invalid!");
		} else {
      screenThrowWindup();    
			int opponentMove = (int)(Math.random()*3) + 1;
      if (playerMove == 1 && opponentMove == 1) {
        screenScore();
        screenThrowOneOne();
        screenBottom("                           Same hand!");
        //screenBottom("                              ----");
      } else if (playerMove == 2 && opponentMove == 2) {
        screenScore();
        screenThrowTwoTwo();
        screenBottom("                           Same hand!");
      } else if (playerMove == 3 && opponentMove == 3) {
        screenScore();
        screenThrowThreeThree();
        screenBottom("                           Same hand!");
      } else if (playerMove == 1 && opponentMove == 2) {
        opponentScore++;
        screenScore();
        screenThrowOneTwo();
        screenBottom("         Rock to Paper! Round conceded to your opponent!");
      } else if (playerMove == 1 && opponentMove == 3) {
        playerScore++;
        screenScore();
        screenThrowOneThree();
        screenBottom("            Rock to Scissors! Round conceded to you!");
      } else if (playerMove == 2 && opponentMove == 1) {
        playerScore++;
        screenScore();
        screenThrowTwoOne();
        screenBottom("              Paper to Rock! Round conceded to you!");
      } else if (playerMove == 2 && opponentMove == 3) {
        opponentScore++;
        screenScore();
        screenThrowTwoThree();
        screenBottom("       Paper to Scissors! Round conceded to your opponent!");
      } else if (playerMove == 3 && opponentMove == 1) {
        opponentScore++;
        screenScore();
        screenThrowThreeOne();
        screenBottom("        Scissors to Rock! Round conceded to your opponent!");
      } else if (playerMove == 3 && opponentMove == 2) {
        playerScore++;
        screenScore();
        screenThrowThreeTwo();
        screenBottom("            Scissors to Paper! Round conceded to you!");
      }
    }
  }
  
  public static void screenInitialize() {
    //Initialize the screen
    screenUnroll();
    screenWait(250);
    screenClear();
    screenTop();
    screenScore();
    screenBodyBlank();
    screenBottom("           (1) Rock (2) Paper (3) Scissors (0) Quit");
  }
  
  public static void screenUnroll() {
    //Displays an animation of the screen unrolling
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

  /*public static void screenReload() {
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
  }*/

  public static void screenLoad() {
    //Loading screen
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
  
  public static void screenTop() {
    //Prints the top of the screen
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (          - You -         ||       - Computer -       (\n     )-------------------------||---------------------------)");
  }

  public static void screenScore() {
    //Prints the score for the screen
    System.out.println("    (             " + playerScore + "            ||            " + opponentScore + "             (\n     )----------\\___/----------------------\\___/------------)");
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
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                          ----                        (\n     )                       You Win!                       )\n    (                          ----                        (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(2500);
    screenClear();
    System.exit(0);
  }

  public static void screenPlayerLose() {
    screenWait(2000);
    screenClear();
    System.out.println("    _______________________________________________________\n    /\\                                                      \\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n    (                                                      (\n     )                                                      )\n    (                                                      (\n     )                                                      )\n\n    (                          ----                        (\n     )                       You Lose                       )\n    (                          ----                        (\n     )                                                      )\n\n    (                                                      (\n     )                                                      )\n    (                                                      (\n\n    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\\n(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n    \\/______________________________________________________/");
    screenWait(2500);
    screenClear();
    System.exit(0);
  }

  public static void screenPlayerQuit() {
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
