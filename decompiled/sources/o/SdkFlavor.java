package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkFlavor implements Map.Entry, Comparable {
    public final Comparable IconCompatParcelizer;
    public Object read;
    public final /* synthetic */ GenderCompanion serializer;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.read;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.IconCompatParcelizer;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.read;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.IconCompatParcelizer.compareTo(((SdkFlavor) obj).IconCompatParcelizer);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.serializer.IconCompatParcelizer();
        Object obj2 = this.read;
        this.read = obj;
        return obj2;
    }

    public final String toString() {
        return this.IconCompatParcelizer + ContainerUtils.KEY_VALUE_DELIMITER + this.read;
    }

    public SdkFlavor(GenderCompanion genderCompanion, Comparable comparable, Object obj) {
        this.serializer = genderCompanion;
        this.IconCompatParcelizer = comparable;
        this.read = obj;
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
        Comparable comparable = this.IconCompatParcelizer;
        if (comparable == null) {
            if (key != null) {
                return false;
            }
        } else if (!comparable.equals(key)) {
            return false;
        }
        Object obj2 = this.read;
        Object value = entry.getValue();
        if (obj2 == null) {
            return value == null;
        }
        return obj2.equals(value);
    }
}
