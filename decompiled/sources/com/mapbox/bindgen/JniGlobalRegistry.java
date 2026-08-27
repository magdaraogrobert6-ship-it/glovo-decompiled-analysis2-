package com.mapbox.bindgen;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
class JniGlobalRegistry {
    private static final ConcurrentHashMap<Long, ObjectReferences> registry = new ConcurrentHashMap<>();

    public static native void activate();

    public static native void deactivate();

    private static int newReference(long j, Object obj) {
        ObjectReferences objectReferences = new ObjectReferences(obj);
        while (true) {
            ConcurrentHashMap<Long, ObjectReferences> concurrentHashMap = registry;
            ObjectReferences objectReferencesPutIfAbsent = concurrentHashMap.putIfAbsent(Long.valueOf(j), objectReferences);
            if (objectReferencesPutIfAbsent == null) {
                return 0;
            }
            synchronized (objectReferencesPutIfAbsent) {
                if (concurrentHashMap.get(Long.valueOf(j)) == objectReferencesPutIfAbsent) {
                    return objectReferencesPutIfAbsent.addAdditional(obj);
                }
            }
        }
    }

    public static int newStrongReference(long j, Object obj) {
        if (obj != null) {
            return newReference(j, obj);
        }
        return -1;
    }

    public static int size() {
        return registry.size();
    }

    public static int newWeakReference(long j, Object obj) {
        if (obj != null) {
            return newReference(j, new WeakReference(obj));
        }
        return -1;
    }

    public static void delete(long j, int i) {
        ConcurrentHashMap<Long, ObjectReferences> concurrentHashMap = registry;
        ObjectReferences objectReferences = concurrentHashMap.get(Long.valueOf(j));
        if (objectReferences != null && objectReferences.delete(i) <= 0) {
            synchronized (objectReferences) {
                if (objectReferences.getReferenceCount() == 0) {
                    concurrentHashMap.remove(Long.valueOf(j), objectReferences);
                }
            }
        }
    }

    public static Object get(long j, int i) {
        ObjectReferences objectReferences = registry.get(Long.valueOf(j));
        if (objectReferences == null) {
            return null;
        }
        Object obj = objectReferences.get(i);
        return obj instanceof WeakReference ? ((WeakReference) obj).get() : obj;
    }
}
