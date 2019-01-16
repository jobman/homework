package homework13;

import java.util.Iterator;

public class MyListIterator<E> implements Iterator<E>{

  private int index=0;
  E[] values;
  
  MyListIterator(E[] values){
    this.values=values;
  }
  
  @Override
  public boolean hasNext() {
    return (index<values.length)&&(values[index]!=null);
  }

  @Override
  public E next() {
    return values[index++];
  }

}
