package com.mapbox.navigation.base.trip.model.roadobject.border;

/* JADX INFO: loaded from: classes2.dex */
public final class CountryBorderCrossingInfo {
    public final CountryBorderCrossingAdminInfo from;
    public final CountryBorderCrossingAdminInfo to;

    public final int hashCode() {
        return this.to.hashCode() + (this.from.hashCode() * 31);
    }

    public CountryBorderCrossingInfo(CountryBorderCrossingAdminInfo countryBorderCrossingAdminInfo, CountryBorderCrossingAdminInfo countryBorderCrossingAdminInfo2) {
        this.from = countryBorderCrossingAdminInfo;
        this.to = countryBorderCrossingAdminInfo2;
    }

    public final String toString() {
        return "CountryBorderCrossingInfo(from=" + this.from + ", to=" + this.to + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CountryBorderCrossingInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        CountryBorderCrossingInfo countryBorderCrossingInfo = (CountryBorderCrossingInfo) obj;
        return this.from.equals(countryBorderCrossingInfo.from) && this.to.equals(countryBorderCrossingInfo.to);
    }
}
