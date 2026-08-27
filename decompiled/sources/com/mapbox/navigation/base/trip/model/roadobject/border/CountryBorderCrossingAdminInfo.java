package com.mapbox.navigation.base.trip.model.roadobject.border;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class CountryBorderCrossingAdminInfo {
    public final String code;
    public final String codeAlpha3;

    public final int hashCode() {
        return this.codeAlpha3.hashCode() + (this.code.hashCode() * 31);
    }

    public CountryBorderCrossingAdminInfo(String str, String str2) {
        this.code = str;
        this.codeAlpha3 = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryBorderCrossingAdminInfo(code='");
        sb.append(this.code);
        sb.append("', codeAlpha3='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.codeAlpha3, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CountryBorderCrossingAdminInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        CountryBorderCrossingAdminInfo countryBorderCrossingAdminInfo = (CountryBorderCrossingAdminInfo) obj;
        return this.code.equals(countryBorderCrossingAdminInfo.code) && this.codeAlpha3.equals(countryBorderCrossingAdminInfo.codeAlpha3);
    }
}
