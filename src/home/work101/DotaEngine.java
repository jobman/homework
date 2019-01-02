package home.work101;

public class DotaEngine {
  Hero hero1;
  Hero hero2;
  
  public DotaEngine(Hero hero1, Hero hero2) {
    this.hero1=hero1;
    this.hero2=hero2;
  }
  public void start() {
    boolean end = false;
    Item latar = new Item("Shadow Blade", 12, 4, 2);
    Item linsa = new Item("Aether Lens", 10, 2, 14);
    
    hero1.takeOnSlot(latar, 0);
    hero2.takeOnSlot(linsa, 0);
    linsa = null;
    linsa = hero2.takeOffSlot(0);
    hero1.takeOnSlot(linsa, 1);
    
    System.out.println("Battle: " + hero2.getName() + " vs " + hero1.getName());
    while (!end) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      hero2.takeHit(hero1.getStrike());
      hero1.takeHit(hero2.getStrike());

      System.out.println(hero2.getName() + "'s health is " + hero2.getHealth());
      System.out.println(hero1.getName() + "'s health is " + hero1.getHealth());

      if ((hero2.getHealth() <= 0) || (hero1.getHealth() <= 0)) {
        Hero winner = null;
        if (hero2.getHealth() > 0) {
          winner = hero2;
        } else if (hero1.getHealth() > 0) {
          winner = hero1;
        }
        System.out.println((winner == null) ? ("DEAD HEAT, nobody WONs")
            : (winner.getName() + " WON this battle"));
        end = true;
      }
      System.out.println();
    }
  }
}
