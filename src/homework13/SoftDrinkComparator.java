package homework13;

import java.util.Comparator;

public class SoftDrinkComparator implements Comparator<SoftDrink> {

  @Override
  public int compare(SoftDrink arg0, SoftDrink arg1) {
    return arg0.name.compareTo(arg1.name);
  }

}
