package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class SearchAddressRegion implements Serializable {
    private final String name;
    private final String regionCode;
    private final String regionCodeFull;

    public String getName() {
        return this.name;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getRegionCodeFull() {
        return this.regionCodeFull;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.regionCode, this.regionCodeFull);
    }

    public SearchAddressRegion(String str, String str2, String str3) {
        this.name = str;
        this.regionCode = str2;
        this.regionCodeFull = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", regionCode: ");
        IconCompatParcelizer.read(sb, this.regionCode, ", regionCodeFull: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.regionCodeFull, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchAddressRegion searchAddressRegion = (SearchAddressRegion) obj;
        return Objects.equals(this.name, searchAddressRegion.name) && Objects.equals(this.regionCode, searchAddressRegion.regionCode) && Objects.equals(this.regionCodeFull, searchAddressRegion.regionCodeFull);
    }
}
