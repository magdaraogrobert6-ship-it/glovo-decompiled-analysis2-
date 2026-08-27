package com.mapbox.navigator.route_data;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class RdRoadShield implements Serializable {
    private final String baseUrl;
    private final String displayRef;
    private final String name;
    private final String textColor;

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getDisplayRef() {
        return this.displayRef;
    }

    public String getName() {
        return this.name;
    }

    public String getTextColor() {
        return this.textColor;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.baseUrl, this.displayRef, this.name, this.textColor);
    }

    public RdRoadShield(String str, String str2, String str3, String str4) {
        this.baseUrl = str;
        this.displayRef = str2;
        this.name = str3;
        this.textColor = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[baseUrl: ");
        IconCompatParcelizer.read(sb, this.baseUrl, ", displayRef: ");
        IconCompatParcelizer.read(sb, this.displayRef, ", name: ");
        IconCompatParcelizer.read(sb, this.name, ", textColor: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.textColor, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdRoadShield rdRoadShield = (RdRoadShield) obj;
        return Objects.equals(this.baseUrl, rdRoadShield.baseUrl) && Objects.equals(this.displayRef, rdRoadShield.displayRef) && Objects.equals(this.name, rdRoadShield.name) && Objects.equals(this.textColor, rdRoadShield.textColor);
    }
}
