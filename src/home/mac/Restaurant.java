package home.mac;

public class Restaurant {
  private volatile boolean busy;

  public synchronized void service(Visitor visitor) {
    if (busy) {
      try {
        wait();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    busy = true;
    for (int i = 0; i < 3; i++) {
      try {
        System.out.println("handling visitor ¹" + visitor.number);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    if (visitor.roll()) {
      System.out.println("visitor ¹" + visitor.number + " has been rool out JACKPOT");

      System.exit(0);
    }
    System.out.println("Visitor has serviced");
    visitor.serviced = true;
    busy = false;
    notify();

  }

}
