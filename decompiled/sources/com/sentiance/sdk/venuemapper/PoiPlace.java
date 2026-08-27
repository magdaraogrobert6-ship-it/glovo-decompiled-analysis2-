package com.sentiance.sdk.venuemapper;

import com.sentiance.sdk.DontObfuscate;
import java.util.ArrayList;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class PoiPlace {
    private List<String> mCategoryHierarchy;
    private Double mLatitude;
    private Double mLongitude;
    private String mName;
    private Double mProbability;

    public List<String> getCategoryHierarchy() {
        return this.mCategoryHierarchy;
    }

    public Double getLatitude() {
        return this.mLatitude;
    }

    public Double getLongitude() {
        return this.mLongitude;
    }

    public String getName() {
        return this.mName;
    }

    public Double getProbability() {
        return this.mProbability;
    }

    public static PoiPlace fromThrift(r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0) {
        return new PoiPlace(r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.write, r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.read, r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.serializer, r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.IconCompatParcelizer, r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.MediaBrowserCompatMediaItem);
    }

    public PoiPlace(String str, Double d, Double d2, Double d3, List<String> list) {
        this.mName = str;
        this.mProbability = d;
        this.mLatitude = d2;
        this.mLongitude = d3;
        this.mCategoryHierarchy = list != null ? new ArrayList(list) : null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiPlace{mName='");
        sb.append(this.mName);
        sb.append("', mProbability=");
        sb.append(this.mProbability);
        sb.append(", mLatitude=");
        sb.append(this.mLatitude);
        sb.append(", mLongitude=");
        sb.append(this.mLongitude);
        sb.append(", mCategoryHierarchy=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.mCategoryHierarchy, '}');
    }

    public int hashCode() {
        String str = this.mName;
        int iHashCode = str != null ? str.hashCode() : 0;
        Double d = this.mProbability;
        int iHashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.mLatitude;
        int iHashCode3 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.mLongitude;
        int iHashCode4 = d3 != null ? d3.hashCode() : 0;
        List<String> list = this.mCategoryHierarchy;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PoiPlace poiPlace = (PoiPlace) obj;
            String str = this.mName;
            String str2 = poiPlace.mName;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            Double d = this.mProbability;
            Double d2 = poiPlace.mProbability;
            if (d == null ? d2 != null : !d.equals(d2)) {
                return false;
            }
            Double d3 = this.mLatitude;
            Double d4 = poiPlace.mLatitude;
            if (d3 == null ? d4 != null : !d3.equals(d4)) {
                return false;
            }
            Double d5 = this.mLongitude;
            Double d6 = poiPlace.mLongitude;
            if (d5 == null ? d6 != null : !d5.equals(d6)) {
                return false;
            }
            List<String> list = this.mCategoryHierarchy;
            List<String> list2 = poiPlace.mCategoryHierarchy;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }
}
