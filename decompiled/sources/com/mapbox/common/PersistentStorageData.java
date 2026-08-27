package com.mapbox.common;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class PersistentStorageData implements Serializable {
    private final String key;
    private final Date timestamp;
    private final DataRef value;

    public String getKey() {
        return this.key;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public DataRef getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.key, this.timestamp, this.value);
    }

    public PersistentStorageData(String str, Date date, DataRef dataRef) {
        this.key = str;
        this.timestamp = date;
        this.value = dataRef;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[key: ");
        IconCompatParcelizer.read(sb, this.key, ", timestamp: ");
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append(", value: ");
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
        PersistentStorageData persistentStorageData = (PersistentStorageData) obj;
        return Objects.equals(this.key, persistentStorageData.key) && Objects.equals(this.timestamp, persistentStorageData.timestamp) && Objects.equals(this.value, persistentStorageData.value);
    }
}
