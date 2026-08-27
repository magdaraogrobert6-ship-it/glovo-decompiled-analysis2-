package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class component22 extends transformMatrixToWindowEL8BTi8 implements RandomAccess {
    public static final component22 IconCompatParcelizer = new component22(new Object[0], 0, false);
    public Object[] read;
    public int serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    public final void IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.serializer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.serializer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    public component22(Object[] objArr, int i, boolean z) {
        super(z);
        this.read = objArr;
        this.serializer = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        IconCompatParcelizer(i);
        return this.read[i];
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        IconCompatParcelizer(i);
        Object[] objArr = this.read;
        Object obj = objArr[i];
        int i2 = this.serializer;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.serializer--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        read();
        IconCompatParcelizer(i);
        Object[] objArr = this.read;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // o.decodeString
    public final decodeString read(int i) {
        if (i >= this.serializer) {
            return new component22(Arrays.copyOf(this.read, i), this.serializer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        read();
        if (i < 0 || i > (i2 = this.serializer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.serializer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.read;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.read, i, objArr2, i + 1, this.serializer - i);
            this.read = objArr2;
        }
        this.read[i] = obj;
        this.serializer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        read();
        int i = this.serializer;
        Object[] objArr = this.read;
        if (i == objArr.length) {
            this.read = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.read;
        int i2 = this.serializer;
        this.serializer = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
