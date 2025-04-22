package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
  static final int DEFAULT_INITIAL_CAPACITY = 16;

  private LinkedList<E>[] buckets;

  private int size = 0;
  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV3() {
    initBuckets();
  }

  public MyHashSetV3(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  private void initBuckets() {
    this.buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();
    }
  }

  public boolean add(E value) {
    int hashIndex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashIndex]; // O(1)
    if (bucket.contains(value)) { // O(n)
      return false;
    }

    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(Object searchValue) {
    int hashIndex = hashIndex(searchValue); // O(1)
    LinkedList<E> bucket = buckets[hashIndex]; // O(1)
    return bucket.contains(searchValue); // O(n)
  }

  public boolean remove(Object value) {
    int hashIndex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashIndex]; // O(1)
    boolean result = bucket.remove(value); // O(n)
    if (result) {
      size--;
      return true;
    } else {
      return false;
    }
  }

  private int hashIndex(Object value) {
    return Math.abs(value.hashCode()) % capacity;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV3{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }
}
