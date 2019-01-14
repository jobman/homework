package home.work101;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Store {
  private class IntelectComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {

      if (item1.getIntelect() > item2.getIntelect()) {
        return 1;
      } else if (item1.getIntelect() < item2.getIntelect()) {
        return -1;
      } else {
        return 0;
      }

    }

  }

  private Comparator<Item> intelectComparator = new IntelectComparator();
  private TreeSet<Item> itemTree = new TreeSet<Item>(intelectComparator);

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

  public TreeSet<Item> getItemTree() {
    return itemTree;
  }

}
