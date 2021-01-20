**Threads**<br>
A thread is defined at the OS level.<br>
A thread is a set of instructions.<br>
An application can be composed of many threads.<br>
Different threads can be executed at the same time.<br>
Scheduler is responsible for the CPU sharing<br>
**3 reasons for scheduler to pause a thread**<br>

- CPU should be shared equally among threads<br>
- The thread is waiting for IO<br>
- The thread might be waiting for another thread to do something.<br>

Race condition - Accessing data concurrently.<br>
two different threads are trying to read and write the same variable at the same time.<br>
Synchronization prevents a block of code to be exexuted by more than one thread at one time.<br>
A synchronized static method uses the class as a synchronization object.<br>
A synchronized non-static method uses the instance as a synchronized object.<br>
Locks are reentrant: When a thread holds a lock, it can enter a block synchronized on the lock it is holding.<br>
Deadlock: A dealock is a situation when a thread T1 holds a key needed by a thread T2 and T2 holds the key needed by T1.<br>
Stopping a thread: Interrupt a thread<br>
Wait and Notify can be called inside a synchronized block.<br>
wait() - releases the lock and is in WAIT state.<br>
notify()/notifyAll() - release a Thread in WAIT state and puts in RUNNABLE state.<br>
NEW -> RUNNABLE -> TERMINATED
BLOCKED (synchronized lock)
WAITING (Parked in the wait lsit)
TIMED WAITING <br>
state of the thread -> _t.getState()_<br>
A variable is said to be visible if the writes made on it are made visible.<br>
All synchronized writes are are visible. <br>
A **Happens-before** link exist between all synchronized or volatile write operation and all synchornized or volatile read operation.<br>
Visibility: Means "a read should return the value set by **last** write" <br>
**Synchronization: Guarantees the exclusive execution of a block of code.** <br>
**Visibility: Guarantees the consistency of the variables.**
**Atomicity:** Synchronization will not be interrupted in between read and write.<br>
**How to write current concurrent code**<br>
- Check for race conidtions
- Check for happens before link
  - Are the read/write volatile?
  - Are they synchronized?
- Synchronized or Volatile.
    - Synchronized = atomicity
    - Volatility = visibility
scnscns
    
        

    

