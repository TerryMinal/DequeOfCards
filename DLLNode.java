/*
Terry Guan
APCS2 pd3
HW#18a: DLLNode
2017-03-16
*/
/*****************************************************
* class DLLNode
* Implements a node, for use in lists and other container classes.
*****************************************************/

public class DLLNode<T>
{

  private T _cargo;    //cargo may only be of type String
  private DLLNode<T> _nextNode; //pointer to next DLLNode<T>
  private DLLNode<T> _beforeNode;
  // constructor -- initializes instance vars
  public DLLNode( T value, DLLNode<T> before, DLLNode<T> next )
  {
    _cargo = value;
    _nextNode = next;
    _beforeNode = before;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo() { return _cargo; }

  public DLLNode<T> getNext() { return _nextNode; }

  public DLLNode<T> getBefore() { return _beforeNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo(  T newCargo )
  {
    T oldC = _cargo;
    _cargo = newCargo;
    return oldC;
  }

  public DLLNode<T> setNext( DLLNode<T> newNext )
  {
    DLLNode<T> oldN = _nextNode;
    _nextNode = newNext;
    //sets the next nodes previous node to this
    // newNext._beforeNode = this;
    return oldN;
  }

  public DLLNode<T> setBefore( DLLNode<T> before) {
    DLLNode<T> old = _beforeNode;
    _beforeNode = before;
    //sets the previous node next node to this node
    // _beforeNode._nextNode = this;
    return old;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    DLLNode<String> first = new DLLNode<String>( "cat", null, null );

    //Create a new node after the first
    first.setNext( new DLLNode( "dog", first, null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", first.getNext(), null ) );

    //  A naive list traversal:
    while( first != null ) {
    System.out.println( first );
    first = first.getNext();
    }


  //Q: When head ptr moves to next node in list,
  //   what happens to the node it just left?
  //It has become dereferenced and is deleted.
  }//end main

}//end class DLLNode
