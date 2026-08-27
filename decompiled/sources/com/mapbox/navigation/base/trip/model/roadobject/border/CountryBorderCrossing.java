package com.mapbox.navigation.base.trip.model.roadobject.border;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CountryBorderCrossing extends RoadObject {
    public final CountryBorderCrossingInfo countryBorderCrossingInfo;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        return "CountryBorderCrossing(countryBorderCrossingInfo=" + this.countryBorderCrossingInfo + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CountryBorderCrossing.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryBorderCrossingInfo, ((CountryBorderCrossing) obj).countryBorderCrossingInfo}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        return this.countryBorderCrossingInfo.hashCode() + (super.hashCode() * 31);
    }

    public CountryBorderCrossing(String str, CountryBorderCrossingInfo countryBorderCrossingInfo, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 1, d, str2, bool, roadObject);
        this.countryBorderCrossingInfo = countryBorderCrossingInfo;
    }
}
