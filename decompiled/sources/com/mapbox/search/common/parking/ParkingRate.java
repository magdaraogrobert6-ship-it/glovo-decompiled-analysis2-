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
public final class ParkingRate implements Parcelable {
    public static final Parcelable.Creator<ParkingRate> CREATOR = new Vw.yn(28);
    public final String maxStay;
    public final List prices;
    public final List times;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.maxStay;
        int iHashCode = str != null ? str.hashCode() : 0;
        List list = this.times;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        List list2 = this.prices;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public ParkingRate(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.maxStay = str;
        this.times = arrayList;
        this.prices = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.maxStay);
        List list = this.times;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ParkingRateTime) it.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.prices;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ParkingRatePrice) it2.next()).writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParkingRate(maxStay=");
        sb.append(this.maxStay);
        sb.append(", times=");
        sb.append(this.times);
        sb.append(", prices=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.prices, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParkingRate.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ParkingRate parkingRate = (ParkingRate) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.maxStay, parkingRate.maxStay}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.times, parkingRate.times}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.prices, parkingRate.prices}, getCieXyz.write())).booleanValue();
    }
}
