package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class setScopeui extends KeyInputElement implements RandomAccess {
    public static final setScopeui read;
    public static final Object[] serializer;
    public Object[] IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;

    static {
        Object[] objArr = new Object[0];
        serializer = objArr;
        read = new setScopeui(objArr, 0, false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            DrawableTransformation.read(isMetaPressedZmokQxo.read("Index:", this.RemoteActionCompatParcelizer, (byte) 13, ", Size:", i));
        }
    }

    public setScopeui(Object[] objArr, int i, boolean z) {
        super(z);
        this.IconCompatParcelizer = objArr;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        read(i);
        return this.IconCompatParcelizer[i];
    }

    @Override // o.KeyInputElement, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        write();
        read(i);
        Object[] objArr = this.IconCompatParcelizer;
        Object obj = objArr[i];
        int i2 = this.RemoteActionCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.RemoteActionCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        write();
        read(i);
        Object[] objArr = this.IconCompatParcelizer;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        write();
        if (i < 0 || i > (i2 = this.RemoteActionCompatParcelizer)) {
            DrawableTransformation.read(isMetaPressedZmokQxo.read("Index:", this.RemoteActionCompatParcelizer, (byte) 13, ", Size:", i));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.IconCompatParcelizer;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.IconCompatParcelizer, 0, objArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, objArr2, i3, this.RemoteActionCompatParcelizer - i);
            this.IconCompatParcelizer = objArr2;
        }
        this.IconCompatParcelizer[i] = obj;
        this.RemoteActionCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.onPostFlingRZ2iAVYsuspendImpl
    public final /* synthetic */ onPostFlingRZ2iAVYsuspendImpl RemoteActionCompatParcelizer(int i) {
        if (i >= this.RemoteActionCompatParcelizer) {
            return new setScopeui(i == 0 ? serializer : Arrays.copyOf(this.IconCompatParcelizer, i), this.RemoteActionCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        write();
        int i = this.RemoteActionCompatParcelizer;
        int length = this.IconCompatParcelizer.length;
        if (i == length) {
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
