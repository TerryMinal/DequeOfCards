public class DLNDeque<T> implements Deque<T> {
    
    private LLNode<T> _front;
    private LLNode<T> _end;
    public int _size;

    public DLNDeque(){
	_front = _end = null;
    }

    public boolean contains(T e){
	
    }

    public T peekFirst(){
	return _front.getValue();
    }

    public T peekLast(){
	return _end.getValue();
    }

    public int size(){
	return _size;
    }
}
