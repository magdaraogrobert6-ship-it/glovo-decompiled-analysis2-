package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollElement implements Map.Entry, Comparable {
    public final /* synthetic */ NestedScrollDispatcherdispatchPreFling1 IconCompatParcelizer;
    public final Comparable RemoteActionCompatParcelizer;
    public Object write;

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.RemoteActionCompatParcelizer;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.write;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.RemoteActionCompatParcelizer.compareTo(((NestedScrollElement) obj).RemoteActionCompatParcelizer);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.IconCompatParcelizer.write();
        Object obj2 = this.write;
        this.write = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.RemoteActionCompatParcelizer);
        String strValueOf2 = String.valueOf(this.write);
        return d$$ExternalSyntheticOutline0.m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2);
    }

    public NestedScrollElement(NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1, Comparable comparable, Object obj) {
        this.IconCompatParcelizer = nestedScrollDispatcherdispatchPreFling1;
        this.RemoteActionCompatParcelizer = comparable;
        this.write = obj;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.RemoteActionCompatParcelizer;
        if (comparable == null) {
            if (key != null) {
                return false;
            }
        } else if (!comparable.equals(key)) {
            return false;
        }
        Object obj2 = this.write;
        Object value = entry.getValue();
        if (obj2 == null) {
            return value == null;
        }
        return obj2.equals(value);
    }
}
