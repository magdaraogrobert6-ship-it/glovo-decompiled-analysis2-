package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class getDpSizeMYxV2XQ extends transformMatrixToWindowEL8BTi8 implements decodeShadow, RandomAccess, component24 {
    public static final getDpSizeMYxV2XQ read = new getDpSizeMYxV2XQ(new long[0], 0, false);
    public long[] IconCompatParcelizer;
    public int write;

    public static getDpSizeMYxV2XQ write() {
        return read;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    public getDpSizeMYxV2XQ() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        read();
        if (i < 0 || i > (i2 = this.write)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.write, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.IconCompatParcelizer;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, jArr2, i + 1, this.write - i);
            this.IconCompatParcelizer = jArr2;
        }
        this.IconCompatParcelizer[i] = jLongValue;
        this.write++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iIconCompatParcelizer = 1;
        for (int i = 0; i < this.write; i++) {
            iIconCompatParcelizer = (iIconCompatParcelizer * 31) + CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(this.IconCompatParcelizer[i]);
        }
        return iIconCompatParcelizer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        read();
        write(i);
        long[] jArr = this.IconCompatParcelizer;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public final void write(int i) {
        if (i < 0 || i >= this.write) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.write, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    public final long IconCompatParcelizer(int i) {
        write(i);
        return this.IconCompatParcelizer[i];
    }

    public final void IconCompatParcelizer(long j) {
        read();
        int i = this.write;
        long[] jArr = this.IconCompatParcelizer;
        if (i == jArr.length) {
            long[] jArr2 = new long[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.IconCompatParcelizer = jArr2;
        }
        long[] jArr3 = this.IconCompatParcelizer;
        int i2 = this.write;
        this.write = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        collection.getClass();
        if (!(collection instanceof getDpSizeMYxV2XQ)) {
            return super.addAll(collection);
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) collection;
        int i = getdpsizemyxv2xq.write;
        if (i == 0) {
            return false;
        }
        int i2 = this.write;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.IconCompatParcelizer;
        if (i3 > jArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(getdpsizemyxv2xq.IconCompatParcelizer, 0, this.IconCompatParcelizer, this.write, getdpsizemyxv2xq.write);
        this.write = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        write(i);
        long[] jArr = this.IconCompatParcelizer;
        long j = jArr[i];
        int i2 = this.write;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.write--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDpSizeMYxV2XQ)) {
            return super.equals(obj);
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) obj;
        if (this.write != getdpsizemyxv2xq.write) {
            return false;
        }
        long[] jArr = getdpsizemyxv2xq.IconCompatParcelizer;
        for (int i = 0; i < this.write; i++) {
            if (this.IconCompatParcelizer[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        read();
        if (i2 < i) {
            DrawableTransformation.read("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.IconCompatParcelizer;
        System.arraycopy(jArr, i2, jArr, i, this.write - i2);
        this.write -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.decodeString
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getDpSizeMYxV2XQ read(int i) {
        if (i >= this.write) {
            return new getDpSizeMYxV2XQ(Arrays.copyOf(this.IconCompatParcelizer, i), this.write, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.write;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.IconCompatParcelizer[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(IconCompatParcelizer(i));
    }

    public getDpSizeMYxV2XQ(long[] jArr, int i, boolean z) {
        super(z);
        this.IconCompatParcelizer = jArr;
        this.write = i;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        IconCompatParcelizer(((Long) obj).longValue());
        return true;
    }
}
