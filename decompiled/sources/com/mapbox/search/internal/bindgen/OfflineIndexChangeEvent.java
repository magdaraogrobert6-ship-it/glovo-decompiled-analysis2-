package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class OfflineIndexChangeEvent implements Serializable {
    private final String dataset;
    private final String region;
    private final OfflineIndexChangeEventType type;
    private final String version;

    public String getDataset() {
        return this.dataset;
    }

    public String getRegion() {
        return this.region;
    }

    public OfflineIndexChangeEventType getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.region, this.dataset, this.version);
    }

    public OfflineIndexChangeEvent(OfflineIndexChangeEventType offlineIndexChangeEventType, String str, String str2, String str3) {
        this.type = offlineIndexChangeEventType;
        this.region = str;
        this.dataset = str2;
        this.version = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", region: ");
        IconCompatParcelizer.read(sb, this.region, ", dataset: ");
        IconCompatParcelizer.read(sb, this.dataset, ", version: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.version, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OfflineIndexChangeEvent offlineIndexChangeEvent = (OfflineIndexChangeEvent) obj;
        return Objects.equals(this.type, offlineIndexChangeEvent.type) && Objects.equals(this.region, offlineIndexChangeEvent.region) && Objects.equals(this.dataset, offlineIndexChangeEvent.dataset) && Objects.equals(this.version, offlineIndexChangeEvent.version);
    }
}
