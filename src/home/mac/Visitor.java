package home.mac;

public class Visitor implements Runnable {

  public int number;
  public boolean serviced;

  private Restaurant restaurant;


  public Visitor(Restaurant restaurant, int number) {
    this.number = number;
    this.restaurant = restaurant;
    new Thread(this).start();
  }

  @Override
  public void run() {
    while (!serviced) {
      restaurant.service(this);
    }

  }

  public boolean roll() {
    return ((Math.random() * 2) > 1 ? true : false);
  }

}
