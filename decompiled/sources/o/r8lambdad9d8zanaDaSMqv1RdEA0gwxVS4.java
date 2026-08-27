package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 extends InAppMessageEvent implements ContentCardsUpdatedEventCompanion, RandomAccess, r8lambdaOpTmS30WMC3S0mRVScnf5WrDg {
    public static final r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 RemoteActionCompatParcelizer = new r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4(new boolean[0], 0, false);
    public int IconCompatParcelizer;
    public boolean[] write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        read();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        boolean[] zArr = this.write;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.write, i, zArr2, i + 1, this.IconCompatParcelizer - i);
            this.write = zArr2;
        }
        this.write[i] = zBooleanValue;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            boolean z = this.write[i2];
            Charset charset = isFromOfflineStorage.read;
            i = (i * 31) + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        read();
        RemoteActionCompatParcelizer(i);
        boolean[] zArr = this.write;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    public r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4(boolean[] zArr, int i, boolean z) {
        super(z);
        this.write = zArr;
        this.IconCompatParcelizer = i;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = isFromOfflineStorage.read;
        collection.getClass();
        if (!(collection instanceof r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4)) {
            return super.addAll(collection);
        }
        r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 r8lambdad9d8zanadasmqv1rdea0gwxvs4 = (r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4) collection;
        int i = r8lambdad9d8zanadasmqv1rdea0gwxvs4.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.write;
        if (i3 > zArr.length) {
            this.write = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(r8lambdad9d8zanadasmqv1rdea0gwxvs4.write, 0, this.write, this.IconCompatParcelizer, r8lambdad9d8zanadasmqv1rdea0gwxvs4.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        RemoteActionCompatParcelizer(i);
        return Boolean.valueOf(this.write[i]);
    }

    public final void read(boolean z) {
        read();
        int i = this.IconCompatParcelizer;
        boolean[] zArr = this.write;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.write = zArr2;
        }
        boolean[] zArr3 = this.write;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        RemoteActionCompatParcelizer(i);
        boolean[] zArr = this.write;
        boolean z = zArr[i];
        int i2 = this.IconCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4)) {
            return super.equals(obj);
        }
        r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 r8lambdad9d8zanadasmqv1rdea0gwxvs4 = (r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4) obj;
        if (this.IconCompatParcelizer != r8lambdad9d8zanadasmqv1rdea0gwxvs4.IconCompatParcelizer) {
            return false;
        }
        boolean[] zArr = r8lambdad9d8zanadasmqv1rdea0gwxvs4.write;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (this.write[i] != zArr[i]) {
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
        boolean[] zArr = this.write;
        System.arraycopy(zArr, i2, zArr, i, this.IconCompatParcelizer - i2);
        this.IconCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.write[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        if (i >= this.IconCompatParcelizer) {
            return new r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4(Arrays.copyOf(this.write, i), this.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        read(((Boolean) obj).booleanValue());
        return true;
    }
}
