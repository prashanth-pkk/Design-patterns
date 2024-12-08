package org.pk.singletondesignpattern;

/*In a multi-threaded environment, you need to ensure that only one instance is created.
The lazy initialization approach can be problematic in multi-threaded environments.
To solve this, we use synchronization.*/
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
