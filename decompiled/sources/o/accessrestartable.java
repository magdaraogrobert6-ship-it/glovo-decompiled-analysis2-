package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class accessrestartable implements Map, displayInAppMessagelambda121 {
    public ContextMenuItem IconCompatParcelizer;
    public accessprocessDragCancel read;
    public ContextMenuItem serializer;
    public final DefaultScrollableState write;

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.write.read(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.write.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.write.MediaBrowserCompatMediaItem(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.write.read();
    }

    @Override // java.util.Map
    public final int size() {
        return this.write.serializer;
    }

    public final String toString() {
        return this.write.toString();
    }

    public accessrestartable(DefaultScrollableState defaultScrollableState) {
        defaultScrollableState.getClass();
        this.write = defaultScrollableState;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ContextMenuItem contextMenuItem = this.IconCompatParcelizer;
        if (contextMenuItem != null) {
            return contextMenuItem;
        }
        ContextMenuItem contextMenuItem2 = new ContextMenuItem(this.write, 1);
        this.IconCompatParcelizer = contextMenuItem2;
        return contextMenuItem2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ContextMenuItem contextMenuItem = this.serializer;
        if (contextMenuItem != null) {
            return contextMenuItem;
        }
        ContextMenuItem contextMenuItem2 = new ContextMenuItem(this.write, 0);
        this.serializer = contextMenuItem2;
        return contextMenuItem2;
    }

    @Override // java.util.Map
    public final Collection values() {
        accessprocessDragCancel accessprocessdragcancel = this.read;
        if (accessprocessdragcancel != null) {
            return accessprocessdragcancel;
        }
        accessprocessDragCancel accessprocessdragcancel2 = new accessprocessDragCancel(this.write);
        this.read = accessprocessdragcancel2;
        return accessprocessdragcancel2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accessrestartable.class != obj.getClass()) {
            return false;
        }
        Object[] objArr = {this.write, ((accessrestartable) obj).write};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
