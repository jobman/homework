package homework13;

import java.util.Comparator;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    System.out.println("MyList program");
    Comparator<SoftDrink> sdComparator = new SoftDrinkComparator();
    MyList<SoftDrink> list = new MyList<SoftDrink>(sdComparator);
    list.add(new SoftDrink("tomato juice","red"));
    list.add(new SoftDrink("tomato juice","red"));
    list.add(new SoftDrink("limone juice","white"));
    list.add(new SoftDrink("grapes juice","violet"));
    list.add(new SoftDrink("orange juice","orange"));
    Iterator<SoftDrink> it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("Removing 1 tomato juice with red color");
    list.remove(new SoftDrink("tomato juice","red"));
    it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("Sorting by name");
    list.sort();
    it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }

  }

}
