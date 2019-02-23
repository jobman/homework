package home.goldmine;

public class Barack implements Runnable {

  private GoldMine mine;

  public Barack(GoldMine mine) {
    this.mine = mine;
    new Thread(this).start();
  }

  @Override
  public void run() {
   while(true) {
     try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
     new Worker(mine);
   }

  }

}
