package homework13;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E> {

  private E[] arr;
  private int countOfObjects;
  private Comparator<E> comp;

  MyList() {
    arr = (E[]) new Object[3];
  }

  MyList(Comparator<E> comp) {
    arr = (E[]) new Object[3];
    this.comp = comp;
  }

  private void resize() {
    E[] arrTemp = arr.clone();
    arr = (E[]) new Object[countOfObjects * 2 + 1];
    for (int i = 0; i < arrTemp.length; i++) {
      arr[i] = arrTemp[i];
    }
  }

  public void sort() {
    for (int j = 0; j < countOfObjects; j++) {
      for (int i = 0; i < countOfObjects - 1-j; i++) {
        if (comp.compare(arr[i], arr[i + 1]) > 0) {
          E tmp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = tmp;
        }
      }
    }
  }

  @Override
  public boolean add(E element) {
    arr[countOfObjects++] = element;
    if ((arr.length / 2) < countOfObjects) {
      resize();
    }
    return false;
  }


  @Override
  public void add(int index, E element) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean contains(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public E get(int index) {
    if (index < countOfObjects) {
      return arr[index];
    } else {
      return null;
    }
  }

  @Override
  public int indexOf(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return new MyListIterator<E>(arr);
  }

  @Override
  public int lastIndexOf(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public ListIterator<E> listIterator() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean remove(Object o) {
    if (o == null) {
      return false;
    } else {
      for (int i = 0; i < countOfObjects; i++) {
        if (arr[i].equals(o)) {
          arr[i] = null;
          for (int j = i; j < countOfObjects - 1; j++) {
            arr[j] = arr[j + 1];
            arr[j + 1] = null;
          }
          countOfObjects--;
          if (countOfObjects < (arr.length / 3)) {
            resize();
          }
          return true;
        }
      }
      return false;
    }
  }

  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public E set(int index, E element) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object[] toArray() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <T> T[] toArray(T[] a) {
    // TODO Auto-generated method stub
    return null;
  }

}
