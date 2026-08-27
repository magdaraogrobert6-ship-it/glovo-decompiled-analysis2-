package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Image implements Set {
    public final /* synthetic */ ImageKt IconCompatParcelizer;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.IconCompatParcelizer.read(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        ImageKt imageKt = this.IconCompatParcelizer;
        int iHashCode = 0;
        for (int i = imageKt.MediaMetadataCompat - 1; i >= 0; i--) {
            Object objIconCompatParcelizer = imageKt.IconCompatParcelizer(i);
            iHashCode += objIconCompatParcelizer == null ? 0 : objIconCompatParcelizer.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new accessemitExit(this.IconCompatParcelizer);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        ImageKt imageKt = this.IconCompatParcelizer;
        int iIconCompatParcelizer = imageKt.IconCompatParcelizer(obj);
        if (iIconCompatParcelizer < 0) {
            return false;
        }
        imageKt.RemoteActionCompatParcelizer(iIconCompatParcelizer);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.IconCompatParcelizer.write(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.IconCompatParcelizer.serializer(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.IconCompatParcelizer.MediaMetadataCompat;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ImageKt imageKt = this.IconCompatParcelizer;
        int i = imageKt.MediaMetadataCompat;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = imageKt.IconCompatParcelizer(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public Image(ImageKt imageKt) {
        this.IconCompatParcelizer = imageKt;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        ImageKt imageKt = this.IconCompatParcelizer;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return imageKt.MediaMetadataCompat == set.size() && imageKt.read(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        ImageKt imageKt = this.IconCompatParcelizer;
        int i = imageKt.MediaMetadataCompat;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = imageKt.IconCompatParcelizer(i2);
        }
        return objArr;
    }
}
