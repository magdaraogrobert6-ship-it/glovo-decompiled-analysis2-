package com.mapbox.search.common.parking;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.search.result.SearchResult;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@MapboxExperimental
public final class ParkingRatePrice implements Parcelable {
    public static final Parcelable.Creator<ParkingRatePrice> CREATOR = new SearchResult.Creator(1);
    public final Double amount;
    public final String type;
    public final ParkingRateValue value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = str != null ? str.hashCode() : 0;
        Double d = this.amount;
        int iHashCode2 = d != null ? d.hashCode() : 0;
        ParkingRateValue parkingRateValue = this.value;
        return (((iHashCode * 31) + iHashCode2) * 31) + (parkingRateValue != null ? parkingRateValue.hashCode() : 0);
    }

    public ParkingRatePrice(String str, Double d, ParkingRateValue parkingRateValue) {
        this.type = str;
        this.amount = d;
        this.value = parkingRateValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.type);
        Double d = this.amount;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeParcelable(this.value, i);
    }

    public final String toString() {
        return "ParkingRatePrice(type=" + this.type + ", amount=" + this.amount + ", value=" + this.value + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParkingRatePrice.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ParkingRatePrice parkingRatePrice = (ParkingRatePrice) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, parkingRatePrice.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Double d = parkingRatePrice.amount;
        Double d2 = this.amount;
        if (d2 != null ? !(d != null && Double.compare(d2.doubleValue(), d.doubleValue()) == 0) : d != null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, parkingRatePrice.value}, getCieXyz.write())).booleanValue();
    }
}
