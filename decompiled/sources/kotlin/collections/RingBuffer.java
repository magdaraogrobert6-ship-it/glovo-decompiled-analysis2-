package kotlin.collections;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import o.DefaultContentCardsViewBindingHandlerCompanionCREATOR1;
import o.DrawableTransformation;
import o.onSwiped;

/* JADX INFO: loaded from: classes4.dex */
public final class RingBuffer extends AbstractList implements RandomAccess {
    public int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public int read;
    public final Object[] serializer;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int size = size();
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, size);
        int i2 = this.read;
        return this.serializer[(i2 + i) % this.RemoteActionCompatParcelizer];
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new onSwiped(this);
    }

    public final void read(int i) {
        if (i < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            DrawableTransformation.write(size(), ff$$ExternalSyntheticOutline0.m(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.read;
            int i3 = this.RemoteActionCompatParcelizer;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.serializer;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.read = i4;
            this.IconCompatParcelizer = size() - i;
        }
    }

    public RingBuffer(int i, Object[] objArr) {
        this.serializer = objArr;
        if (i < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.RemoteActionCompatParcelizer = objArr.length;
            this.IconCompatParcelizer = i;
        } else {
            DrawableTransformation.write(objArr.length, ff$$ExternalSyntheticOutline0.m(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.read;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.serializer;
            if (i3 >= size || i >= this.RemoteActionCompatParcelizer) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
