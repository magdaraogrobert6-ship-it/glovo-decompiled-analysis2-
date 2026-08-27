package com.huawei.location.resp;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.ModelElevationReference;
import com.mapbox.maps.plugin.ModelScaleMode;
import com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettings;
import com.mapbox.maps.plugin.logo.generated.LogoSettings;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.record.BaseIndexableRecord;
import com.mapbox.search.base.result.BaseIndexableRecordSearchResultImpl;
import com.mapbox.search.base.result.BaseRawSearchResult;
import com.mapbox.search.base.result.BaseSearchResponse;
import com.mapbox.search.base.result.BaseSearchResultType;
import com.mapbox.search.base.result.BaseServerSearchResultImpl;
import com.mapbox.search.base.result.BaseSuggestAction;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.base.utils.orientation.ScreenOrientation;
import com.mapbox.search.common.IsoCountryCode;
import com.mapbox.search.common.IsoLanguageCode;
import com.mapbox.search.common.NavigationProfile;
import com.mapbox.search.common.RoutablePoint;
import com.mapbox.search.common.SearchAddressCountry;
import com.mapbox.search.common.SearchAddressRegion;
import com.mapbox.search.common.metadata.ChildMetadata;
import com.mapbox.search.common.metadata.ImageInfo;
import com.mapbox.search.common.metadata.OpenPeriod;
import com.mapbox.search.common.metadata.ParkingData;
import com.mapbox.search.common.metadata.WeekDay;
import com.mapbox.search.common.metadata.WeekTimestamp;
import com.mapbox.search.common.parking.ParkingInfo;
import com.mapbox.search.common.parking.ParkingRate;
import com.mapbox.search.common.parking.ParkingRateInfo;
import com.mapbox.search.common.parking.ParkingRatePrice;
import com.mapbox.search.common.parking.ParkingRateTime;
import com.mapbox.search.internal.bindgen.ApiType;
import com.mapbox.search.internal.bindgen.RequestOptions;
import com.mapbox.search.internal.bindgen.ResultAccuracy;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.ResultType;
import com.mapbox.search.internal.bindgen.SearchAddress;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Vw implements Parcelable {
    public static final Parcelable.Creator<Vw> CREATOR = new yn(0);
    public ArrayList RemoteActionCompatParcelizer;

    public final class yn implements Parcelable.Creator {
        public final /* synthetic */ int serializer;

        public /* synthetic */ yn(int i) {
            this.serializer = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            switch (this.serializer) {
                case 0:
                    Vw vw = new Vw();
                    vw.RemoteActionCompatParcelizer = parcel.createTypedArrayList(com.huawei.location.resp.yn.CREATOR);
                    return vw;
                case 1:
                    com.huawei.location.resp.yn ynVar = new com.huawei.location.resp.yn();
                    if (ynVar.IconCompatParcelizer == null) {
                        ynVar.IconCompatParcelizer = new Location(parcel.readString());
                    }
                    ynVar.IconCompatParcelizer.setTime(parcel.readLong());
                    ynVar.IconCompatParcelizer.setElapsedRealtimeNanos(parcel.readLong());
                    parcel.readByte();
                    ynVar.IconCompatParcelizer.setLatitude(parcel.readDouble());
                    ynVar.IconCompatParcelizer.setLongitude(parcel.readDouble());
                    ynVar.IconCompatParcelizer.setAltitude(parcel.readDouble());
                    ynVar.IconCompatParcelizer.setSpeed(parcel.readFloat());
                    ynVar.IconCompatParcelizer.setBearing(parcel.readFloat());
                    ynVar.IconCompatParcelizer.setAccuracy(parcel.readFloat());
                    ynVar.IconCompatParcelizer.setVerticalAccuracyMeters(parcel.readFloat());
                    ynVar.IconCompatParcelizer.setSpeedAccuracyMetersPerSecond(parcel.readFloat());
                    ynVar.IconCompatParcelizer.setBearingAccuracyDegrees(parcel.readFloat());
                    ynVar.IconCompatParcelizer.setExtras(parcel.readBundle(com.huawei.location.resp.yn.class.getClassLoader()));
                    return ynVar;
                case 2:
                    parcel.getClass();
                    return new DistanceUnits(parcel.readString());
                case 3:
                    parcel.getClass();
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList8.add(Float.valueOf(parcel.readFloat()));
                    }
                    float f = parcel.readFloat();
                    int i3 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList9.add(Float.valueOf(parcel.readFloat()));
                    }
                    String string2 = parcel.readString();
                    int i5 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList10.add(Float.valueOf(parcel.readFloat()));
                    }
                    int i7 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        arrayList11.add(Float.valueOf(parcel.readFloat()));
                    }
                    return new LocationPuck3D(string, arrayList8, f, arrayList9, string2, arrayList10, arrayList11, parcel.readInt() != 0, parcel.readInt() != 0, ModelScaleMode.valueOf(parcel.readString()), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), ModelElevationReference.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new IndoorSelectorSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                case 5:
                    parcel.getClass();
                    return new LogoSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                case 6:
                    parcel.getClass();
                    return new ScaleBarSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, DistanceUnits.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readInt() != 0);
                case 7:
                    parcel.getClass();
                    return new BaseRequestOptions((RequestOptions) parcel.readSerializable(), SearchRequestContext.CREATOR.createFromParcel(parcel));
                case 8:
                    parcel.getClass();
                    return new BaseResponseInfo(BaseRequestOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BaseSearchResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                case 9:
                    parcel.getClass();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    SearchAddress searchAddress = (SearchAddress) parcel.readSerializable();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i9 = parcel.readInt();
                        ArrayList arrayList12 = new ArrayList(i9);
                        for (int i10 = 0; i10 != i9; i10++) {
                            arrayList12.add(parcel.readSerializable());
                        }
                        arrayList = arrayList12;
                    }
                    return new BaseIndexableRecord(string3, string4, string5, searchAddress, arrayList, parcel.createStringArrayList(), parcel.readString(), (Point) parcel.readSerializable(), BaseSearchResultType.valueOf(parcel.readString()), (ResultMetadata) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readParcelable(BaseIndexableRecord.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new BaseIndexableRecordSearchResultImpl(BaseIndexableRecord.CREATOR.createFromParcel(parcel), BaseRawSearchResult.CREATOR.createFromParcel(parcel), BaseRequestOptions.CREATOR.createFromParcel(parcel));
                case 11:
                    parcel.getClass();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    int i11 = parcel.readInt();
                    ArrayList arrayList13 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList13.add(ResultType.valueOf(parcel.readString()));
                    }
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    String string8 = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        arrayList2 = new ArrayList(i13);
                        for (int i14 = 0; i14 != i13; i14++) {
                            arrayList2.add(parcel.readSerializable());
                        }
                    }
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                    Point point = (Point) parcel.readSerializable();
                    ResultAccuracy resultAccuracyValueOf = parcel.readInt() == 0 ? null : ResultAccuracy.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        arrayList3 = null;
                    } else {
                        int i15 = parcel.readInt();
                        arrayList3 = new ArrayList(i15);
                        for (int i16 = 0; i16 != i15; i16++) {
                            arrayList3.add(parcel.readSerializable());
                        }
                    }
                    BoundingBox boundingBox = (BoundingBox) parcel.readSerializable();
                    ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                    ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
                    ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    ResultMetadata resultMetadata = (ResultMetadata) parcel.readSerializable();
                    if (parcel.readInt() == 0) {
                        arrayList4 = arrayList3;
                        linkedHashMap = null;
                    } else {
                        int i17 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i17);
                        int i18 = 0;
                        while (i18 != i17) {
                            linkedHashMap2.put(parcel.readString(), parcel.readString());
                            i18++;
                            i17 = i17;
                            arrayList3 = arrayList3;
                        }
                        arrayList4 = arrayList3;
                        linkedHashMap = linkedHashMap2;
                    }
                    return new BaseRawSearchResult(string6, string7, arrayList13, arrayListCreateStringArrayList, string8, arrayListCreateStringArrayList2, arrayList2, string9, string10, string11, dValueOf, point, resultAccuracyValueOf, arrayList4, boundingBox, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, string12, string13, resultMetadata, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : BaseSuggestAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                case 12:
                    parcel.getClass();
                    return new BaseSearchResponse((BaseSearchResponse.Result) parcel.readParcelable(BaseSearchResponse.class.getClassLoader()), parcel.readString());
                case 13:
                    parcel.getClass();
                    int i19 = parcel.readInt();
                    ArrayList arrayList14 = new ArrayList(i19);
                    for (int i20 = 0; i20 != i19; i20++) {
                        arrayList14.add(BaseSearchResultType.valueOf(parcel.readString()));
                    }
                    return new BaseServerSearchResultImpl(arrayList14, BaseRawSearchResult.CREATOR.createFromParcel(parcel), BaseRequestOptions.CREATOR.createFromParcel(parcel));
                case 14:
                    parcel.getClass();
                    return new BaseSuggestAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0);
                case 15:
                    parcel.getClass();
                    return new SearchRequestContext(ApiType.valueOf(parcel.readString()), (Locale) parcel.readSerializable(), parcel.readInt() == 0 ? null : ScreenOrientation.valueOf(parcel.readString()), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new IsoCountryCode(parcel.readString());
                case 17:
                    parcel.getClass();
                    return new IsoLanguageCode(parcel.readString());
                case 18:
                    parcel.getClass();
                    return new NavigationProfile(parcel.readString());
                case 19:
                    parcel.getClass();
                    return new RoutablePoint((Point) parcel.readSerializable(), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new SearchAddressCountry(parcel.readString(), parcel.readString(), parcel.readString());
                case 21:
                    parcel.getClass();
                    return new SearchAddressRegion(parcel.readString(), parcel.readString(), parcel.readString());
                case 22:
                    parcel.getClass();
                    return new ChildMetadata(parcel.readString(), (Point) parcel.readSerializable(), parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new ImageInfo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    Parcelable.Creator<WeekTimestamp> creator = WeekTimestamp.CREATOR;
                    return new OpenPeriod(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
                case 25:
                    parcel.getClass();
                    return new ParkingData(parcel.readInt(), parcel.readInt());
                case 26:
                    parcel.getClass();
                    return new WeekTimestamp(WeekDay.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt());
                case 27:
                    parcel.getClass();
                    return new ParkingInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ParkingRateInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                case 28:
                    parcel.getClass();
                    String string14 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList5 = null;
                    } else {
                        int i21 = parcel.readInt();
                        arrayList5 = new ArrayList(i21);
                        for (int i22 = 0; i22 != i21; i22++) {
                            arrayList5.add(ParkingRateTime.CREATOR.createFromParcel(parcel));
                        }
                    }
                    if (parcel.readInt() == 0) {
                        arrayList6 = null;
                    } else {
                        int i23 = parcel.readInt();
                        ArrayList arrayList15 = new ArrayList(i23);
                        for (int i24 = 0; i24 != i23; i24++) {
                            arrayList15.add(ParkingRatePrice.CREATOR.createFromParcel(parcel));
                        }
                        arrayList6 = arrayList15;
                    }
                    return new ParkingRate(string14, arrayList5, arrayList6);
                default:
                    parcel.getClass();
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList7 = null;
                    } else {
                        int i25 = parcel.readInt();
                        ArrayList arrayList16 = new ArrayList(i25);
                        for (int i26 = 0; i26 != i25; i26++) {
                            arrayList16.add(ParkingRate.CREATOR.createFromParcel(parcel));
                        }
                        arrayList7 = arrayList16;
                    }
                    return new ParkingRateInfo(string15, string16, arrayList7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.serializer) {
                case 0:
                    return new Vw[i];
                case 1:
                    return new com.huawei.location.resp.yn[i];
                case 2:
                    return new DistanceUnits[i];
                case 3:
                    return new LocationPuck3D[i];
                case 4:
                    return new IndoorSelectorSettings[i];
                case 5:
                    return new LogoSettings[i];
                case 6:
                    return new ScaleBarSettings[i];
                case 7:
                    return new BaseRequestOptions[i];
                case 8:
                    return new BaseResponseInfo[i];
                case 9:
                    return new BaseIndexableRecord[i];
                case 10:
                    return new BaseIndexableRecordSearchResultImpl[i];
                case 11:
                    return new BaseRawSearchResult[i];
                case 12:
                    return new BaseSearchResponse[i];
                case 13:
                    return new BaseServerSearchResultImpl[i];
                case 14:
                    return new BaseSuggestAction[i];
                case 15:
                    return new SearchRequestContext[i];
                case 16:
                    return new IsoCountryCode[i];
                case 17:
                    return new IsoLanguageCode[i];
                case 18:
                    return new NavigationProfile[i];
                case 19:
                    return new RoutablePoint[i];
                case 20:
                    return new SearchAddressCountry[i];
                case 21:
                    return new SearchAddressRegion[i];
                case 22:
                    return new ChildMetadata[i];
                case 23:
                    return new ImageInfo[i];
                case 24:
                    return new OpenPeriod[i];
                case 25:
                    return new ParkingData[i];
                case 26:
                    return new WeekTimestamp[i];
                case 27:
                    return new ParkingInfo[i];
                case 28:
                    return new ParkingRate[i];
                default:
                    return new ParkingRateInfo[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Objects.hash(this.RemoteActionCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Vw) {
            return Objects.equals(this.RemoteActionCompatParcelizer, ((Vw) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline1.m(new StringBuilder("LocationResult{locations="), this.RemoteActionCompatParcelizer, '}');
    }
}
