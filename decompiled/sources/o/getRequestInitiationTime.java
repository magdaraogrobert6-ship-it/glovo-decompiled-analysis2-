package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class getRequestInitiationTime extends InAppMessageEvent implements getFlagCount, RandomAccess, r8lambdaOpTmS30WMC3S0mRVScnf5WrDg {
    public static final getRequestInitiationTime write = new getRequestInitiationTime(new float[0], 0, false);
    public int IconCompatParcelizer;
    public float[] serializer;

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
        float fFloatValue = ((Float) obj).floatValue();
        read();
        if (i < 0 || i > (i2 = this.IconCompatParcelizer)) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
            return;
        }
        float[] fArr = this.serializer;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[getBitmapFromCache.read(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.serializer, i, fArr2, i + 1, this.IconCompatParcelizer - i);
            this.serializer = fArr2;
        }
        this.serializer[i] = fFloatValue;
        this.IconCompatParcelizer++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.serializer[i]);
        }
        return iFloatToIntBits;
    }

    public final void serializer(int i) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ff$$ExternalSyntheticOutline0.m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        read();
        serializer(i);
        float[] fArr = this.serializer;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public getRequestInitiationTime(float[] fArr, int i, boolean z) {
        super(z);
        this.serializer = fArr;
        this.IconCompatParcelizer = i;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        read();
        Charset charset = isFromOfflineStorage.read;
        collection.getClass();
        if (!(collection instanceof getRequestInitiationTime)) {
            return super.addAll(collection);
        }
        getRequestInitiationTime getrequestinitiationtime = (getRequestInitiationTime) collection;
        int i = getrequestinitiationtime.IconCompatParcelizer;
        if (i == 0) {
            return false;
        }
        int i2 = this.IconCompatParcelizer;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.serializer;
        if (i3 > fArr.length) {
            this.serializer = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(getrequestinitiationtime.serializer, 0, this.serializer, this.IconCompatParcelizer, getrequestinitiationtime.IconCompatParcelizer);
        this.IconCompatParcelizer = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        serializer(i);
        return Float.valueOf(this.serializer[i]);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        serializer(i);
        float[] fArr = this.serializer;
        float f = fArr[i];
        int i2 = this.IconCompatParcelizer;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.IconCompatParcelizer--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    public final void write(float f) {
        read();
        int i = this.IconCompatParcelizer;
        float[] fArr = this.serializer;
        if (i == fArr.length) {
            float[] fArr2 = new float[getBitmapFromCache.read(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.serializer = fArr2;
        }
        float[] fArr3 = this.serializer;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRequestInitiationTime)) {
            return super.equals(obj);
        }
        getRequestInitiationTime getrequestinitiationtime = (getRequestInitiationTime) obj;
        if (this.IconCompatParcelizer != getrequestinitiationtime.IconCompatParcelizer) {
            return false;
        }
        float[] fArr = getrequestinitiationtime.serializer;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            if (Float.floatToIntBits(this.serializer[i]) != Float.floatToIntBits(fArr[i])) {
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
        float[] fArr = this.serializer;
        System.arraycopy(fArr, i2, fArr, i, this.IconCompatParcelizer - i2);
        this.IconCompatParcelizer -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.serializer[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        if (i >= this.IconCompatParcelizer) {
            return new getRequestInitiationTime(Arrays.copyOf(this.serializer, i), this.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        write(((Float) obj).floatValue());
        return true;
    }
}
