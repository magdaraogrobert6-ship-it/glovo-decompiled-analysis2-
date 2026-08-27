package o;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class forEachImmediateDelegateui extends getDelegateui implements Serializable {
    public final ArrayDeque read;
    public final int write;

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // o.delegate
    public final Object read() {
        return this.read;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        obj.getClass();
        int i = this.write;
        if (i == 0) {
            return true;
        }
        int size = size();
        ArrayDeque arrayDeque = this.read;
        if (size == i) {
            arrayDeque.remove();
        }
        arrayDeque.add(obj);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.write;
        boolean z = false;
        if (size < i) {
            Iterator it = collection.iterator();
            it.getClass();
            while (it.hasNext()) {
                add(it.next());
                z = true;
            }
            return z;
        }
        clear();
        int i2 = size - i;
        TextStreamsKt.read("number to skip cannot be negative", i2 >= 0);
        Iterable safemapoforiginaldepth = new safeMapOfOriginalDepth(i2, collection);
        if (safemapoforiginaldepth instanceof Collection) {
            return addAll((Collection) safemapoforiginaldepth);
        }
        Iterator it2 = safemapoforiginaldepth.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            add(it2.next());
            z = true;
        }
        return z;
    }

    public forEachImmediateDelegateui(int i) {
        TextStreamsKt.serializer("maxSize (%s) must >= 0", i, i >= 0);
        this.read = new ArrayDeque(i);
        this.write = i;
    }
}
