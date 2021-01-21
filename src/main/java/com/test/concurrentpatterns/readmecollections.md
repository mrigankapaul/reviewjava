Copy on Write - list and set <br>
No locking for read operations. Write operation creates a new structure and replaces the existing one.<br>
The threads that has references to previous array will not see the modifications.<br>
CopyOnWriteArrayList, CopyOnWriteSet - works well with many reads. Use case: Application Initialization<br>
Queues and Stacks - Queue and Dequeue - ArrayBlockingQueue, ConcurrentLinkedListQueue<br>
Queue(FIFO), Stack(Stack) - Dequeue<br>
ConcurrentMap defines atomic operations other than being thread safe<br>
ConcurrentHashMap - Built on a set of synchronized segments. Number of segment - 16-64k. This is # of threads that can use this map.<br>
