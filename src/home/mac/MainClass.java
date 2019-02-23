package home.mac;

public class MainClass {

  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();
    int rnd = (int) ((Math.random() * 5) + 5);
    System.out.println("we have " + rnd + " visitors today");
    for (int i = 0; i < rnd; i++) {
      new Visitor(restaurant,i+1);
    }

  }

}
