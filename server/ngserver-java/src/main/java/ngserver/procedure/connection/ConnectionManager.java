package ngserver.procedure.connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConnectionManager<T> {
    final Map<String, ConnectionState<T>> connectionMap = new HashMap<String, ConnectionState<T>>();
    final ReentrantReadWriteLock connectionLock = new ReentrantReadWriteLock();
    final Lock connectionReadLock = connectionLock.readLock();
    final Lock connectionWriteLock = connectionLock.writeLock();

    public void addOrReplace(String id, ConnectionState<T> state) {
        connectionWriteLock.lock();
        try {
            if (!connectionMap.containsKey(id)) {
                connectionMap.put(id, state);
            }
            else {
                connectionMap.replace(id, state);
            }
        }
        finally {
            connectionWriteLock.unlock();
        }
    }

    public void remove(String id) {
        connectionWriteLock.lock();
        try {
            connectionMap.remove(id);
        }
        finally {
            connectionWriteLock.unlock();
        }
    }

    public ConnectionState<T> get(String id) {
        connectionReadLock.lock();
        try {
            return connectionMap.get(id);
        }
        finally {
            connectionReadLock.unlock();
        }
    }

    public List<ConnectionState<T>> getAll() {
        connectionReadLock.lock();
        try {
            return connectionMap.values().stream().toList();
        }
        finally {
            connectionReadLock.unlock();
        }
    }

    public List<ConnectionState<T>> getAllExcept(String id) {
        var result = new ArrayList<ConnectionState<T>>();
        connectionReadLock.lock();
        try {
            connectionMap.forEach((var key, var value) -> {
                if (!key.equals(id)) {
                    result.add(value);
                }
            });
            return result;
        }
        finally {
            connectionReadLock.unlock();
        }
    }
}
