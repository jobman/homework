package home.work91;

public class Zeus extends Hero {

  public Zeus(String name, int strenght, int agilty, int intelect) {
    super(name, strenght, agilty, intelect);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int ultimate() {
    System.out.println("Ultimate of Zeus make 150 of damage");
    return 30;
  }
}
