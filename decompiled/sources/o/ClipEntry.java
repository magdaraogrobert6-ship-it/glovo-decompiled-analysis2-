package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ClipEntry extends transformMatrixToWindowEL8BTi8 implements DecodeHelper, RandomAccess, component24 {
    public static final ClipEntry write = new ClipEntry(new boolean[0], 0, false);
    public int IconCompatParcelizer;
    public boolean[] read;

    public static ClipEntry IconCompatParcelizer() {
        return write;
    }

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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        read();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        boolean[] zArr = this.read;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.read, i, zArr2, i + 1, this.IconCompatParcelizer - i);
            this.read = zArr2;
        }
        this.read[i] = zBooleanValue;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            boolean z = this.read[i2];
            Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
            i = (i * 31) + (z ? 1231 : 1237);
        }
        return i;
    }

    public final void serializer(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        read();
        serializer(i);
        boolean[] zArr = this.read;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    public ClipEntry(boolean[] zArr, int i, boolean z) {
        super(z);
        this.read = zArr;
        this.IconCompatParcelizer = i;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        collection.getClass();
        if (!(collection instanceof ClipEntry)) {
            return super.addAll(collection);
        }
        ClipEntry clipEntry = (ClipEntry) collection;
        int i = clipEntry.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.read;
        if (i3 > zArr.length) {
            this.read = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(clipEntry.read, 0, this.read, this.IconCompatParcelizer, clipEntry.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        serializer(i);
        return Boolean.valueOf(this.read[i]);
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        serializer(i);
        boolean[] zArr = this.read;
        boolean z = zArr[i];
        int i2 = this.IconCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    public final void serializer(boolean z) {
        read();
        int i = this.IconCompatParcelizer;
        boolean[] zArr = this.read;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.read = zArr2;
        }
        boolean[] zArr3 = this.read;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipEntry)) {
            return super.equals(obj);
        }
        ClipEntry clipEntry = (ClipEntry) obj;
        if (this.IconCompatParcelizer != clipEntry.IconCompatParcelizer) {
            return false;
        }
        boolean[] zArr = clipEntry.read;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (this.read[i] != zArr[i]) {
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
        boolean[] zArr = this.read;
        System.arraycopy(zArr, i2, zArr, i, this.IconCompatParcelizer - i2);
        this.IconCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.decodeString
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ClipEntry read(int i) {
        if (i >= this.IconCompatParcelizer) {
            return new ClipEntry(Arrays.copyOf(this.read, i), this.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.read[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        serializer(((Boolean) obj).booleanValue());
        return true;
    }
}
