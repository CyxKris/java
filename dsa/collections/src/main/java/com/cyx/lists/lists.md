# LISTS
> #### Lists are collections that maintain their elements in order and can contain ***duplicates***.
---

- The elements is a list are ordered.
- Each element is position based, starting from index 0.

## List Methods
---

- `<T> get(int index)`
- `<T> set(int index, <T> element)`
- `void add(int index, <T> element)`
- `boolean add(int index, Collection<? extends T> c)`
- `<T> remove(int index)`

## Implementations of List
> The three implementations of the `List` interface are provided in the `java.util` package.
---

- ### `ArrayList`
  > :mag_right:
  > `ArrayList` is a ==dynamic array==.
  > ==To be used when we don't know the size of the array==.

  #### How it works :fire:
  :o: Internally, it uses a normal array, set to some default capacity.
  :o: When that capacity is reached, it creates a new array of bigger size (+50% of its original capacity) and copies all the elements from the original array to the new array.
  :o: New array's reference for its internal usage (the new array becomes its default).
  :o: As the old array is no longer in use, it will be garbage collected in the next garbage collection.


- ### `LinkedList`
  > :mag_right:
  > The `LinkedList` implementation uses a doubly-linked list.
  > ==Insertions and deletions in a doubly-linked list are very efficient.==


- ### `Vector`
  > :mag_right:
  > The `Vector` class is a ==legacy class== which implements the `List` interface.
  #### How it works :fire:
  :o: The `Vector` and `ArrayList` classes are implemented using ==dynamically resizable arrays==, providing ==fast random access== (i.e: position-based access) and ==fast list traversal== - very much like using an ordinary array.
  :o: Unlike the `ArrayList` class, the `Vector` class is ==thread-safe==, meaning that concurrent calls to the vector will not compromise its integrity.
  :o: The `ArrayList` and `Vector` classes offer comparable performance, but vectors suffer a slight performance penalty due to synchronization.

  ---
  ## `ArrayList` vs `LinkedList`
  |  `ArrayList`  |  `LinkedList`  |
  |---|---|
  |  Position-based access has constant-time performance for the `ArrayList` and `Vector` classes.  |  Position-based access is in linear time for a `LinkedList` owing to traversal in a doubly-linked list.  |
  |  Overall, the `ArrayList` implementation is the best choice for implementing lists.  |  When frequent insertions and deletions occur inside a list, a `LinkedList` can be worth considering.  |
  |   |  ==In addition to the `List` interface, the `LinkedList` class also implements `Deque` interface that allows it to be used for stacks and different kinds of queues.==  |
