package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class SearchAddressCountry implements Serializable {
    private final String countryCode;
    private final String countryCodeAlpha3;
    private final String name;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryCodeAlpha3() {
        return this.countryCodeAlpha3;
    }

    public String getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.countryCode, this.countryCodeAlpha3);
    }

    public SearchAddressCountry(String str, String str2, String str3) {
        this.name = str;
        this.countryCode = str2;
        this.countryCodeAlpha3 = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", countryCode: ");
        IconCompatParcelizer.read(sb, this.countryCode, ", countryCodeAlpha3: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.countryCodeAlpha3, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchAddressCountry searchAddressCountry = (SearchAddressCountry) obj;
        return Objects.equals(this.name, searchAddressCountry.name) && Objects.equals(this.countryCode, searchAddressCountry.countryCode) && Objects.equals(this.countryCodeAlpha3, searchAddressCountry.countryCodeAlpha3);
    }
}
