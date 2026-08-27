package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 extends InAppMessageEvent implements IFireOnceEventSubscriber, RandomAccess, r8lambdaOpTmS30WMC3S0mRVScnf5WrDg {
    public static final r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 RemoteActionCompatParcelizer = new r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0(new long[0], 0, false);
    public int IconCompatParcelizer;
    public long[] serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer;
    }

    public r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        read();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.serializer;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.serializer, i, jArr2, i + 1, this.IconCompatParcelizer - i);
            this.serializer = jArr2;
        }
        this.serializer[i] = jLongValue;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iWrite = 1;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            iWrite = (iWrite * 31) + isFromOfflineStorage.write(this.serializer[i]);
        }
        return iWrite;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        read();
        write(i);
        long[] jArr = this.serializer;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public final void write(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        read();
        int i = this.IconCompatParcelizer;
        long[] jArr = this.serializer;
        if (i == jArr.length) {
            long[] jArr2 = new long[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.serializer = jArr2;
        }
        long[] jArr3 = this.serializer;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = isFromOfflineStorage.read;
        collection.getClass();
        if (!(collection instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0)) {
            return super.addAll(collection);
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) collection;
        int i = r8lambdawenh2zfjpauxgrrcztm8m6cjb0.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.serializer;
        if (i3 > jArr.length) {
            this.serializer = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(r8lambdawenh2zfjpauxgrrcztm8m6cjb0.serializer, 0, this.serializer, this.IconCompatParcelizer, r8lambdawenh2zfjpauxgrrcztm8m6cjb0.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        write(i);
        return Long.valueOf(this.serializer[i]);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        write(i);
        long[] jArr = this.serializer;
        long j = jArr[i];
        int i2 = this.IconCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0)) {
            return super.equals(obj);
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) obj;
        if (this.IconCompatParcelizer != r8lambdawenh2zfjpauxgrrcztm8m6cjb0.IconCompatParcelizer) {
            return false;
        }
        long[] jArr = r8lambdawenh2zfjpauxgrrcztm8m6cjb0.serializer;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (this.serializer[i] != jArr[i]) {
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
        long[] jArr = this.serializer;
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
            if (this.serializer[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    public r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0(long[] jArr, int i, boolean z) {
        super(z);
        this.serializer = jArr;
        this.IconCompatParcelizer = i;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        if (i >= this.IconCompatParcelizer) {
            return new r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0(Arrays.copyOf(this.serializer, i), this.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        RemoteActionCompatParcelizer(((Long) obj).longValue());
        return true;
    }
}
