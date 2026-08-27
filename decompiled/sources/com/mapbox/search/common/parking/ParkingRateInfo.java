package com.mapbox.search.common.parking;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.annotation.MapboxExperimental;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@MapboxExperimental
public final class ParkingRateInfo implements Parcelable {
    public static final Parcelable.Creator<ParkingRateInfo> CREATOR = new Vw.yn(29);
    public final String currencyCode;
    public final String currencySymbol;
    public final List rates;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.currencySymbol;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.currencyCode;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        List list = this.rates;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public ParkingRateInfo(String str, String str2, ArrayList arrayList) {
        this.currencySymbol = str;
        this.currencyCode = str2;
        this.rates = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.currencySymbol);
        parcel.writeString(this.currencyCode);
        List list = this.rates;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ParkingRate) it.next()).writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParkingRateInfo(currencySymbol=");
        sb.append(this.currencySymbol);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", rates=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.rates, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParkingRateInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ParkingRateInfo parkingRateInfo = (ParkingRateInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currencySymbol, parkingRateInfo.currencySymbol}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currencyCode, parkingRateInfo.currencyCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rates, parkingRateInfo.rates}, getCieXyz.write())).booleanValue();
    }
}
