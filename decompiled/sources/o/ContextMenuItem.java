package o;

import androidx.collection.Keys$iterator$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuItem implements Set, displayInAppMessagelambda121 {
    public final /* synthetic */ int serializer;
    public final DefaultScrollableState write;

    public ContextMenuItem(DefaultScrollableState defaultScrollableState, int i) {
        this.serializer = i;
        defaultScrollableState.getClass();
        if (i != 1) {
            this.write = defaultScrollableState;
        } else {
            this.write = defaultScrollableState;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        if (this.serializer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (this.serializer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.serializer == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.serializer;
        DefaultScrollableState defaultScrollableState = this.write;
        if (i == 0) {
            return defaultScrollableState.read(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object[] objArr = {defaultScrollableState.MediaBrowserCompatMediaItem(entry.getKey()), entry.getValue()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (this.serializer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (this.serializer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        if (this.serializer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.serializer;
        DefaultScrollableState defaultScrollableState = this.write;
        collection.getClass();
        if (i == 0) {
            Collection collection2 = collection;
            if (collection2.isEmpty()) {
                return true;
            }
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (!defaultScrollableState.read(it.next())) {
                    return false;
                }
            }
            return true;
        }
        Collection<Map.Entry> collection3 = collection;
        if (collection3.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection3) {
            Object[] objArr = {defaultScrollableState.MediaBrowserCompatMediaItem(entry.getKey()), entry.getValue()};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.serializer != 0 ? this.write.read() : this.write.read();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.serializer != 0 ? this.write.serializer : this.write.serializer;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (this.serializer != 0) {
            objArr.getClass();
            return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
        }
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ShortNewsContentCardView shortNewsContentCardView = null;
        return this.serializer != 0 ? LazyKt__LazyJVMKt.read(new Keys$iterator$1(this, shortNewsContentCardView, 1)) : LazyKt__LazyJVMKt.read(new Keys$iterator$1(this, shortNewsContentCardView, 0));
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        if (this.serializer != 0) {
            return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
        }
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}
