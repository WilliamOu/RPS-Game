public class MultiplayerThreadTwo extends Thread {
  public void run() {
    super.run();
    while(DisplayMultiplayer.playerTwoMove == 9999) {
      DisplayMultiplayer.screenTwoLoad();
    }
    return;
  }
}
