package home.work91;

public class Hero {

  Item[] slot = new Item[2];
  private int strenght;
  private int agilty;
  private int intelect;

  private int health;
  private int strike;

  private String name;

  private int countOfStrikes = 0;

  private void reCalculateStrike() {
    strike = strenght + agilty / 2 + intelect / 3;
  }

  public Hero(String name, int strenght, int agilty, int intelect) {
    this.name = name;
    this.strenght = strenght;
    this.agilty = agilty;
    this.intelect = intelect;
    health = 100;
    reCalculateStrike();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item[] getSlot() {
    return slot;
  }

  public int getStrenght() {
    return strenght;
  }

  public int getAgilty() {
    return agilty;
  }

  public int getIntelect() {
    return intelect;
  }

  public int getHealth() {
    return health;
  }

  public int getStrike() {
    countOfStrikes++;
    if ((countOfStrikes % 3) == 0) {
      int damageUlt = ultimate();
      System.out.println(name + " get " + damageUlt + " of damage from ULTIMATE");
      return damageUlt;
    } else {
      System.out.println(name + " get " + strike + " of damage");
      return strike;
    }
  }

  public int ultimate() {
    return 100;
  }

  public void takeHit(int damage) {
    System.out.println(name + " take " + damage + " of damage");
    health -= damage;
  }

  public Item takeOffSlot(int index) {
    if (index >= slot.length) {
      return null;
    }
    Item tmp = slot[index];
    slot[index] = null;
    strenght -= tmp.getStrenght();
    agilty -= tmp.getAgilty();
    intelect -= tmp.getIntelect();
    reCalculateStrike();
    System.out.println(name + " take OFF a " + tmp.getName());
    return tmp;
  }

  public void takeOnSlot(Item item, int index) {
    if (index < slot.length) {
      if (slot[index] == null) {
        slot[index] = item;
        strenght += item.getStrenght();
        agilty += item.getAgilty();
        intelect += item.getIntelect();
        reCalculateStrike();
        System.out.println(name + " take ON a " + item.getName());
      } else {
        System.out.println("slote " + index + " already have item");
      }
    } else {
      System.out.println("out of slot index");
    }
  }
}
