package home.goldmine;

public class GoldMine {

  private int gold = 1000;
  
  
  public synchronized int get() {
    if(gold==0) { 
      System.out.println("Mine is empty - now exit");
      System.exit(0);
      return 0;
    }
    if(gold>1) {
      gold-=3;
      System.out.println("Mined 3 gold, rest: "+gold);
      return 3;
    }
    if(gold>0) {
      gold-=1;
      System.out.println("Mined 1 gold, rest: "+gold);
      return 1;
    }
    return -1;
  }
}
