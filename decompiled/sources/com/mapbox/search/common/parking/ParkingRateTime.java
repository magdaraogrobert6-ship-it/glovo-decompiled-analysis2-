package com.mapbox.search.common.parking;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.search.common.metadata.WeekDay;
import com.mapbox.search.result.SearchResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@MapboxExperimental
public final class ParkingRateTime implements Parcelable {
    public static final Parcelable.Creator<ParkingRateTime> CREATOR = new SearchResult.Creator(2);
    public final List days;
    public final Byte fromHour;
    public final Byte fromMinute;
    public final Byte toHour;
    public final Byte toMinute;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        List list = this.days;
        int iHashCode = list != null ? list.hashCode() : 0;
        Byte b = this.fromHour;
        byte bByteValue = b != null ? b.byteValue() : (byte) 0;
        Byte b2 = this.fromMinute;
        byte bByteValue2 = b2 != null ? b2.byteValue() : (byte) 0;
        Byte b3 = this.toHour;
        byte bByteValue3 = b3 != null ? b3.byteValue() : (byte) 0;
        Byte b4 = this.toMinute;
        return (((((((iHashCode * 31) + bByteValue) * 31) + bByteValue2) * 31) + bByteValue3) * 31) + (b4 != null ? b4.byteValue() : (byte) 0);
    }

    public ParkingRateTime(ArrayList arrayList, Byte b, Byte b2, Byte b3, Byte b4) {
        this.days = arrayList;
        this.fromHour = b;
        this.fromMinute = b2;
        this.toHour = b3;
        this.toMinute = b4;
    }

    public final String toString() {
        return "ParkingRateTime(days=" + this.days + ", fromHour=" + this.fromHour + ", fromMinute=" + this.fromMinute + ", toHour=" + this.toHour + ", toMinute=" + this.toMinute + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.days;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(((WeekDay) it.next()).name());
            }
        }
        Byte b = this.fromHour;
        if (b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeByte(b.byteValue());
        }
        Byte b2 = this.fromMinute;
        if (b2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeByte(b2.byteValue());
        }
        Byte b3 = this.toHour;
        if (b3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeByte(b3.byteValue());
        }
        Byte b4 = this.toMinute;
        if (b4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeByte(b4.byteValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParkingRateTime.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ParkingRateTime parkingRateTime = (ParkingRateTime) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.days, parkingRateTime.days}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Byte b = this.fromHour;
        Integer numValueOf = b != null ? Integer.valueOf(b.byteValue()) : null;
        Byte b2 = parkingRateTime.fromHour;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf, b2 != null ? Integer.valueOf(b2.byteValue()) : null}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Byte b3 = this.fromMinute;
        Integer numValueOf2 = b3 != null ? Integer.valueOf(b3.byteValue()) : null;
        Byte b4 = parkingRateTime.fromMinute;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf2, b4 != null ? Integer.valueOf(b4.byteValue()) : null}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Byte b5 = this.toHour;
        Integer numValueOf3 = b5 != null ? Integer.valueOf(b5.byteValue()) : null;
        Byte b6 = parkingRateTime.toHour;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf3, b6 != null ? Integer.valueOf(b6.byteValue()) : null}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Byte b7 = this.toMinute;
        Integer numValueOf4 = b7 != null ? Integer.valueOf(b7.byteValue()) : null;
        Byte b8 = parkingRateTime.toMinute;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf4, b8 != null ? Integer.valueOf(b8.byteValue()) : null}, getCieXyz.write())).booleanValue();
    }
}
