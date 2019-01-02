package home.work101;

public class Pudge extends Hero {

  public Pudge(String name, int strenght, int agilty, int intelect) {
    super(name, strenght, agilty, intelect);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int ultimate() {
    System.out.println("Ultimate of Pudge make 80 damage");
    return 35;
  }
}
