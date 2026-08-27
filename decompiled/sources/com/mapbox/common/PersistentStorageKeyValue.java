package com.mapbox.common;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class PersistentStorageKeyValue implements Serializable {
    private final String key;
    private final DataRef value;

    public String getKey() {
        return this.key;
    }

    public DataRef getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    public PersistentStorageKeyValue(String str, DataRef dataRef) {
        this.key = str;
        this.value = dataRef;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[key: ");
        IconCompatParcelizer.read(sb, this.key, ", value: ");
        sb.append(RecordUtils.fieldToString(this.value));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageKeyValue persistentStorageKeyValue = (PersistentStorageKeyValue) obj;
        return Objects.equals(this.key, persistentStorageKeyValue.key) && Objects.equals(this.value, persistentStorageKeyValue.value);
    }
}
