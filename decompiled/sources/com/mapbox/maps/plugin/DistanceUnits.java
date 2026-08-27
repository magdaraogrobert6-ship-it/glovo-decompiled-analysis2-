package com.mapbox.maps.plugin;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DistanceUnits implements Parcelable {
    public final int ordinal;
    public final String value;
    public static final Parcelable.Creator<DistanceUnits> CREATOR = new Vw.yn(2);
    public static final DistanceUnits METRIC = new DistanceUnits("metric");
    public static final DistanceUnits IMPERIAL = new DistanceUnits("imperial");
    public static final DistanceUnits NAUTICAL = new DistanceUnits("nautical");

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    public DistanceUnits(String str) {
        int i;
        str.getClass();
        this.value = str;
        int iHashCode = str.hashCode();
        if (iHashCode != -1077545552) {
            if (iHashCode != -431614405) {
                if (iHashCode == 2084085079 && str.equals("nautical")) {
                    i = 2;
                } else {
                    i = -1;
                }
            } else if (str.equals("imperial")) {
                i = 1;
            } else {
                i = -1;
            }
        } else if (str.equals("metric")) {
            i = 0;
        } else {
            i = -1;
        }
        this.ordinal = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DistanceUnits)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((DistanceUnits) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("DistanceUnits(value="), this.value, ')');
    }
}
