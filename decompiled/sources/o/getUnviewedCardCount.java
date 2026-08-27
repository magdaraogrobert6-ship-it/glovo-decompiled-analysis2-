package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnviewedCardCount extends InAppMessageEvent implements FeatureFlagsUpdatedEvent, RandomAccess, r8lambdaOpTmS30WMC3S0mRVScnf5WrDg {
    public static final getUnviewedCardCount serializer = new getUnviewedCardCount(new int[0], 0, false);
    public int[] IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    public getUnviewedCardCount() {
        this(new int[10], 0, true);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        read();
        if (i < 0 || i > (i2 = this.RemoteActionCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.IconCompatParcelizer;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.IconCompatParcelizer, i, iArr2, i + 1, this.RemoteActionCompatParcelizer - i);
            this.IconCompatParcelizer = iArr2;
        }
        this.IconCompatParcelizer[i] = iIntValue;
        this.RemoteActionCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer; i2++) {
            i = (i * 31) + this.IconCompatParcelizer[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        read();
        RemoteActionCompatParcelizer(i);
        int[] iArr = this.IconCompatParcelizer;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public final void IconCompatParcelizer(int i) {
        read();
        int i2 = this.RemoteActionCompatParcelizer;
        int[] iArr = this.IconCompatParcelizer;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.IconCompatParcelizer = iArr2;
        }
        int[] iArr3 = this.IconCompatParcelizer;
        int i3 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = isFromOfflineStorage.read;
        collection.getClass();
        if (!(collection instanceof getUnviewedCardCount)) {
            return super.addAll(collection);
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) collection;
        int i = getunviewedcardcount.RemoteActionCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.RemoteActionCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.IconCompatParcelizer;
        if (i3 > iArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(getunviewedcardcount.IconCompatParcelizer, 0, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, getunviewedcardcount.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        RemoteActionCompatParcelizer(i);
        return Integer.valueOf(this.IconCompatParcelizer[i]);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        RemoteActionCompatParcelizer(i);
        int[] iArr = this.IconCompatParcelizer;
        int i2 = iArr[i];
        int i3 = this.RemoteActionCompatParcelizer;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.RemoteActionCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUnviewedCardCount)) {
            return super.equals(obj);
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) obj;
        if (this.RemoteActionCompatParcelizer != getunviewedcardcount.RemoteActionCompatParcelizer) {
            return false;
        }
        int[] iArr = getunviewedcardcount.IconCompatParcelizer;
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            if (this.IconCompatParcelizer[i] != iArr[i]) {
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
        int[] iArr = this.IconCompatParcelizer;
        System.arraycopy(iArr, i2, iArr, i, this.RemoteActionCompatParcelizer - i2);
        this.RemoteActionCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.IconCompatParcelizer[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        if (i >= this.RemoteActionCompatParcelizer) {
            return new getUnviewedCardCount(Arrays.copyOf(this.IconCompatParcelizer, i), this.RemoteActionCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    public getUnviewedCardCount(int[] iArr, int i, boolean z) {
        super(z);
        this.IconCompatParcelizer = iArr;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        IconCompatParcelizer(((Integer) obj).intValue());
        return true;
    }
}
