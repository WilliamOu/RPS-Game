public class MultiplayerThreadOne extends Thread {
  public void run() {
    super.run();
    while(DisplayMultiplayer.playerOneMove == 9999) {
      DisplayMultiplayer.screenOneLoad();
    }
    return;
  }
}
