package home.work101;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Store {
  private class IntelectComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {

      return ((item1.getIntelect() > item2.getIntelect()) ? (item1.getIntelect())
          : (item2.getIntelect()));
    }

  }

  Comparator<Item> intelectComparator = new IntelectComparator();
  TreeSet<Item> itemTree = new TreeSet<Item>(intelectComparator);

  Store() {

  }

  public void addItem(Item item) {
    itemTree.add(item);
  }

  public void deleteItem(String name) {
    Iterator<Item> it = itemTree.iterator();
    while (it.hasNext()) {
      if (it.next().getName().equals(name)) {
        it.remove();
      }
    }
  }

}
