package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class canBeSavedToBundle implements Map.Entry, Comparable {
    public Object IconCompatParcelizer;
    public final Comparable read;
    public final /* synthetic */ performSave serializer;

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.read;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.IconCompatParcelizer;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final Comparable serializer() {
        return this.read;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.read.compareTo(((canBeSavedToBundle) obj).read);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.serializer.RemoteActionCompatParcelizer();
        Object obj2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = obj;
        return obj2;
    }

    public final String toString() {
        return this.read + ContainerUtils.KEY_VALUE_DELIMITER + this.IconCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.read;
    }

    public canBeSavedToBundle(performSave performsave, Map.Entry entry) {
        this(performsave, (Comparable) entry.getKey(), entry.getValue());
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
        Comparable comparable = this.read;
        if (comparable == null) {
            if (key != null) {
                return false;
            }
        } else if (!comparable.equals(key)) {
            return false;
        }
        Object obj2 = this.IconCompatParcelizer;
        Object value = entry.getValue();
        if (obj2 == null) {
            return value == null;
        }
        return obj2.equals(value);
    }

    public canBeSavedToBundle(performSave performsave, Comparable comparable, Object obj) {
        this.serializer = performsave;
        this.read = comparable;
        this.IconCompatParcelizer = obj;
    }
}
