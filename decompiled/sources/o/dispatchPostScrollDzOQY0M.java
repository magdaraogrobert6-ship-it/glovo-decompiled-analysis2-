package o;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchPostScrollDzOQY0M extends KeyInputElement implements RandomAccess, onPreFlingQWom1MosuspendImpl, setNestedScrollNodeui {
    public static final long[] read;
    public static final dispatchPostScrollDzOQY0M serializer;
    public int IconCompatParcelizer;
    public long[] RemoteActionCompatParcelizer;

    static {
        long[] jArr = new long[0];
        read = jArr;
        serializer = new dispatchPostScrollDzOQY0M(jArr, 0, false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            DrawableTransformation.read(isMetaPressedZmokQxo.read("Index:", this.IconCompatParcelizer, (byte) 13, ", Size:", i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        write();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            DrawableTransformation.read(isMetaPressedZmokQxo.read("Index:", this.IconCompatParcelizer, (byte) 13, ", Size:", i));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.RemoteActionCompatParcelizer, 0, jArr2, 0, i);
            System.arraycopy(this.RemoteActionCompatParcelizer, i, jArr2, i3, this.IconCompatParcelizer - i);
            this.RemoteActionCompatParcelizer = jArr2;
        }
        this.RemoteActionCompatParcelizer[i] = jLongValue;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            long j = this.RemoteActionCompatParcelizer[i2];
            Charset charset = accessonPreScrollOzD1aCkjd.write;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        write();
        IconCompatParcelizer(i);
        long[] jArr = this.RemoteActionCompatParcelizer;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public dispatchPostScrollDzOQY0M(long[] jArr, int i, boolean z) {
        super(z);
        this.RemoteActionCompatParcelizer = jArr;
        this.IconCompatParcelizer = i;
    }

    @Override // o.KeyInputElement, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        write();
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        collection.getClass();
        if (!(collection instanceof dispatchPostScrollDzOQY0M)) {
            return super.addAll(collection);
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) collection;
        int i = dispatchpostscrolldzoqy0m.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.RemoteActionCompatParcelizer;
        if (i3 > jArr.length) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(dispatchpostscrolldzoqy0m.RemoteActionCompatParcelizer, 0, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, dispatchpostscrolldzoqy0m.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        IconCompatParcelizer(i);
        return Long.valueOf(this.RemoteActionCompatParcelizer[i]);
    }

    public final long read(int i) {
        IconCompatParcelizer(i);
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        write();
        IconCompatParcelizer(i);
        long[] jArr = this.RemoteActionCompatParcelizer;
        long j = jArr[i];
        int i2 = this.IconCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    public final void write(long j) {
        write();
        int i = this.IconCompatParcelizer;
        int length = this.RemoteActionCompatParcelizer.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.RemoteActionCompatParcelizer, 0, jArr, 0, this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = jArr;
        }
        long[] jArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dispatchPostScrollDzOQY0M)) {
            return super.equals(obj);
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) obj;
        if (this.IconCompatParcelizer != dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
            return false;
        }
        long[] jArr = dispatchpostscrolldzoqy0m.RemoteActionCompatParcelizer;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (this.RemoteActionCompatParcelizer[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        write();
        if (i2 < i) {
            DrawableTransformation.read("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.RemoteActionCompatParcelizer;
        System.arraycopy(jArr, i2, jArr, i, this.IconCompatParcelizer - i2);
        this.IconCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.RemoteActionCompatParcelizer[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.onPostFlingRZ2iAVYsuspendImpl
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final dispatchPostScrollDzOQY0M RemoteActionCompatParcelizer(int i) {
        if (i >= this.IconCompatParcelizer) {
            return new dispatchPostScrollDzOQY0M(i == 0 ? read : Arrays.copyOf(this.RemoteActionCompatParcelizer, i), this.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        write(((Long) obj).longValue());
        return true;
    }
}
