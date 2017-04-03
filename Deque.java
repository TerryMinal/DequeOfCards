public interface Deque<T> {

  //first element methods

  // adds value at beginning of deque represented by queue
  public void addFirst(T e);

  // removes first valueaa
  public T removeFirst();

  // returns true if the given argument is in the deque
  public boolean contains(T e);

  // returns value at beginning of deque
  public T peekFirst();

  // adds value at end of deque represented by queue
  public void addLast(T e);

  // removes value at end of deque
  public T removeLast();

  // returns value at end of deque
  public T peekLast();

  // returns size of deque
  public int size();

  public String toString(); 
}
