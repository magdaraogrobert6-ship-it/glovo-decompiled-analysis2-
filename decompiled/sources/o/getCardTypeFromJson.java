package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class getCardTypeFromJson extends InAppMessageEvent implements RandomAccess {
    public static final getCardTypeFromJson write = new getCardTypeFromJson(new Object[0], 0, false);
    public Object[] IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void serializer(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    public getCardTypeFromJson(Object[] objArr, int i, boolean z) {
        super(z);
        this.IconCompatParcelizer = objArr;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        serializer(i);
        return this.IconCompatParcelizer[i];
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        serializer(i);
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
        read();
        serializer(i);
        Object[] objArr = this.IconCompatParcelizer;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        if (i >= this.RemoteActionCompatParcelizer) {
            return new getCardTypeFromJson(Arrays.copyOf(this.IconCompatParcelizer, i), this.RemoteActionCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        read();
        if (i < 0 || i > (i2 = this.RemoteActionCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.IconCompatParcelizer;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, objArr2, i + 1, this.RemoteActionCompatParcelizer - i);
            this.IconCompatParcelizer = objArr2;
        }
        this.IconCompatParcelizer[i] = obj;
        this.RemoteActionCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        read();
        int i = this.RemoteActionCompatParcelizer;
        Object[] objArr = this.IconCompatParcelizer;
        if (i == objArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
