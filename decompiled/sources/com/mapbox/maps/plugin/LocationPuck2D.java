package com.mapbox.maps.plugin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import com.mapbox.maps.ImageHolder;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationPuck2D extends LocationPuck {
    public static final Parcelable.Creator<LocationPuck2D> CREATOR = new zza(17);
    public final ImageHolder bearingImage;
    public final float opacity;
    public final String scaleExpression;
    public final ImageHolder shadowImage;
    public final ImageHolder topImage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        ImageHolder imageHolder = this.topImage;
        int iHashCode = imageHolder == null ? 0 : imageHolder.hashCode();
        ImageHolder imageHolder2 = this.bearingImage;
        int iHashCode2 = imageHolder2 == null ? 0 : imageHolder2.hashCode();
        ImageHolder imageHolder3 = this.shadowImage;
        int iHashCode3 = imageHolder3 == null ? 0 : imageHolder3.hashCode();
        String str = this.scaleExpression;
        return Float.hashCode(this.opacity) + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationPuck2D)) {
            return false;
        }
        LocationPuck2D locationPuck2D = (LocationPuck2D) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.topImage, locationPuck2D.topImage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bearingImage, locationPuck2D.bearingImage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shadowImage, locationPuck2D.shadowImage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scaleExpression, locationPuck2D.scaleExpression}, getCieXyz.write())).booleanValue() && Float.compare(this.opacity, locationPuck2D.opacity) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationPuck2D(topImage=");
        sb.append(this.topImage);
        sb.append(", bearingImage=");
        sb.append(this.bearingImage);
        sb.append(", shadowImage=");
        sb.append(this.shadowImage);
        sb.append(", scaleExpression=");
        sb.append(this.scaleExpression);
        sb.append(", opacity=");
        return MediaSessionCompatQueueItem.serializer(sb, this.opacity, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ImageHolder imageHolder = this.topImage;
        if (imageHolder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder.writeToParcel(parcel, i);
        }
        ImageHolder imageHolder2 = this.bearingImage;
        if (imageHolder2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder2.writeToParcel(parcel, i);
        }
        ImageHolder imageHolder3 = this.shadowImage;
        if (imageHolder3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.scaleExpression);
        parcel.writeFloat(this.opacity);
    }

    public /* synthetic */ LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, int i) {
        this((i & 1) != 0 ? null : imageHolder, imageHolder2, (i & 4) != 0 ? null : imageHolder3, null, 1.0f);
    }

    public LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, float f) {
        this.topImage = imageHolder;
        this.bearingImage = imageHolder2;
        this.shadowImage = imageHolder3;
        this.scaleExpression = str;
        this.opacity = f;
    }
}
