package home.goldmine;

public class MainClass {

  public static void main(String[] args) {
    GoldMine mine = new GoldMine();
    Worker w1 = new Worker(mine);
    Worker w2 = new Worker(mine);
    Worker w3 = new Worker(mine);
    Barack barack = new Barack(mine);

  }

}
