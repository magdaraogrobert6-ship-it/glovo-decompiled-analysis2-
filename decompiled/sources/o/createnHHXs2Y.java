package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class createnHHXs2Y implements Collection, Set, displayInAppMessagelambda11 {
    public int[] read = DragGestureNodestartListeningForEvents1.serializer;
    public Object[] serializer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
    public int write;

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.write <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.write;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.read;
        int i = this.write;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new accessemitExit(this);
    }

    public final Object write(int i) {
        int i2 = this.write;
        Object[] objArr = this.serializer;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.read;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                onContentCardClicked.IconCompatParcelizer(iArr, i, iArr, i4, i2);
                Object[] objArr2 = this.serializer;
                onContentCardClicked.write(i, i4, i2, objArr2, objArr2);
            }
            this.serializer[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.read = iArr2;
            this.serializer = new Object[i5];
            if (i > 0) {
                onContentCardClicked.read(iArr, 0, iArr2, i, 6);
                onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, this.serializer);
            }
            if (i < i3) {
                int i6 = i + 1;
                onContentCardClicked.IconCompatParcelizer(iArr, i, this.read, i6, i2);
                onContentCardClicked.write(i, i6, i2, objArr, this.serializer);
            }
        }
        if (i2 == this.write) {
            this.write = i3;
            return obj;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
        return null;
    }

    public createnHHXs2Y(int i) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.write;
        int i = this.write;
        int[] iArr = this.read;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.serializer;
            int[] iArr2 = new int[size];
            this.read = iArr2;
            this.serializer = new Object[size];
            if (i > 0) {
                onContentCardClicked.read(iArr, 0, iArr2, i, 6);
                onContentCardClicked.IconCompatParcelizer(0, this.write, 6, objArr, this.serializer);
            }
        }
        if (this.write != i) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.write - 1; -1 < i; i--) {
            if (!onContentCardDismissed.write(collection, this.serializer[i])) {
                write(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        Object[] objArrSerializer = scroll.serializer(this.write, objArr);
        onContentCardClicked.write(0, 0, this.write, this.serializer, objArrSerializer);
        return objArrSerializer;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.write != 0) {
            this.read = DragGestureNodestartListeningForEvents1.serializer;
            this.serializer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
            this.write = 0;
        }
        if (this.write == 0) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (obj == null) {
            i = androidx.sqlite.SQLite.read(this, (Object) null, 0);
        } else {
            i = androidx.sqlite.SQLite.read(this, obj, obj.hashCode());
        }
        return i >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.write != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.write;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.serializer[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        if (obj == null) {
            i = androidx.sqlite.SQLite.read(this, (Object) null, 0);
        } else {
            i = androidx.sqlite.SQLite.read(this, obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        write(i);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.write;
        if (obj == null) {
            i2 = androidx.sqlite.SQLite.read(this, (Object) null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            i2 = androidx.sqlite.SQLite.read(this, obj, iHashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        int[] iArr = this.read;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.serializer;
            int[] iArr2 = new int[i5];
            this.read = iArr2;
            this.serializer = new Object[i5];
            if (i3 != this.write) {
                PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
                return false;
            }
            if (i5 != 0) {
                onContentCardClicked.read(iArr, 0, iArr2, iArr.length, 6);
                onContentCardClicked.IconCompatParcelizer(0, objArr.length, 6, objArr, this.serializer);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.read;
            int i6 = i4 + 1;
            onContentCardClicked.IconCompatParcelizer(iArr3, i6, iArr3, i4, i3);
            Object[] objArr2 = this.serializer;
            onContentCardClicked.write(i6, i4, i3, objArr2, objArr2);
        }
        int i7 = this.write;
        if (i3 == i7) {
            int[] iArr4 = this.read;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.serializer[i4] = obj;
                this.write = i7 + 1;
                return true;
            }
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
        return false;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.write * 14);
        sb.append('{');
        int i = this.write;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.serializer[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return onContentCardClicked.write(0, this.write, this.serializer);
    }
}
