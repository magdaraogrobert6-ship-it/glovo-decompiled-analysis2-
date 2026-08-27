package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositionLocalsKtLocalInputModeManager1 extends transformMatrixToWindowEL8BTi8 implements decodeBaselineShifty9eOQZs, RandomAccess, component24 {
    public static final CompositionLocalsKtLocalInputModeManager1 read = new CompositionLocalsKtLocalInputModeManager1(new float[0], 0, false);
    public float[] IconCompatParcelizer;
    public int write;

    public static CompositionLocalsKtLocalInputModeManager1 write() {
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

    public final void RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i >= this.write) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.write, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        read();
        if (i < 0 || i > (i2 = this.write)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.write, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        float[] fArr = this.IconCompatParcelizer;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, fArr2, i + 1, this.write - i);
            this.IconCompatParcelizer = fArr2;
        }
        this.IconCompatParcelizer[i] = fFloatValue;
        this.write++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.write; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.IconCompatParcelizer[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        read();
        RemoteActionCompatParcelizer(i);
        float[] fArr = this.IconCompatParcelizer;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public CompositionLocalsKtLocalInputModeManager1(float[] fArr, int i, boolean z) {
        super(z);
        this.IconCompatParcelizer = fArr;
        this.write = i;
    }

    public final void IconCompatParcelizer(float f) {
        read();
        int i = this.write;
        float[] fArr = this.IconCompatParcelizer;
        if (i == fArr.length) {
            float[] fArr2 = new float[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.IconCompatParcelizer = fArr2;
        }
        float[] fArr3 = this.IconCompatParcelizer;
        int i2 = this.write;
        this.write = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        collection.getClass();
        if (!(collection instanceof CompositionLocalsKtLocalInputModeManager1)) {
            return super.addAll(collection);
        }
        CompositionLocalsKtLocalInputModeManager1 compositionLocalsKtLocalInputModeManager1 = (CompositionLocalsKtLocalInputModeManager1) collection;
        int i = compositionLocalsKtLocalInputModeManager1.write;
        if (i == 0) {
            return false;
        }
        int i2 = this.write;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.IconCompatParcelizer;
        if (i3 > fArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer, 0, this.IconCompatParcelizer, this.write, compositionLocalsKtLocalInputModeManager1.write);
        this.write = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        RemoteActionCompatParcelizer(i);
        return Float.valueOf(this.IconCompatParcelizer[i]);
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        RemoteActionCompatParcelizer(i);
        float[] fArr = this.IconCompatParcelizer;
        float f = fArr[i];
        int i2 = this.write;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.write--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositionLocalsKtLocalInputModeManager1)) {
            return super.equals(obj);
        }
        CompositionLocalsKtLocalInputModeManager1 compositionLocalsKtLocalInputModeManager1 = (CompositionLocalsKtLocalInputModeManager1) obj;
        if (this.write != compositionLocalsKtLocalInputModeManager1.write) {
            return false;
        }
        float[] fArr = compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer;
        for (int i = 0; i < this.write; i++) {
            if (Float.floatToIntBits(this.IconCompatParcelizer[i]) != Float.floatToIntBits(fArr[i])) {
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
        float[] fArr = this.IconCompatParcelizer;
        System.arraycopy(fArr, i2, fArr, i, this.write - i2);
        this.write -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.decodeString
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CompositionLocalsKtLocalInputModeManager1 read(int i) {
        if (i >= this.write) {
            return new CompositionLocalsKtLocalInputModeManager1(Arrays.copyOf(this.IconCompatParcelizer, i), this.write, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.write;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.IconCompatParcelizer[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        IconCompatParcelizer(((Float) obj).floatValue());
        return true;
    }
}
