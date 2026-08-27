package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getDpTouchBoundsExpansion implements Map.Entry {
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(String.valueOf(getKey()), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(getValue()));
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return FeatureFlagProvider.write(getKey(), entry.getKey()) && FeatureFlagProvider.write(getValue(), entry.getValue());
    }
}
