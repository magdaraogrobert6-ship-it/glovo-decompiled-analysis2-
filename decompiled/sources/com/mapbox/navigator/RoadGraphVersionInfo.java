package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class RoadGraphVersionInfo implements Serializable {
    private final String dataset;
    private final String version;

    public String getDataset() {
        return this.dataset;
    }

    public String getVersion() {
        return this.version;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.dataset, this.version);
    }

    public RoadGraphVersionInfo(String str, String str2) {
        this.dataset = str;
        this.version = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[dataset: ");
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
        RoadGraphVersionInfo roadGraphVersionInfo = (RoadGraphVersionInfo) obj;
        return Objects.equals(this.dataset, roadGraphVersionInfo.dataset) && Objects.equals(this.version, roadGraphVersionInfo.version);
    }
}
