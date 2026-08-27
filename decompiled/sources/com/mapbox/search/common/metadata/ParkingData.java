package com.mapbox.search.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes3.dex */
public final class ParkingData implements Parcelable {
    public static final Parcelable.Creator<ParkingData> CREATOR = new Vw.yn(25);
    public final int reservedForDisabilities;
    public final int totalCapacity;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParkingData(int i, int i2) {
        this.totalCapacity = i;
        this.reservedForDisabilities = i2;
        if (i < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Negative `totalCapacity`: "));
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i2, "Negative `reservedForDisabilities`: "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.totalCapacity);
        parcel.writeInt(this.reservedForDisabilities);
    }

    public final int hashCode() {
        return (this.totalCapacity * 31) + this.reservedForDisabilities;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParkingData(totalCapacity=");
        sb.append(this.totalCapacity);
        sb.append(", reservedForDisabilities=");
        return af$$ExternalSyntheticOutline0.m(sb, this.reservedForDisabilities, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParkingData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ParkingData parkingData = (ParkingData) obj;
        return this.totalCapacity == parkingData.totalCapacity && this.reservedForDisabilities == parkingData.reservedForDisabilities;
    }
}
