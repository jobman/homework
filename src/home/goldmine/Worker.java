package home.goldmine;

public class Worker implements Runnable{

  private GoldMine mine;

  public Worker(GoldMine mine) {
    this.mine = mine;
    System.out.println("New worker ready");
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
      mine.get();
    }
    
  }
  
}
