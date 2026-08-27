package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class ManufacturerData implements Serializable {
    private final byte[] data;
    private final int id;

    public byte[] getData() {
        return this.data;
    }

    public int getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ManufacturerData(int i, byte[] bArr) {
        this.id = i;
        this.data = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.write(this.id, ", data: ", sb);
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), Integer.valueOf(Arrays.hashCode(this.data)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManufacturerData manufacturerData = (ManufacturerData) obj;
        return this.id == manufacturerData.id && Arrays.equals(this.data, manufacturerData.data);
    }
}
