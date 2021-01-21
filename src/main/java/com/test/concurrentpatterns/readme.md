**Executor Pattern**<br>
A pool of thread is an instance of executor thread<br>
ExecutorService extends Executor<br>
Executors - Factory class to create instances of Executor and ExecutorService<br>
Single Thread Executor <br>
Fixed Pool Executor<br>
newCachedThreadPool - creates thread on demand, keeps unused threads for 60s, then terminates them.<br>
newScheduledThreadPool(poolSize) - creates a pool of threads, returns a ScheduledExecutorService.<br>
A task is added to the waiting queue when no thread is available.<br>
The task is executed in order of their submission.<br>
executorService.execute(task).<br>
executorService.submit(callable).<br>
shutdown
-continue to execute all submitted tasks
-execute waiting tasks
-do not accept new task
-then shutdown
Reentrant locks offer (exclusion, read & write ordering)<br>
lockInterruptibly - The thread will wait until it can enter the guarded block of code, but another thread 
can interrupt by callinf its interrupt method.<br>
TimedLockAcquisition -  lock.tryLock() will return false when a thread is already executing the guarded block of code.<br>
Fair lock acquisition - The fist one to enter the guarded block of code is chosen in order. - RenetrantLock(true), Expensive<br>
It can be blocked for a certain period of time. <br>
Producer and consumer pattern can be implemented using Condition cond = lock.newCondition(); cond.await() & cond.signal(). <br>
Lock 1..n Condition<br>
await() is blocking and can be interrupted. A fair lock will create fair condition.<br>
Lock and Condition - Interruptable, time out and fairness. <br>
ReadWriteLock _.readLock()_ _.writeLock()_ <br>
Only one thread can hold the write lock. When the write lock is held, no one can hold read lock. As many thread needed
can hold the read lock.
`ReadWriteEntrant readWriteLock = new ReentrantReadWriteLock()
Lock readLock = readWriteLock.readLock()
Lock writeLock = readWriteLock.writeLock()
`<br>
Semaphores - It allows more than one threads in a block of code.<br>
`Semaphore semaphore = new Semaphore(); semaphore.acquire(); semaphore.release();semaphore.acquireInterruptibility()`<br>
**CASing** <br> works well when concurrency is not high.<br>
Works with 3 param - address, existing value, new value
current value = expected value at the address then replace with new value and returm true else false<br>
All in a single, atomic assembly instruction.<br>
AtomicBoolean, AtomicInteger, AtomicLong, AtomicRefernce<V>.<br>
Adders and Accumaltors. LongAdder, LongAccumulator.<br>
Collections: Queue, Blocking queue<br>
Map: ConcurrentMap<br>




