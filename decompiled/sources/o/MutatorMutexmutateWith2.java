package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MutatorMutexmutateWith2 implements Collection {
    public final /* synthetic */ ImageKt read;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.read.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.read.write(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.read.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new MutatorMutexmutate2(this.read);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ImageKt imageKt = this.read;
        int iWrite = imageKt.write(obj);
        if (iWrite < 0) {
            return false;
        }
        imageKt.RemoteActionCompatParcelizer(iWrite);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        ImageKt imageKt = this.read;
        int i = imageKt.MediaMetadataCompat;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(imageKt.write(i2))) {
                imageKt.RemoteActionCompatParcelizer(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        ImageKt imageKt = this.read;
        int i = imageKt.MediaMetadataCompat;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(imageKt.write(i2))) {
                imageKt.RemoteActionCompatParcelizer(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.read.MediaMetadataCompat;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ImageKt imageKt = this.read;
        int i = imageKt.MediaMetadataCompat;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = imageKt.write(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public MutatorMutexmutateWith2(ImageKt imageKt) {
        this.read = imageKt;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ImageKt imageKt = this.read;
        int i = imageKt.MediaMetadataCompat;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = imageKt.write(i2);
        }
        return objArr;
    }
}
