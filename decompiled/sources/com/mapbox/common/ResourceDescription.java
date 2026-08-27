package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceDescription implements Serializable {
    private final TileDataDomain domain;
    private final String url;

    public TileDataDomain getDomain() {
        return this.domain;
    }

    public String getUrl() {
        return this.url;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.domain, this.url);
    }

    public ResourceDescription(TileDataDomain tileDataDomain, String str) {
        this.domain = tileDataDomain;
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[domain: ");
        sb.append(RecordUtils.fieldToString(this.domain));
        sb.append(", url: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.url, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDescription resourceDescription = (ResourceDescription) obj;
        return Objects.equals(this.domain, resourceDescription.domain) && Objects.equals(this.url, resourceDescription.url);
    }
}
