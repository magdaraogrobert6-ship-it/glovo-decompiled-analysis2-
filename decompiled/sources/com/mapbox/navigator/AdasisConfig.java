package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public class AdasisConfig implements Serializable {
    private final AdasisConfigDataSending dataSending;
    private final AdasisConfigPathOptions pathOptions;

    public AdasisConfigDataSending getDataSending() {
        return this.dataSending;
    }

    public AdasisConfigPathOptions getPathOptions() {
        return this.pathOptions;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.dataSending, this.pathOptions);
    }

    public AdasisConfig(AdasisConfigDataSending adasisConfigDataSending, AdasisConfigPathOptions adasisConfigPathOptions) {
        this.dataSending = adasisConfigDataSending;
        this.pathOptions = adasisConfigPathOptions;
    }

    public String toString() {
        return "[dataSending: " + RecordUtils.fieldToString(this.dataSending) + ", pathOptions: " + RecordUtils.fieldToString(this.pathOptions) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfig adasisConfig = (AdasisConfig) obj;
        return Objects.equals(this.dataSending, adasisConfig.dataSending) && Objects.equals(this.pathOptions, adasisConfig.pathOptions);
    }
}
