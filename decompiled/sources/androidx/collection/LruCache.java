package androidx.collection;

import java.util.Map;
import java.util.Set;
import o.DraggableNode;
import o.FlingCancellationException;
import o.ForEachGestureKt;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
public class LruCache {
    public final FlingCancellationException IconCompatParcelizer;
    public int MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public final int read;
    public final DraggableNode serializer;
    public int write;

    public Object create(Object obj) {
        obj.getClass();
        return null;
    }

    public final String toString() {
        String str;
        synchronized (this.IconCompatParcelizer) {
            int i = this.RemoteActionCompatParcelizer;
            int i2 = this.write + i;
            str = "LruCache[maxSize=" + this.read + ",hits=" + this.RemoteActionCompatParcelizer + ",misses=" + this.write + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public final void trimToSize(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.IconCompatParcelizer) {
                if (this.MediaMetadataCompat < 0 || (this.serializer.serializer.isEmpty() && this.MediaMetadataCompat != 0)) {
                    break;
                }
                if (this.MediaMetadataCompat > i && !this.serializer.serializer.isEmpty()) {
                    Set setEntrySet = this.serializer.serializer.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) onContentCardDismissed.serializer((Iterable) setEntrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    DraggableNode draggableNode = this.serializer;
                    draggableNode.getClass();
                    key.getClass();
                    draggableNode.serializer.remove(key);
                    this.MediaMetadataCompat -= safeSizeOf(key, value);
                }
                return;
            }
            entryRemoved(key, value, null);
        }
        ForEachGestureKt.write("LruCache.sizeOf() is reporting inconsistent results!");
        throw null;
    }

    public LruCache(int i) {
        this.read = i;
        if (i <= 0) {
            ForEachGestureKt.IconCompatParcelizer("maxSize <= 0");
            throw null;
        }
        this.serializer = new DraggableNode(0);
        this.IconCompatParcelizer = new FlingCancellationException(0);
    }

    public void entryRemoved(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object get(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.IconCompatParcelizer) {
            DraggableNode draggableNode = this.serializer;
            draggableNode.getClass();
            Object obj2 = draggableNode.serializer.get(obj);
            if (obj2 != null) {
                this.RemoteActionCompatParcelizer++;
                return obj2;
            }
            this.write++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.IconCompatParcelizer) {
                DraggableNode draggableNode2 = this.serializer;
                draggableNode2.getClass();
                objPut = draggableNode2.serializer.put(obj, objCreate);
                if (objPut != null) {
                    DraggableNode draggableNode3 = this.serializer;
                    draggableNode3.getClass();
                    draggableNode3.serializer.put(obj, objPut);
                } else {
                    this.MediaMetadataCompat += safeSizeOf(obj, objCreate);
                }
            }
            if (objPut != null) {
                entryRemoved(obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.read);
            return objCreate;
        }
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.IconCompatParcelizer) {
            this.MediaMetadataCompat += safeSizeOf(obj, obj2);
            DraggableNode draggableNode = this.serializer;
            draggableNode.getClass();
            objPut = draggableNode.serializer.put(obj, obj2);
            if (objPut != null) {
                this.MediaMetadataCompat -= safeSizeOf(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(obj, objPut, obj2);
        }
        trimToSize(this.read);
        return objPut;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.IconCompatParcelizer) {
            DraggableNode draggableNode = this.serializer;
            draggableNode.getClass();
            objRemove = draggableNode.serializer.remove(obj);
            if (objRemove != null) {
                this.MediaMetadataCompat -= safeSizeOf(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(obj, objRemove, null);
        }
        return objRemove;
    }

    public int sizeOf(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    public final int safeSizeOf(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        ForEachGestureKt.write("Negative size: " + obj + '=' + obj2);
        throw null;
    }
}
