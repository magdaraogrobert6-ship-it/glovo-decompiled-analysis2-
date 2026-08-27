package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentScale extends getModifierLocalBeyondBoundsLayout {
    public final /* synthetic */ getFillWidthannotations IconCompatParcelizer;
    public int read;
    public final Object write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        getFillWidthannotations getfillwidthannotations = this.IconCompatParcelizer;
        Map mapSerializer = getfillwidthannotations.serializer();
        if (mapSerializer != null) {
            return mapSerializer.get(this.write);
        }
        read();
        int i = this.read;
        if (i == -1) {
            return null;
        }
        Object[] objArr = getfillwidthannotations.serializer;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        getFillWidthannotations getfillwidthannotations = this.IconCompatParcelizer;
        Map mapSerializer = getfillwidthannotations.serializer();
        Object obj2 = this.write;
        if (mapSerializer != null) {
            return mapSerializer.put(obj2, obj);
        }
        read();
        int i = this.read;
        if (i == -1) {
            getfillwidthannotations.put(obj2, obj);
            return null;
        }
        Object[] objArr = getfillwidthannotations.serializer;
        objArr.getClass();
        Object obj3 = objArr[i];
        int i2 = this.read;
        Object[] objArr2 = getfillwidthannotations.serializer;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj3;
    }

    public ContentScale(getFillWidthannotations getfillwidthannotations, int i) {
        this.IconCompatParcelizer = getfillwidthannotations;
        Object[] objArr = getfillwidthannotations.read;
        objArr.getClass();
        this.write = objArr[i];
        this.read = i;
    }

    public final void read() {
        int i = this.read;
        Object obj = this.write;
        getFillWidthannotations getfillwidthannotations = this.IconCompatParcelizer;
        if (i != -1 && i < getfillwidthannotations.size()) {
            int i2 = this.read;
            Object[] objArr = getfillwidthannotations.read;
            objArr.getClass();
            if (decodeInitialData.write(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = getFillWidthannotations.write;
        this.read = getfillwidthannotations.read(obj);
    }
}
