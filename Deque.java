public interface Deque<T> {

  //first element methods

  // adds value at beginning of deque represented by queue
  public void addFirst(T e);

<<<<<<< HEAD
  // removes first valueaa
  public T removeFrist(T e);
=======
  // removes first value
  public T removeFirst(T e);
>>>>>>> 44a193afdf78d544d9165c74a401aed2d798e723

  // returns true if the given argument is in the deque
  public boolean contains(T e);

  // returns value at beginning of deque
  public T peekFirst(T e);

  // adds value at end of deque represented by queue
  public void addLast(T e);

  // removes value at end of deque
  public T removeLast(T e);

  // returns value at end of deque
  public T peekLast(T e);

  // returns size of deque
  public int size();
}
