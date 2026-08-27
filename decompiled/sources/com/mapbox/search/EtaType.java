package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.result.BaseSearchResponse;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.common.NavigationProfile;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class EtaType implements Parcelable {
    public static final Parcelable.Creator<EtaType> CREATOR = new Creator(0);
    public final String rawName;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean boolValueOf;
            ArrayList arrayList5;
            ArrayList arrayList6;
            LinkedHashMap linkedHashMap;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new EtaType(parcel.readString());
                case 1:
                    parcel.getClass();
                    return new RequestOptions(parcel.readString(), SearchOptions.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), (SearchRequestContext) parcel.readParcelable(RequestOptions.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new ResponseInfo(RequestOptions.CREATOR.createFromParcel(parcel), (BaseSearchResponse) parcel.readParcelable(ResponseInfo.class.getClassLoader()), parcel.readInt() != 0);
                case 3:
                    parcel.getClass();
                    Point point = (Point) parcel.readSerializable();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        ArrayList arrayList7 = new ArrayList(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            arrayList7.add(parcel.readParcelable(ReverseGeoOptions.class.getClassLoader()));
                        }
                        arrayList = arrayList7;
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i3 = parcel.readInt();
                        ArrayList arrayList8 = new ArrayList(i3);
                        for (int i4 = 0; i4 != i3; i4++) {
                            arrayList8.add(parcel.readParcelable(ReverseGeoOptions.class.getClassLoader()));
                        }
                        arrayList2 = arrayList8;
                    }
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    ReverseMode reverseModeValueOf = parcel.readInt() == 0 ? null : ReverseMode.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        arrayList3 = null;
                    } else {
                        int i5 = parcel.readInt();
                        ArrayList arrayList9 = new ArrayList(i5);
                        for (int i6 = 0; i6 != i5; i6++) {
                            arrayList9.add(QueryType.valueOf(parcel.readString()));
                        }
                        arrayList3 = arrayList9;
                    }
                    return new ReverseGeoOptions(point, arrayList, arrayList2, numValueOf, reverseModeValueOf, arrayList3, parcel.createStringArrayList());
                case 4:
                    parcel.getClass();
                    int i7 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        arrayList10.add(parcel.readSerializable());
                    }
                    return new RouteOptions(arrayList10, (RouteOptions.Deviation) parcel.readParcelable(RouteOptions.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new SearchNavigationOptions((NavigationProfile) parcel.readParcelable(SearchNavigationOptions.class.getClassLoader()), parcel.readInt() == 0 ? null : EtaType.CREATOR.createFromParcel(parcel));
                case 6:
                    parcel.getClass();
                    Point point2 = (Point) parcel.readSerializable();
                    BoundingBox boundingBox = (BoundingBox) parcel.readSerializable();
                    if (parcel.readInt() == 0) {
                        arrayList4 = null;
                    } else {
                        int i9 = parcel.readInt();
                        ArrayList arrayList11 = new ArrayList(i9);
                        for (int i10 = 0; i10 != i9; i10++) {
                            arrayList11.add(parcel.readParcelable(SearchOptions.class.getClassLoader()));
                        }
                        arrayList4 = arrayList11;
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        arrayList5 = null;
                    } else {
                        int i11 = parcel.readInt();
                        ArrayList arrayList12 = new ArrayList(i11);
                        for (int i12 = 0; i12 != i11; i12++) {
                            arrayList12.add(parcel.readParcelable(SearchOptions.class.getClassLoader()));
                        }
                        arrayList5 = arrayList12;
                    }
                    Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        arrayList6 = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList13 = new ArrayList(i13);
                        for (int i14 = 0; i14 != i13; i14++) {
                            arrayList13.add(QueryType.valueOf(parcel.readString()));
                        }
                        arrayList6 = arrayList13;
                    }
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Point point3 = (Point) parcel.readSerializable();
                    SearchNavigationOptions searchNavigationOptionsCreateFromParcel = parcel.readInt() == 0 ? null : SearchNavigationOptions.CREATOR.createFromParcel(parcel);
                    RouteOptions routeOptionsCreateFromParcel = parcel.readInt() == 0 ? null : RouteOptions.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i15 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                        for (int i16 = 0; i16 != i15; i16++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readString());
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new SearchOptions(point2, boundingBox, arrayList4, boolValueOf, arrayList5, numValueOf2, arrayList6, arrayListCreateStringArrayList, numValueOf3, point3, searchNavigationOptionsCreateFromParcel, routeOptionsCreateFromParcel, linkedHashMap, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                default:
                    parcel.getClass();
                    return new SearchResultMetadata((ResultMetadata) parcel.readSerializable());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new EtaType[i];
                case 1:
                    return new RequestOptions[i];
                case 2:
                    return new ResponseInfo[i];
                case 3:
                    return new ReverseGeoOptions[i];
                case 4:
                    return new RouteOptions[i];
                case 5:
                    return new SearchNavigationOptions[i];
                case 6:
                    return new SearchOptions[i];
                default:
                    return new SearchResultMetadata[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.rawName.hashCode();
    }

    static {
        new EtaType("navigation");
    }

    public EtaType(String str) {
        str.getClass();
        this.rawName = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.rawName);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("EtaType(rawName='"), this.rawName, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EtaType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rawName, ((EtaType) obj).rawName}, getCieXyz.write())).booleanValue();
    }
}
