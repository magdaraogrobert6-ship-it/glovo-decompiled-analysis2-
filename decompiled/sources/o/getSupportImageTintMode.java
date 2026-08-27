package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportImageTintMode implements Map.Entry {
    public getSupportImageTintMode RemoteActionCompatParcelizer;
    public getSupportImageTintMode read;
    public final Object serializer;
    public final Object write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.serializer;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.write.hashCode() ^ this.serializer.hashCode();
    }

    public final String toString() {
        return this.write + ContainerUtils.KEY_VALUE_DELIMITER + this.serializer;
    }

    public getSupportImageTintMode(Object obj, Object obj2) {
        this.write = obj;
        this.serializer = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getSupportImageTintMode)) {
            return false;
        }
        getSupportImageTintMode getsupportimagetintmode = (getSupportImageTintMode) obj;
        return this.write.equals(getsupportimagetintmode.write) && this.serializer.equals(getsupportimagetintmode.serializer);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }
}
