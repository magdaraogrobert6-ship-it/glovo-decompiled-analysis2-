package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.utils.extension.DoubleKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.DrawableTransformation;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchOptions implements Parcelable {
    public static final Parcelable.Creator<SearchOptions> CREATOR = new EtaType.Creator(6);
    public final BoundingBox boundingBox;
    public final List countries;
    public final Boolean fuzzyMatch;
    public final boolean ignoreIndexableRecords;
    public final Double indexableRecordsDistanceThresholdMeters;
    public final List languages;
    public final Integer limit;
    public final SearchNavigationOptions navigationOptions;
    public final List newTypes;
    public final Point origin;
    public final Point proximity;
    public final Integer requestDebounce;
    public final RouteOptions routeOptions;
    public final List types;
    public final Map unsafeParameters;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Point point = this.proximity;
        int iHashCode = point != null ? point.hashCode() : 0;
        BoundingBox boundingBox = this.boundingBox;
        int iHashCode2 = boundingBox != null ? boundingBox.hashCode() : 0;
        List list = this.countries;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        Boolean bool = this.fuzzyMatch;
        int iHashCode4 = bool != null ? bool.hashCode() : 0;
        List list2 = this.languages;
        int iHashCode5 = list2 != null ? list2.hashCode() : 0;
        Integer num = this.limit;
        int iIntValue = num != null ? num.intValue() : 0;
        List list3 = this.types;
        int iHashCode6 = list3 != null ? list3.hashCode() : 0;
        List list4 = this.newTypes;
        int iHashCode7 = list4 != null ? list4.hashCode() : 0;
        Integer num2 = this.requestDebounce;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Point point2 = this.origin;
        int iHashCode8 = point2 != null ? point2.hashCode() : 0;
        SearchNavigationOptions searchNavigationOptions = this.navigationOptions;
        int iHashCode9 = searchNavigationOptions != null ? searchNavigationOptions.hashCode() : 0;
        RouteOptions routeOptions = this.routeOptions;
        int iHashCode10 = routeOptions != null ? routeOptions.hashCode() : 0;
        Map map = this.unsafeParameters;
        int iM = d$$ExternalSyntheticOutline0.m(((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iIntValue) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iIntValue2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (map != null ? map.hashCode() : 0)) * 31, 31, this.ignoreIndexableRecords);
        Double d = this.indexableRecordsDistanceThresholdMeters;
        return iM + (d != null ? d.hashCode() : 0);
    }

    public SearchOptions(Point point, BoundingBox boundingBox, ArrayList arrayList, Boolean bool, ArrayList arrayList2, Integer num, ArrayList arrayList3, ArrayList arrayList4, Integer num2, Point point2, SearchNavigationOptions searchNavigationOptions, RouteOptions routeOptions, HashMap map, boolean z, Double d) {
        this.proximity = point;
        this.boundingBox = boundingBox;
        this.countries = arrayList;
        this.fuzzyMatch = bool;
        this.languages = arrayList2;
        this.limit = num;
        this.types = arrayList3;
        this.newTypes = arrayList4;
        this.requestDebounce = num2;
        this.origin = point2;
        this.navigationOptions = searchNavigationOptions;
        this.routeOptions = routeOptions;
        this.unsafeParameters = map;
        this.ignoreIndexableRecords = z;
        this.indexableRecordsDistanceThresholdMeters = d;
        if (num != null && num.intValue() <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("'limit' should be greater than 0 (passed value: ", num, ").");
            throw null;
        }
        if (d == null || Double.compare(d.doubleValue(), 0.0d) >= 0) {
            return;
        }
        DrawableTransformation.serializer(41, "'indexableRecordsDistanceThresholdMeters' can't be negative (passed value: ", d);
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.proximity);
        parcel.writeSerializable(this.boundingBox);
        List list = this.countries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        Boolean bool = this.fuzzyMatch;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list2 = this.languages;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((Parcelable) it2.next(), i);
            }
        }
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List list3 = this.types;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeString(((QueryType) it3.next()).name());
            }
        }
        parcel.writeStringList(this.newTypes);
        Integer num2 = this.requestDebounce;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeSerializable(this.origin);
        SearchNavigationOptions searchNavigationOptions = this.navigationOptions;
        if (searchNavigationOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchNavigationOptions.writeToParcel(parcel, i);
        }
        RouteOptions routeOptions = this.routeOptions;
        if (routeOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            routeOptions.writeToParcel(parcel, i);
        }
        Map map = this.unsafeParameters;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeInt(this.ignoreIndexableRecords ? 1 : 0);
        Double d = this.indexableRecordsDistanceThresholdMeters;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public final String toString() {
        return "SearchOptions(proximity=" + this.proximity + ", boundingBox=" + this.boundingBox + ", countries=" + this.countries + ", fuzzyMatch=" + this.fuzzyMatch + ", languages=" + this.languages + ", limit=" + this.limit + ", types=" + this.types + ", newTypes=" + this.newTypes + ", requestDebounce=" + this.requestDebounce + ", origin=" + this.origin + ", navigationOptions=" + this.navigationOptions + ", routeOptions=" + this.routeOptions + ", unsafeParameters=" + this.unsafeParameters + ", ignoreIndexableRecords=" + this.ignoreIndexableRecords + ", indexableRecordsDistanceThresholdMeters=" + this.indexableRecordsDistanceThresholdMeters + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchOptions searchOptions = (SearchOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.proximity, searchOptions.proximity}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.boundingBox, searchOptions.boundingBox}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, searchOptions.countries}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fuzzyMatch, searchOptions.fuzzyMatch}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.languages, searchOptions.languages}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.limit, searchOptions.limit}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.types, searchOptions.types}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.newTypes, searchOptions.newTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestDebounce, searchOptions.requestDebounce}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.origin, searchOptions.origin}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.navigationOptions, searchOptions.navigationOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeOptions, searchOptions.routeOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.unsafeParameters, searchOptions.unsafeParameters}, getCieXyz.write())).booleanValue() && this.ignoreIndexableRecords == searchOptions.ignoreIndexableRecords && DoubleKt.safeCompareTo(this.indexableRecordsDistanceThresholdMeters, searchOptions.indexableRecordsDistanceThresholdMeters);
    }
}
