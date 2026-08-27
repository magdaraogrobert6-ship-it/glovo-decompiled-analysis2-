package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletonsSubcomposeLayoutKtlambda6412008091 extends AbstractSet {
    public final /* synthetic */ int read;
    public final /* synthetic */ getFillWidthannotations write;

    public /* synthetic */ ComposableSingletonsSubcomposeLayoutKtlambda6412008091(getFillWidthannotations getfillwidthannotations, int i) {
        this.read = i;
        this.write = getfillwidthannotations;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.read;
        getFillWidthannotations getfillwidthannotations = this.write;
        if (i != 0) {
            getfillwidthannotations.clear();
        } else {
            getfillwidthannotations.clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.read;
        getFillWidthannotations getfillwidthannotations = this.write;
        if (i != 0) {
            return getfillwidthannotations.containsKey(obj);
        }
        Map mapSerializer = getfillwidthannotations.serializer();
        if (mapSerializer != null) {
            return mapSerializer.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int i2 = getfillwidthannotations.read(entry.getKey());
            if (i2 != -1) {
                Object[] objArr = getfillwidthannotations.serializer;
                objArr.getClass();
                if (decodeInitialData.write(objArr[i2], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.read;
        getFillWidthannotations getfillwidthannotations = this.write;
        if (i != 0) {
            Map mapSerializer = getfillwidthannotations.serializer();
            return mapSerializer != null ? mapSerializer.keySet().iterator() : new computeScaleFactorH7hwNQA(getfillwidthannotations, 0);
        }
        Map mapSerializer2 = getfillwidthannotations.serializer();
        return mapSerializer2 != null ? mapSerializer2.entrySet().iterator() : new computeScaleFactorH7hwNQA(getfillwidthannotations, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.read;
        getFillWidthannotations getfillwidthannotations = this.write;
        return i != 0 ? getfillwidthannotations.size() : getfillwidthannotations.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.read;
        getFillWidthannotations getfillwidthannotations = this.write;
        if (i != 0) {
            Map mapSerializer = getfillwidthannotations.serializer();
            if (mapSerializer != null) {
                return mapSerializer.keySet().remove(obj);
            }
            return getfillwidthannotations.RemoteActionCompatParcelizer(obj) != getFillWidthannotations.write;
        }
        Map mapSerializer2 = getfillwidthannotations.serializer();
        if (mapSerializer2 != null) {
            return mapSerializer2.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (getfillwidthannotations.RemoteActionCompatParcelizer()) {
            return false;
        }
        int i2 = getfillwidthannotations.read();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = getfillwidthannotations.RemoteActionCompatParcelizer;
        obj2.getClass();
        int[] iArr = getfillwidthannotations.IconCompatParcelizer;
        iArr.getClass();
        Object[] objArr = getfillwidthannotations.read;
        objArr.getClass();
        Object[] objArr2 = getfillwidthannotations.serializer;
        objArr2.getClass();
        int iSerializer = ContentScaleCompanion.serializer(key, value, i2, obj2, iArr, objArr, objArr2);
        if (iSerializer == -1) {
            return false;
        }
        getfillwidthannotations.RemoteActionCompatParcelizer(iSerializer, i2);
        getfillwidthannotations.MediaDescriptionCompat--;
        getfillwidthannotations.RatingCompat += 32;
        return true;
    }
}
