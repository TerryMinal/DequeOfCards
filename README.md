# DequeOfCards
Team DequeOfCards -- Fabiola Radosav, Terry Guan, Max Korsun

# Interface/Method Selections
addFirst(T e) - Neccesary to add Objects to the front of the queue.

addLast(T e) - Neccesary to add Objects to the back of the queue.

removeFirst() - Neccesary to remove Objects from the front of the queue.

removeLast() - Neccesary to remove Objects from the back of the queue.

peekFirst() - Adds convenience to see whats first.

peekLast() - Adds convenience to see whats last.

contains(T e) - not needed, but simple enough to implement and adds convenience.

size() - Allows you to see the current length of the Deque.

## Reasoning for Method Selections
addFirst, addLast, removeFirst, removeLast, peekFirst, peekLast are standard methods for a deque and
are usually used for unlimited capacity deques. It was fitting to follow the standard and use those
method signatures. Contain was more for convenience; it is useful to perform a search of whether an
element exists in a deque or not. Size was also made for convenience sake. Size is relatively easy
to keep track and is useful information.

## Reasoning for Choosing Doubly Linked Nodes
Doubly linked nodes offer the most mutability with its ability to easily remove and add elements to
the front and end. Adding is just a simple adding of a new object with some data to the front or end
and declaring that the front or end with a reference variable. There is no need to fidget around with the
most of the data in between the front and end; they are only needed the linked nodes are in need of changing
their reference to them, removing their reference, changing the middle's data, etc. As a result of the
convenience of doubly linked nodes, the run time of each of the methods are constant (except contains which
performs a linear search).   
