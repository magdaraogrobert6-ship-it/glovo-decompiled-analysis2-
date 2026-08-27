package com.mapbox.search.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenPeriod implements Parcelable {
    public static final Parcelable.Creator<OpenPeriod> CREATOR = new Vw.yn(24);
    public final WeekTimestamp closed;
    public final WeekTimestamp open;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.closed.hashCode() + (this.open.hashCode() * 31);
    }

    public OpenPeriod(WeekTimestamp weekTimestamp, WeekTimestamp weekTimestamp2) {
        weekTimestamp.getClass();
        weekTimestamp2.getClass();
        this.open = weekTimestamp;
        this.closed = weekTimestamp2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.open.writeToParcel(parcel, i);
        this.closed.writeToParcel(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenPeriod)) {
            return false;
        }
        OpenPeriod openPeriod = (OpenPeriod) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.open, openPeriod.open}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.closed, openPeriod.closed}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "OpenPeriod(open=" + this.open + ", closed=" + this.closed + ')';
    }
}
