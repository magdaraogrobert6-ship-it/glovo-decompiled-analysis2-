package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class ChargePointOperator implements Serializable {
    private final String countryCode;
    private final String name;
    private final String partyId;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getName() {
        return this.name;
    }

    public String getPartyId() {
        return this.partyId;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.partyId, this.name, this.countryCode);
    }

    public ChargePointOperator(String str, String str2, String str3) {
        this.partyId = str;
        this.name = str2;
        this.countryCode = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[partyId: ");
        IconCompatParcelizer.read(sb, this.partyId, ", name: ");
        IconCompatParcelizer.read(sb, this.name, ", countryCode: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.countryCode, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChargePointOperator chargePointOperator = (ChargePointOperator) obj;
        return Objects.equals(this.partyId, chargePointOperator.partyId) && Objects.equals(this.name, chargePointOperator.name) && Objects.equals(this.countryCode, chargePointOperator.countryCode);
    }
}
