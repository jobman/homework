package home.work101;

public class MainClass {

  public static void main(String[] args) {

    Pudge pudge = new Pudge("Pudge", 12, 10, 8);
    Zeus zeus = new Zeus("Zeus", 10, 8, 12);

    DotaEngine dotaEngine = new DotaEngine(pudge, zeus);
    dotaEngine.start();
  }

}
