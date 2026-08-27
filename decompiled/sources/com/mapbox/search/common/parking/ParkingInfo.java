package com.mapbox.search.common.parking;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.annotation.MapboxExperimental;
import java.util.ArrayList;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@MapboxExperimental
public final class ParkingInfo implements Parcelable {
    public static final Parcelable.Creator<ParkingInfo> CREATOR = new Vw.yn(27);
    public final Integer availability;
    public final String availabilityLevel;
    public final String availabilityUpdatedAt;
    public final Integer capacity;
    public final List paymentMethods;
    public final List paymentTypes;
    public final ParkingRateInfo rateInfo;
    public final List restrictions;
    public final String trend;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Integer num = this.capacity;
        int iIntValue = num != null ? num.intValue() : 0;
        ParkingRateInfo parkingRateInfo = this.rateInfo;
        int iHashCode = parkingRateInfo != null ? parkingRateInfo.hashCode() : 0;
        Integer num2 = this.availability;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String str = this.availabilityLevel;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.availabilityUpdatedAt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.trend;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        List list = this.paymentMethods;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        List list2 = this.paymentTypes;
        int iHashCode6 = list2 != null ? list2.hashCode() : 0;
        List list3 = this.restrictions;
        return (((((((((((((((iIntValue * 31) + iHashCode) * 31) + iIntValue2) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public ParkingInfo(Integer num, ParkingRateInfo parkingRateInfo, Integer num2, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.capacity = num;
        this.rateInfo = parkingRateInfo;
        this.availability = num2;
        this.availabilityLevel = str;
        this.availabilityUpdatedAt = str2;
        this.trend = str3;
        this.paymentMethods = arrayList;
        this.paymentTypes = arrayList2;
        this.restrictions = arrayList3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParkingInfo(capacity=");
        sb.append(this.capacity);
        sb.append(", rateInfo=");
        sb.append(this.rateInfo);
        sb.append(", availability=");
        sb.append(this.availability);
        sb.append(", availabilityLevel=");
        sb.append(this.availabilityLevel);
        sb.append(", availabilityUpdatedAt=");
        sb.append(this.availabilityUpdatedAt);
        sb.append(", trend=");
        sb.append(this.trend);
        sb.append(", paymentMethods=");
        sb.append(this.paymentMethods);
        sb.append(", paymentTypes=");
        sb.append(this.paymentTypes);
        sb.append(", restrictions=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.restrictions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.capacity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ParkingRateInfo parkingRateInfo = this.rateInfo;
        if (parkingRateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parkingRateInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.availability;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.availabilityLevel);
        parcel.writeString(this.availabilityUpdatedAt);
        parcel.writeString(this.trend);
        parcel.writeStringList(this.paymentMethods);
        parcel.writeStringList(this.paymentTypes);
        parcel.writeStringList(this.restrictions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParkingInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ParkingInfo parkingInfo = (ParkingInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.capacity, parkingInfo.capacity}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rateInfo, parkingInfo.rateInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.availability, parkingInfo.availability}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.availabilityLevel, parkingInfo.availabilityLevel}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.availabilityUpdatedAt, parkingInfo.availabilityUpdatedAt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trend, parkingInfo.trend}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentMethods, parkingInfo.paymentMethods}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentTypes, parkingInfo.paymentTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.restrictions, parkingInfo.restrictions}, getCieXyz.write())).booleanValue();
    }
}
