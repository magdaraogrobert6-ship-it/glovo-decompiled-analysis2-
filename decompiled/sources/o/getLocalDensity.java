package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class getLocalDensity extends transformMatrixToWindowEL8BTi8 implements CompositionLocalsKtProvideCommonCompositionLocals1, RandomAccess, component24 {
    public static final getLocalDensity IconCompatParcelizer = new getLocalDensity(new double[0], 0, false);
    public int read;
    public double[] write;

    public static getLocalDensity serializer() {
        return IconCompatParcelizer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        read();
        if (i < 0 || i > (i2 = this.read)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.read, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        double[] dArr = this.write;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.write, i, dArr2, i + 1, this.read - i);
            this.write = dArr2;
        }
        this.write[i] = dDoubleValue;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iIconCompatParcelizer = 1;
        for (int i = 0; i < this.read; i++) {
            iIconCompatParcelizer = (iIconCompatParcelizer * 31) + CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(Double.doubleToLongBits(this.write[i]));
        }
        return iIconCompatParcelizer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        read();
        write(i);
        double[] dArr = this.write;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    public final void write(int i) {
        if (i < 0 || i >= this.read) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.read, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    public getLocalDensity(double[] dArr, int i, boolean z) {
        super(z);
        this.write = dArr;
        this.read = i;
    }

    public final void IconCompatParcelizer(double d) {
        read();
        int i = this.read;
        double[] dArr = this.write;
        if (i == dArr.length) {
            double[] dArr2 = new double[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.write = dArr2;
        }
        double[] dArr3 = this.write;
        int i2 = this.read;
        this.read = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        collection.getClass();
        if (!(collection instanceof getLocalDensity)) {
            return super.addAll(collection);
        }
        getLocalDensity getlocaldensity = (getLocalDensity) collection;
        int i = getlocaldensity.read;
        if (i == 0) {
            return false;
        }
        int i2 = this.read;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.write;
        if (i3 > dArr.length) {
            this.write = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(getlocaldensity.write, 0, this.write, this.read, getlocaldensity.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        write(i);
        return Double.valueOf(this.write[i]);
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        write(i);
        double[] dArr = this.write;
        double d = dArr[i];
        int i2 = this.read;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLocalDensity)) {
            return super.equals(obj);
        }
        getLocalDensity getlocaldensity = (getLocalDensity) obj;
        if (this.read != getlocaldensity.read) {
            return false;
        }
        double[] dArr = getlocaldensity.write;
        for (int i = 0; i < this.read; i++) {
            if (Double.doubleToLongBits(this.write[i]) != Double.doubleToLongBits(dArr[i])) {
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
        double[] dArr = this.write;
        System.arraycopy(dArr, i2, dArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.decodeString
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getLocalDensity read(int i) {
        if (i >= this.read) {
            return new getLocalDensity(Arrays.copyOf(this.write, i), this.read, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.write[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        IconCompatParcelizer(((Double) obj).doubleValue());
        return true;
    }
}
