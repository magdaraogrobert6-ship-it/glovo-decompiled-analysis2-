package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class DebugUtilsKt extends transformMatrixToWindowEL8BTi8 implements decodeFloat, RandomAccess, component24 {
    public static final DebugUtilsKt serializer = new DebugUtilsKt(new int[0], 0, false);
    public int read;
    public int[] write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    public DebugUtilsKt() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        read();
        if (i < 0 || i > (i2 = this.read)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.read, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.write;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.write, i, iArr2, i + 1, this.read - i);
            this.write = iArr2;
        }
        this.write[i] = iIntValue;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.read; i2++) {
            i = (i * 31) + this.write[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(IconCompatParcelizer(i, ((Integer) obj).intValue()));
    }

    public final void write(int i) {
        if (i < 0 || i >= this.read) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.read, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    public final int IconCompatParcelizer(int i, int i2) {
        read();
        write(i);
        int[] iArr = this.write;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public final void IconCompatParcelizer(int i) {
        read();
        int i2 = this.read;
        int[] iArr = this.write;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.write = iArr2;
        }
        int[] iArr3 = this.write;
        int i3 = this.read;
        this.read = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        collection.getClass();
        if (!(collection instanceof DebugUtilsKt)) {
            return super.addAll(collection);
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) collection;
        int i = debugUtilsKt.read;
        if (i == 0) {
            return false;
        }
        int i2 = this.read;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.write;
        if (i3 > iArr.length) {
            this.write = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(debugUtilsKt.write, 0, this.write, this.read, debugUtilsKt.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        write(i);
        int[] iArr = this.write;
        int i2 = iArr[i];
        int i3 = this.read;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    public final int serializer(int i) {
        write(i);
        return this.write[i];
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugUtilsKt)) {
            return super.equals(obj);
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) obj;
        if (this.read != debugUtilsKt.read) {
            return false;
        }
        int[] iArr = debugUtilsKt.write;
        for (int i = 0; i < this.read; i++) {
            if (this.write[i] != iArr[i]) {
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
        int[] iArr = this.write;
        System.arraycopy(iArr, i2, iArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.write[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.decodeString
    public final decodeString read(int i) {
        if (i >= this.read) {
            return new DebugUtilsKt(Arrays.copyOf(this.write, i), this.read, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(serializer(i));
    }

    public DebugUtilsKt(int[] iArr, int i, boolean z) {
        super(z);
        this.write = iArr;
        this.read = i;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        IconCompatParcelizer(((Integer) obj).intValue());
        return true;
    }
}
