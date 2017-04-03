public class DLNDeque<T> implements Deque<T> {

  private LLNode<T> _front, _end;
  public int _size;

  public DLNDeque() {
    _front = _end = null;
  }

  public void addFirst(T e) {

  }
  public T removeFirst() {
    
  }

  // returns true if the given argument is in the deque
  public boolean contains(T e);

  // adds value at end of deque represented by queue
  public void addLast(T e) {

  }

  // removes value at end of deque
  public T removeLast() {

  }

  public boolean contains(T e) {

  }

  public T peekFirst() {
    return _front.getValue();
  }

  public T peekLast() {
    return _end.getValue();
  }

  public int size(){
    return _size;
  }
}
