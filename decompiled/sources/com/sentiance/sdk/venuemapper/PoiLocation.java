package com.sentiance.sdk.venuemapper;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o;
import o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class PoiLocation {
    private List<PoiPlace> mPlaceCandidates;
    private PoiPlace mPoiPlace;
    private String mSignificance;

    public List<PoiPlace> getPlaceCandidates() {
        return this.mPlaceCandidates;
    }

    public PoiPlace getPoiPlace() {
        return this.mPoiPlace;
    }

    public String getSignificance() {
        return this.mSignificance;
    }

    public static PoiLocation fromThrift(r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o r8lambdalhrh0wcdualb1ubrbfl71ebc4o) {
        PoiPlace poiPlaceFromThrift = PoiPlace.fromThrift(r8lambdalhrh0wcdualb1ubrbfl71ebc4o.write);
        List list = r8lambdalhrh0wcdualb1ubrbfl71ebc4o.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(PoiPlace.fromThrift((r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) list.get(i)));
        }
        return new PoiLocation(poiPlaceFromThrift, arrayList, r8lambdalhrh0wcdualb1ubrbfl71ebc4o.IconCompatParcelizer);
    }

    public int hashCode() {
        int iHashCode = this.mPoiPlace.hashCode();
        return this.mSignificance.hashCode() + ((this.mPlaceCandidates.hashCode() + (iHashCode * 31)) * 31);
    }

    public PoiLocation(PoiPlace poiPlace, List<PoiPlace> list, String str) {
        this.mPoiPlace = poiPlace;
        this.mPlaceCandidates = list;
        this.mSignificance = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiLocation{mPoiPlace=");
        sb.append(this.mPoiPlace);
        sb.append(", mPlaceCandidates=");
        sb.append(this.mPlaceCandidates);
        sb.append(", mSignificance='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.mSignificance, "'}");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoiLocation poiLocation = (PoiLocation) obj;
        if (this.mPoiPlace.equals(poiLocation.mPoiPlace) && this.mPlaceCandidates.equals(poiLocation.mPlaceCandidates)) {
            return this.mSignificance.equals(poiLocation.mSignificance);
        }
        return false;
    }
}
