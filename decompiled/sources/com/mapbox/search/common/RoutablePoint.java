package com.mapbox.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import com.mapbox.geojson.Point;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class RoutablePoint implements Parcelable {
    public static final Parcelable.Creator<RoutablePoint> CREATOR = new Vw.yn(19);
    public final String name;
    public final Point point;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.point.hashCode() * 31);
    }

    public RoutablePoint(Point point, String str) {
        point.getClass();
        str.getClass();
        this.point = point;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.point);
        parcel.writeString(this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutablePoint(point=");
        sb.append(this.point);
        sb.append(", name='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.name, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutablePoint.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoutablePoint routablePoint = (RoutablePoint) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.point, routablePoint.point}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, routablePoint.name}, getCieXyz.write())).booleanValue();
    }
}
