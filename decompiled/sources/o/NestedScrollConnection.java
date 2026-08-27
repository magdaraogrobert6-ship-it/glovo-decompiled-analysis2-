package o;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollConnection extends KeyInputElement implements RandomAccess, accessonPreFlingQWom1Mojd, setNestedScrollNodeui {
    public static final NestedScrollConnection IconCompatParcelizer;
    public static final int[] RemoteActionCompatParcelizer;
    public int read;
    public int[] serializer;

    static {
        int[] iArr = new int[0];
        RemoteActionCompatParcelizer = iArr;
        IconCompatParcelizer = new NestedScrollConnection(iArr, 0, false);
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
        int iIntValue = ((Integer) obj).intValue();
        write();
        if (i < 0 || i > (i2 = this.read)) {
            DrawableTransformation.read(isMetaPressedZmokQxo.read("Index:", this.read, (byte) 13, ", Size:", i));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.serializer;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.serializer, 0, iArr2, 0, i);
            System.arraycopy(this.serializer, i, iArr2, i3, this.read - i);
            this.serializer = iArr2;
        }
        this.serializer[i] = iIntValue;
        this.read++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.read; i2++) {
            i = (i * 31) + this.serializer[i2];
        }
        return i;
    }

    public final void serializer(int i) {
        if (i < 0 || i >= this.read) {
            DrawableTransformation.read(isMetaPressedZmokQxo.read("Index:", this.read, (byte) 13, ", Size:", i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        write();
        serializer(i);
        int[] iArr = this.serializer;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public NestedScrollConnection(int[] iArr, int i, boolean z) {
        super(z);
        this.serializer = iArr;
        this.read = i;
    }

    @Override // o.KeyInputElement, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        write();
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        collection.getClass();
        if (!(collection instanceof NestedScrollConnection)) {
            return super.addAll(collection);
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) collection;
        int i = nestedScrollConnection.read;
        if (i == 0) {
            return false;
        }
        int i2 = this.read;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.serializer;
        if (i3 > iArr.length) {
            this.serializer = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(nestedScrollConnection.serializer, 0, this.serializer, this.read, nestedScrollConnection.read);
        this.read = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        serializer(i);
        return Integer.valueOf(this.serializer[i]);
    }

    public final int read(int i) {
        serializer(i);
        return this.serializer[i];
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        write();
        serializer(i);
        int[] iArr = this.serializer;
        int i2 = iArr[i];
        int i3 = this.read;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.read--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    public final void write(int i) {
        write();
        int i2 = this.read;
        int length = this.serializer.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.serializer, 0, iArr, 0, this.read);
            this.serializer = iArr;
        }
        int[] iArr2 = this.serializer;
        int i3 = this.read;
        this.read = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestedScrollConnection)) {
            return super.equals(obj);
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) obj;
        if (this.read != nestedScrollConnection.read) {
            return false;
        }
        int[] iArr = nestedScrollConnection.serializer;
        for (int i = 0; i < this.read; i++) {
            if (this.serializer[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        write();
        if (i2 < i) {
            DrawableTransformation.read("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.serializer;
        System.arraycopy(iArr, i2, iArr, i, this.read - i2);
        this.read -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.onPostFlingRZ2iAVYsuspendImpl
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final NestedScrollConnection RemoteActionCompatParcelizer(int i) {
        if (i >= this.read) {
            return new NestedScrollConnection(i == 0 ? RemoteActionCompatParcelizer : Arrays.copyOf(this.serializer, i), this.read, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.serializer[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        write(((Integer) obj).intValue());
        return true;
    }
}
