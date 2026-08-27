package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManagerViewTranslationHelperMethods implements List, displayInAppMessagelambda12 {
    public final onCreateVirtualViewTranslationRequests IconCompatParcelizer;

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.IconCompatParcelizer.IconCompatParcelizer(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.IconCompatParcelizer;
        return oncreatevirtualviewtranslationrequests.read(oncreatevirtualviewtranslationrequests.read, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.write(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.IconCompatParcelizer.write(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.IconCompatParcelizer.read(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.read == 0;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.IconCompatParcelizer;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        for (int i = oncreatevirtualviewtranslationrequests.read - 1; i >= 0; i--) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, objArr[i]}, getCieXyz.write())).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.IconCompatParcelizer;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(oncreatevirtualviewtranslationrequests.write[i2])) {
                oncreatevirtualviewtranslationrequests.write(i2);
            }
        }
        return i != oncreatevirtualviewtranslationrequests.read;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.IconCompatParcelizer.read;
    }

    public AndroidContentCaptureManagerViewTranslationHelperMethods(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
        this.IconCompatParcelizer = oncreatevirtualviewtranslationrequests;
    }

    @Override // java.util.List
    public final Object get(int i) {
        r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.write(i, this);
        return this.IconCompatParcelizer.write[i];
    }

    @Override // java.util.List
    public final Object remove(int i) {
        r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.write(i, this);
        return this.IconCompatParcelizer.write(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.write(i, this);
        return this.IconCompatParcelizer.write(i, obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnchoredDraggableNodefling2(this, 0, 1);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new AnchoredDraggableNodefling2(this, 0, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk.IconCompatParcelizer(this, i, i2);
        return new AnchoredDraggableNodedrag2(this, i, i2, 1);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.IconCompatParcelizer.read(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.IconCompatParcelizer;
        int i = oncreatevirtualviewtranslationrequests.read;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer(it.next());
        }
        return i != oncreatevirtualviewtranslationrequests.read;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new AnchoredDraggableNodefling2(this, i, 1);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.IconCompatParcelizer.read(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }
}
