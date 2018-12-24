package home.work91;

public class MainClass {

  public static void main(String[] args) {
    boolean end = false;
    Pudge pudge = new Pudge("Pudge", 12, 10, 8);
    Zeus zeus = new Zeus("Zeus", 10, 8, 12);
    Item latar = new Item("Shadow Blade", 12, 4, 2);
    Item linsa = new Item("Aether Lens", 10, 2, 14);

    pudge.takeOnSlot(latar, 0);
    zeus.takeOnSlot(linsa, 0);
    linsa = null;
    linsa = zeus.takeOffSlot(0);
    pudge.takeOnSlot(linsa, 1);

    System.out.println("Battle: " + zeus.getName() + " vs " + pudge.getName());
    while (!end) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      zeus.takeHit(pudge.getStrike());
      pudge.takeHit(zeus.getStrike());

      System.out.println(zeus.getName() + "'s health is " + zeus.getHealth());
      System.out.println(pudge.getName() + "'s health is " + pudge.getHealth());

      if ((zeus.getHealth() <= 0) || (pudge.getHealth() <= 0)) {
        Hero winner = null;
        if (zeus.getHealth() > 0) {
          winner = zeus;
        } else if (pudge.getHealth() > 0) {
          winner = pudge;
        }
        System.out.println((winner == null) ? ("DEAD HEAT, nobody WONs")
            : (winner.getName() + " WON this battle"));
        end = true;
      }
      System.out.println();
    }

  }

}
