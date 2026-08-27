package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class OfflineIndexError implements Serializable {
    private final String dataset;
    private final String message;
    private final String region;
    private final String tile;
    private final String version;

    public String getDataset() {
        return this.dataset;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRegion() {
        return this.region;
    }

    public String getTile() {
        return this.tile;
    }

    public String getVersion() {
        return this.version;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.region, this.dataset, this.version, this.tile, this.message);
    }

    public OfflineIndexError(String str, String str2, String str3, String str4, String str5) {
        this.region = str;
        this.dataset = str2;
        this.version = str3;
        this.tile = str4;
        this.message = str5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[region: ");
        IconCompatParcelizer.read(sb, this.region, ", dataset: ");
        IconCompatParcelizer.read(sb, this.dataset, ", version: ");
        IconCompatParcelizer.read(sb, this.version, ", tile: ");
        IconCompatParcelizer.read(sb, this.tile, ", message: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.message, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OfflineIndexError offlineIndexError = (OfflineIndexError) obj;
        return Objects.equals(this.region, offlineIndexError.region) && Objects.equals(this.dataset, offlineIndexError.dataset) && Objects.equals(this.version, offlineIndexError.version) && Objects.equals(this.tile, offlineIndexError.tile) && Objects.equals(this.message, offlineIndexError.message);
    }
}
