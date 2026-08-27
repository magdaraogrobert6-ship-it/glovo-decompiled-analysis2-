package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TileEndpointConfiguration implements Serializable {
    private final String dataset;
    private final String host;
    private final boolean isFallback;
    private final Integer minDiffInDaysToConsiderServerVersion;
    private final String version;
    private final String versionBeforeFallback;

    public String getDataset() {
        return this.dataset;
    }

    public String getHost() {
        return this.host;
    }

    public boolean getIsFallback() {
        return this.isFallback;
    }

    public Integer getMinDiffInDaysToConsiderServerVersion() {
        return this.minDiffInDaysToConsiderServerVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVersionBeforeFallback() {
        return this.versionBeforeFallback;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.host;
        String str2 = this.dataset;
        String str3 = this.version;
        boolean z = this.isFallback;
        return Objects.hash(str, str2, str3, Boolean.valueOf(z), this.versionBeforeFallback, this.minDiffInDaysToConsiderServerVersion);
    }

    public TileEndpointConfiguration(String str, String str2, String str3, boolean z, String str4, Integer num) {
        this.host = str;
        this.dataset = str2;
        this.version = str3;
        this.isFallback = z;
        this.versionBeforeFallback = str4;
        this.minDiffInDaysToConsiderServerVersion = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[host: ");
        IconCompatParcelizer.read(sb, this.host, ", dataset: ");
        IconCompatParcelizer.read(sb, this.dataset, ", version: ");
        IconCompatParcelizer.read(sb, this.version, ", isFallback: ");
        MediaSessionCompatQueueItem.write(sb, this.isFallback, ", versionBeforeFallback: ");
        IconCompatParcelizer.read(sb, this.versionBeforeFallback, ", minDiffInDaysToConsiderServerVersion: ");
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
        TileEndpointConfiguration tileEndpointConfiguration = (TileEndpointConfiguration) obj;
        return Objects.equals(this.host, tileEndpointConfiguration.host) && Objects.equals(this.dataset, tileEndpointConfiguration.dataset) && Objects.equals(this.version, tileEndpointConfiguration.version) && this.isFallback == tileEndpointConfiguration.isFallback && Objects.equals(this.versionBeforeFallback, tileEndpointConfiguration.versionBeforeFallback) && Objects.equals(this.minDiffInDaysToConsiderServerVersion, tileEndpointConfiguration.minDiffInDaysToConsiderServerVersion);
    }
}
