package com.mapbox.search.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.geojson.Point;
import java.util.Objects;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ChildMetadata implements Parcelable {
    public static final Parcelable.Creator<ChildMetadata> CREATOR = new Vw.yn(22);
    public final String category;
    public final Point coordinates;
    public final String mapboxId;
    public final String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Objects.hash(this.mapboxId, this.name, this.category, this.coordinates);
    }

    public ChildMetadata(String str, Point point, String str2, String str3) {
        str.getClass();
        this.mapboxId = str;
        this.name = str2;
        this.category = str3;
        this.coordinates = point;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.mapboxId);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeSerializable(this.coordinates);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildMetadata)) {
            return false;
        }
        ChildMetadata childMetadata = (ChildMetadata) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mapboxId, childMetadata.mapboxId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, childMetadata.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.category, childMetadata.category}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinates, childMetadata.coordinates}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ChildMetadata(mapboxId=" + this.mapboxId + ", name=" + this.name + ", category=" + this.category + "coordinates=" + this.coordinates + ')';
    }
}
