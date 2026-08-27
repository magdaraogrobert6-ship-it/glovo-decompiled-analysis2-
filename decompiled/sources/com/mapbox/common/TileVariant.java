package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class TileVariant implements Serializable {
    private final String dataset;
    private final TileDataDomain domain;
    private final String version;

    public String getDataset() {
        return this.dataset;
    }

    public TileDataDomain getDomain() {
        return this.domain;
    }

    public String getVersion() {
        return this.version;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.domain, this.dataset, this.version);
    }

    public TileVariant(TileDataDomain tileDataDomain, String str, String str2) {
        this.domain = tileDataDomain;
        this.dataset = str;
        this.version = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[domain: ");
        sb.append(RecordUtils.fieldToString(this.domain));
        sb.append(", dataset: ");
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
        TileVariant tileVariant = (TileVariant) obj;
        return Objects.equals(this.domain, tileVariant.domain) && Objects.equals(this.dataset, tileVariant.dataset) && Objects.equals(this.version, tileVariant.version);
    }
}
