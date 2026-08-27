package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class ServiceData implements Serializable {
    private final byte[] data;
    private final String uuid;

    public byte[] getData() {
        return this.data;
    }

    public String getUuid() {
        return this.uuid;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.uuid, Integer.valueOf(Arrays.hashCode(this.data)));
    }

    public ServiceData(String str, byte[] bArr) {
        this.uuid = str;
        this.data = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[uuid: ");
        IconCompatParcelizer.read(sb, this.uuid, ", data: ");
        sb.append(RecordUtils.fieldToString(this.data));
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
        ServiceData serviceData = (ServiceData) obj;
        return Objects.equals(this.uuid, serviceData.uuid) && Arrays.equals(this.data, serviceData.data);
    }
}
