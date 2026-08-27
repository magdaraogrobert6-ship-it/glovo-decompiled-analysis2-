package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableNodedrag2 implements List, displayInAppMessagelambda12 {
    public int IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final int serializer;
    public final List write;

    public /* synthetic */ AnchoredDraggableNodedrag2(List list, int i, int i2, int i3) {
        this.read = i3;
        this.write = list;
        this.serializer = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.read;
        int i3 = this.serializer;
        List list = this.write;
        if (i2 != 0) {
            list.add(i + i3, obj);
            this.IconCompatParcelizer++;
        } else {
            list.add(i + i3, obj);
            this.IconCompatParcelizer++;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.read;
        List list = this.write;
        int i2 = this.serializer;
        if (i != 0) {
            int i3 = this.IconCompatParcelizer - 1;
            if (i2 <= i3) {
                while (true) {
                    list.remove(i3);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3--;
                    }
                }
            }
            this.IconCompatParcelizer = i2;
            return;
        }
        int i4 = this.IconCompatParcelizer - 1;
        if (i2 <= i4) {
            while (true) {
                list.remove(i4);
                if (i4 == i2) {
                    break;
                } else {
                    i4--;
                }
            }
        }
        this.IconCompatParcelizer = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.read;
        int i3 = this.serializer;
        List list = this.write;
        if (i2 != 0) {
            r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.write(i, this);
            return list.get(i + i3);
        }
        DefaultFlingBehaviorperformFling2.read(i, this);
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.read;
        List list = this.write;
        int i2 = this.serializer;
        if (i != 0) {
            int i3 = this.IconCompatParcelizer - 1;
            if (i2 > i3) {
                return -1;
            }
            while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(i3), obj}, getCieXyz.write())).booleanValue()) {
                if (i3 == i2) {
                    return -1;
                }
                i3--;
            }
            return i3 - i2;
        }
        int i4 = this.IconCompatParcelizer - 1;
        if (i2 > i4) {
            return -1;
        }
        while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(i4), obj}, getCieXyz.write())).booleanValue()) {
            if (i4 == i2) {
                return -1;
            }
            i4--;
        }
        return i4 - i2;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.read;
        int i3 = this.serializer;
        List list = this.write;
        if (i2 != 0) {
            r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.write(i, this);
            return list.set(i + i3, obj);
        }
        DefaultFlingBehaviorperformFling2.read(i, this);
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.read;
        List list = this.write;
        int i2 = this.serializer;
        if (i != 0) {
            int i3 = this.IconCompatParcelizer;
            while (i2 < i3) {
                Object[] objArr = {list.get(i2), obj};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                i2++;
            }
            return false;
        }
        int i4 = this.IconCompatParcelizer;
        while (i2 < i4) {
            Object[] objArr2 = {list.get(i2), obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.read;
        List list = this.write;
        int i2 = this.serializer;
        if (i != 0) {
            int i3 = this.IconCompatParcelizer;
            for (int i4 = i2; i4 < i3; i4++) {
                Object[] objArr = {list.get(i4), obj};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return i4 - i2;
                }
            }
            return -1;
        }
        int i5 = this.IconCompatParcelizer;
        for (int i6 = i2; i6 < i5; i6++) {
            Object[] objArr2 = {list.get(i6), obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return i6 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.read;
        int i2 = this.serializer;
        List list = this.write;
        if (i != 0) {
            int i3 = this.IconCompatParcelizer;
            while (i2 < i3) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(i2), obj}, getCieXyz.write())).booleanValue()) {
                    list.remove(i2);
                    this.IconCompatParcelizer--;
                    return true;
                }
                i2++;
            }
            return false;
        }
        int i4 = this.IconCompatParcelizer;
        while (i2 < i4) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(i2), obj}, getCieXyz.write())).booleanValue()) {
                list.remove(i2);
                this.IconCompatParcelizer--;
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.read;
        int i2 = this.serializer;
        List list = this.write;
        if (i != 0) {
            int i3 = this.IconCompatParcelizer;
            int i4 = i3 - 1;
            if (i2 <= i4) {
                while (true) {
                    if (!collection.contains(list.get(i4))) {
                        list.remove(i4);
                        this.IconCompatParcelizer--;
                    }
                    if (i4 == i2) {
                        break;
                    }
                    i4--;
                }
            }
            return i3 != this.IconCompatParcelizer;
        }
        collection.getClass();
        int i5 = this.IconCompatParcelizer;
        int i6 = i5 - 1;
        if (i2 <= i6) {
            while (true) {
                if (!collection.contains(list.get(i6))) {
                    list.remove(i6);
                    this.IconCompatParcelizer--;
                }
                if (i6 == i2) {
                    break;
                }
                i6--;
            }
        }
        return i5 != this.IconCompatParcelizer;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.read;
        int i3 = this.serializer;
        List list = this.write;
        if (i2 != 0) {
            list.addAll(i + i3, collection);
            int size = collection.size();
            this.IconCompatParcelizer += size;
            return size > 0;
        }
        collection.getClass();
        list.addAll(i + i3, collection);
        this.IconCompatParcelizer = collection.size() + this.IconCompatParcelizer;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.read != 0) {
            return this.IconCompatParcelizer == this.serializer;
        }
        return this.IconCompatParcelizer == this.serializer;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        if (this.read != 0) {
            i = this.IconCompatParcelizer;
            i2 = this.serializer;
        } else {
            i = this.IconCompatParcelizer;
            i2 = this.serializer;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (this.read != 0) {
            r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.IconCompatParcelizer(this, i, i2);
            return new AnchoredDraggableNodedrag2(this, i, i2, 1);
        }
        DefaultFlingBehaviorperformFling2.RemoteActionCompatParcelizer(this, i, i2);
        return new AnchoredDraggableNodedrag2(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (this.read != 0) {
            return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
        }
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (this.read != 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }
        collection.getClass();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (this.read != 0) {
            int i = this.IconCompatParcelizer;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.IconCompatParcelizer;
        }
        collection.getClass();
        int i2 = this.IconCompatParcelizer;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
        return i2 != this.IconCompatParcelizer;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.read != 0 ? new AnchoredDraggableNodefling2(this, 0, 1) : new AnchoredDraggableNodefling2(this, 0, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.read != 0 ? new AnchoredDraggableNodefling2(this, 0, 1) : new AnchoredDraggableNodefling2(this, 0, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        if (this.read != 0) {
            return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
        }
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        if (this.read != 0) {
            return new AnchoredDraggableNodefling2(this, i, 1);
        }
        return new AnchoredDraggableNodefling2(this, i, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.read;
        List list = this.write;
        if (i != 0) {
            int i2 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i2 + 1;
            list.add(i2, obj);
            return true;
        }
        int i3 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i3 + 1;
        list.add(i3, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.read;
        List list = this.write;
        if (i != 0) {
            list.addAll(this.IconCompatParcelizer, collection);
            int size = collection.size();
            this.IconCompatParcelizer += size;
            return size > 0;
        }
        collection.getClass();
        list.addAll(this.IconCompatParcelizer, collection);
        this.IconCompatParcelizer = collection.size() + this.IconCompatParcelizer;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.read;
        int i3 = this.serializer;
        List list = this.write;
        if (i2 != 0) {
            r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.write(i, this);
            Object objRemove = list.remove(i + i3);
            this.IconCompatParcelizer--;
            return objRemove;
        }
        DefaultFlingBehaviorperformFling2.read(i, this);
        Object objRemove2 = list.remove(i + i3);
        this.IconCompatParcelizer--;
        return objRemove2;
    }
}
