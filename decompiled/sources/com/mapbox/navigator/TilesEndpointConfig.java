package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class TilesEndpointConfig implements Serializable {
    private final String dataset;
    private final String host;
    private final Integer minDiffInDaysToConsiderServerVersion;

    public String getDataset() {
        return this.dataset;
    }

    public String getHost() {
        return this.host;
    }

    public Integer getMinDiffInDaysToConsiderServerVersion() {
        return this.minDiffInDaysToConsiderServerVersion;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.host, this.dataset, this.minDiffInDaysToConsiderServerVersion);
    }

    public TilesEndpointConfig(String str, String str2, Integer num) {
        this.host = str;
        this.dataset = str2;
        this.minDiffInDaysToConsiderServerVersion = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[host: ");
        IconCompatParcelizer.read(sb, this.host, ", dataset: ");
        IconCompatParcelizer.read(sb, this.dataset, ", minDiffInDaysToConsiderServerVersion: ");
        sb.append(RecordUtils.fieldToString(this.minDiffInDaysToConsiderServerVersion));
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
        TilesEndpointConfig tilesEndpointConfig = (TilesEndpointConfig) obj;
        return Objects.equals(this.host, tilesEndpointConfig.host) && Objects.equals(this.dataset, tilesEndpointConfig.dataset) && Objects.equals(this.minDiffInDaysToConsiderServerVersion, tilesEndpointConfig.minDiffInDaysToConsiderServerVersion);
    }
}
