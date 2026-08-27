package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class Shield implements Serializable {
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

    public Shield(String str, String str2, String str3, String str4) {
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
        Shield shield = (Shield) obj;
        return Objects.equals(this.baseUrl, shield.baseUrl) && Objects.equals(this.displayRef, shield.displayRef) && Objects.equals(this.name, shield.name) && Objects.equals(this.textColor, shield.textColor);
    }
}
