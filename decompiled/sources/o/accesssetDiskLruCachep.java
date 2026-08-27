package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetDiskLruCachep extends InAppMessageEvent implements isTimestampOlderThan, RandomAccess, r8lambdaOpTmS30WMC3S0mRVScnf5WrDg {
    public static final accesssetDiskLruCachep serializer = new accesssetDiskLruCachep(new double[0], 0, false);
    public int IconCompatParcelizer;
    public double[] RemoteActionCompatParcelizer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        read();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        double[] dArr = this.RemoteActionCompatParcelizer;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.RemoteActionCompatParcelizer, i, dArr2, i + 1, this.IconCompatParcelizer - i);
            this.RemoteActionCompatParcelizer = dArr2;
        }
        this.RemoteActionCompatParcelizer[i] = dDoubleValue;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iWrite = 1;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            iWrite = (iWrite * 31) + isFromOfflineStorage.write(Double.doubleToLongBits(this.RemoteActionCompatParcelizer[i]));
        }
        return iWrite;
    }

    public final void serializer(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        read();
        serializer(i);
        double[] dArr = this.RemoteActionCompatParcelizer;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    public accesssetDiskLruCachep(double[] dArr, int i, boolean z) {
        super(z);
        this.RemoteActionCompatParcelizer = dArr;
        this.IconCompatParcelizer = i;
    }

    public final void RemoteActionCompatParcelizer(double d) {
        read();
        int i = this.IconCompatParcelizer;
        double[] dArr = this.RemoteActionCompatParcelizer;
        if (i == dArr.length) {
            double[] dArr2 = new double[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.RemoteActionCompatParcelizer = dArr2;
        }
        double[] dArr3 = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = isFromOfflineStorage.read;
        collection.getClass();
        if (!(collection instanceof accesssetDiskLruCachep)) {
            return super.addAll(collection);
        }
        accesssetDiskLruCachep accesssetdisklrucachep = (accesssetDiskLruCachep) collection;
        int i = accesssetdisklrucachep.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.RemoteActionCompatParcelizer;
        if (i3 > dArr.length) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(accesssetdisklrucachep.RemoteActionCompatParcelizer, 0, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, accesssetdisklrucachep.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        serializer(i);
        return Double.valueOf(this.RemoteActionCompatParcelizer[i]);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        serializer(i);
        double[] dArr = this.RemoteActionCompatParcelizer;
        double d = dArr[i];
        int i2 = this.IconCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accesssetDiskLruCachep)) {
            return super.equals(obj);
        }
        accesssetDiskLruCachep accesssetdisklrucachep = (accesssetDiskLruCachep) obj;
        if (this.IconCompatParcelizer != accesssetdisklrucachep.IconCompatParcelizer) {
            return false;
        }
        double[] dArr = accesssetdisklrucachep.RemoteActionCompatParcelizer;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (Double.doubleToLongBits(this.RemoteActionCompatParcelizer[i]) != Double.doubleToLongBits(dArr[i])) {
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
        double[] dArr = this.RemoteActionCompatParcelizer;
        System.arraycopy(dArr, i2, dArr, i, this.IconCompatParcelizer - i2);
        this.IconCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.RemoteActionCompatParcelizer[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        if (i >= this.IconCompatParcelizer) {
            return new accesssetDiskLruCachep(Arrays.copyOf(this.RemoteActionCompatParcelizer, i), this.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        RemoteActionCompatParcelizer(((Double) obj).doubleValue());
        return true;
    }
}
