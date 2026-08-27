package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class GeometryUtilsKt extends searchChildren4C6V_qg implements RandomAccess {
    public static final GeometryUtilsKt serializer;
    public Object[] RemoteActionCompatParcelizer;
    public int write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    public final void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.write) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.write, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    static {
        GeometryUtilsKt geometryUtilsKt = new GeometryUtilsKt(0, new Object[0]);
        serializer = geometryUtilsKt;
        geometryUtilsKt.read = false;
    }

    public GeometryUtilsKt(int i, Object[] objArr) {
        this.RemoteActionCompatParcelizer = objArr;
        this.write = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        IconCompatParcelizer(i);
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        serializer();
        IconCompatParcelizer(i);
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object obj = objArr[i];
        int i2 = this.write;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.write--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        serializer();
        IconCompatParcelizer(i);
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // o.TwoDimensionalFocusSearchKtgenerateAndSearchChildren1
    public final TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 read(int i) {
        if (i >= this.write) {
            return new GeometryUtilsKt(this.write, Arrays.copyOf(this.RemoteActionCompatParcelizer, i));
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        serializer();
        if (i < 0 || i > (i2 = this.write)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.write, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.RemoteActionCompatParcelizer, i, objArr2, i + 1, this.write - i);
            this.RemoteActionCompatParcelizer = objArr2;
        }
        this.RemoteActionCompatParcelizer[i] = obj;
        this.write++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.searchChildren4C6V_qg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        serializer();
        int i = this.write;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        if (i == objArr.length) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        this.write = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
