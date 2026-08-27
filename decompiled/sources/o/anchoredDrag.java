package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class anchoredDrag implements List, displayInAppMessagelambda12 {
    public final ContentInViewNode write;

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.write.IconCompatParcelizer();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.write.RemoteActionCompatParcelizer(obj) >= 0;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.write.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.write.write();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        ContentInViewNode contentInViewNode = this.write;
        Object[] objArr = contentInViewNode.read;
        int i = contentInViewNode.IconCompatParcelizer;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.write.IconCompatParcelizer;
    }

    public anchoredDrag(ContentInViewNode contentInViewNode) {
        this.write = contentInViewNode;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.write.RemoteActionCompatParcelizer(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DefaultFlingBehaviorperformFling2.read(i, this);
        return this.write.RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        DefaultFlingBehaviorperformFling2.read(i, this);
        return this.write.write(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        ContentInViewNode contentInViewNode = this.write;
        int i = contentInViewNode.IconCompatParcelizer;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            contentInViewNode.write(it.next());
        }
        return i != contentInViewNode.IconCompatParcelizer;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        ContentInViewNode contentInViewNode = this.write;
        int i = contentInViewNode.IconCompatParcelizer;
        Object[] objArr = contentInViewNode.read;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                contentInViewNode.write(i2);
            }
        }
        return i != contentInViewNode.IconCompatParcelizer;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        DefaultFlingBehaviorperformFling2.read(i, this);
        return this.write.read(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ContentInViewNode contentInViewNode = this.write;
        if (i < 0 || i > (i2 = contentInViewNode.IconCompatParcelizer)) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Index ", " must be in 0..");
            sbM.append(contentInViewNode.IconCompatParcelizer);
            ForEachGestureKt.serializer(sbM.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = contentInViewNode.read;
        if (objArr.length < i3) {
            contentInViewNode.RemoteActionCompatParcelizer(i3, objArr);
        }
        Object[] objArr2 = contentInViewNode.read;
        int i4 = contentInViewNode.IconCompatParcelizer;
        if (i != i4) {
            onContentCardClicked.write(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        contentInViewNode.IconCompatParcelizer++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        ContentInViewNode contentInViewNode = this.write;
        if (i < 0 || i > contentInViewNode.IconCompatParcelizer) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Index ", " must be in 0..");
            sbM.append(contentInViewNode.IconCompatParcelizer);
            ForEachGestureKt.serializer(sbM.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + contentInViewNode.IconCompatParcelizer;
        Object[] objArr = contentInViewNode.read;
        if (objArr.length < size) {
            contentInViewNode.RemoteActionCompatParcelizer(size, objArr);
        }
        Object[] objArr2 = contentInViewNode.read;
        if (i != contentInViewNode.IconCompatParcelizer) {
            onContentCardClicked.write(collection.size() + i, i, contentInViewNode.IconCompatParcelizer, objArr2, objArr2);
        }
        for (Object obj : collection) {
            if (i2 < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2++;
        }
        contentInViewNode.IconCompatParcelizer = collection.size() + contentInViewNode.IconCompatParcelizer;
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnchoredDraggableNodefling2(this, 0, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new AnchoredDraggableNodefling2(this, 0, 0);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        DefaultFlingBehaviorperformFling2.RemoteActionCompatParcelizer(this, i, i2);
        return new AnchoredDraggableNodedrag2(this, i, i2, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new AnchoredDraggableNodefling2(this, i, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.write.write(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.write.read(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        ContentInViewNode contentInViewNode = this.write;
        int i = contentInViewNode.IconCompatParcelizer;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            contentInViewNode.read(it.next());
        }
        return i != contentInViewNode.IconCompatParcelizer;
    }
}
