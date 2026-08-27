package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getUint64High32annotations implements Map.Entry, Comparable {
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ getDualFloatInfinityBaseannotations serializer;
    public final Comparable write;

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.write;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.RemoteActionCompatParcelizer;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final Comparable write() {
        return this.write;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.write.compareTo(((getUint64High32annotations) obj).write);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.serializer.IconCompatParcelizer();
        Object obj2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = obj;
        return obj2;
    }

    public final String toString() {
        return this.write + ContainerUtils.KEY_VALUE_DELIMITER + this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.write;
    }

    public getUint64High32annotations(getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations, Map.Entry entry) {
        this(getdualfloatinfinitybaseannotations, (Comparable) entry.getKey(), entry.getValue());
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
        Comparable comparable = this.write;
        if (comparable == null) {
            if (key != null) {
                return false;
            }
        } else if (!comparable.equals(key)) {
            return false;
        }
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object value = entry.getValue();
        if (obj2 == null) {
            return value == null;
        }
        return obj2.equals(value);
    }

    public getUint64High32annotations(getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations, Comparable comparable, Object obj) {
        this.serializer = getdualfloatinfinitybaseannotations;
        this.write = comparable;
        this.RemoteActionCompatParcelizer = obj;
    }
}
