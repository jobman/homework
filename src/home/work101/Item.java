package home.work101;

public class Item {

  private int strenght;
  private int agilty;
  private int intelect;
  private String name;

  public Item(String name, int strenght, int agilty, int intelect) {
    this.strenght = strenght;
    this.agilty = agilty;
    this.intelect = intelect;
    this.name = name;
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

  public String getName() {
    return name;
  }
  
  @Override
  public String toString() {
    
    return name+" str: "+strenght+ "agil: "+agilty+" int: "+intelect;
  }

}
