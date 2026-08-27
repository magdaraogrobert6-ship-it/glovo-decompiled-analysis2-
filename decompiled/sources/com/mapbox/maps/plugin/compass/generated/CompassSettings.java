package com.mapbox.maps.plugin.compass.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import com.mapbox.maps.ImageHolder;
import java.util.Objects;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CompassSettings implements Parcelable {
    public static final Parcelable.Creator<CompassSettings> CREATOR = new zza(19);
    public final boolean clickable;
    public final boolean enabled;
    public final boolean fadeWhenFacingNorth;
    public final ImageHolder image;
    public final float marginBottom;
    public final float marginLeft;
    public final float marginRight;
    public final float marginTop;
    public final float opacity;
    public final int position;
    public final float rotation;
    public final boolean visibility;

    public final class Builder {
        public ImageHolder image;
        public float rotation;
        public boolean enabled = true;
        public int position = 8388661;
        public float marginLeft = 4.0f;
        public float marginTop = 4.0f;
        public float marginRight = 4.0f;
        public float marginBottom = 4.0f;
        public float opacity = 1.0f;
        public boolean visibility = true;
        public boolean fadeWhenFacingNorth = true;
        public boolean clickable = true;

        public final CompassSettings build() {
            return new CompassSettings(this.enabled, this.position, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, this.opacity, this.rotation, this.visibility, this.fadeWhenFacingNorth, this.clickable, this.image);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.position = this.position;
        builder.marginLeft = this.marginLeft;
        builder.marginTop = this.marginTop;
        builder.marginRight = this.marginRight;
        builder.marginBottom = this.marginBottom;
        builder.opacity = this.opacity;
        builder.rotation = this.rotation;
        builder.visibility = this.visibility;
        builder.fadeWhenFacingNorth = this.fadeWhenFacingNorth;
        builder.clickable = this.clickable;
        builder.image = this.image;
        return builder;
    }

    public CompassSettings(boolean z, int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3, boolean z4, ImageHolder imageHolder) {
        this.enabled = z;
        this.position = i;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
        this.opacity = f5;
        this.rotation = f6;
        this.visibility = z2;
        this.fadeWhenFacingNorth = z3;
        this.clickable = z4;
        this.image = imageHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.position);
        parcel.writeFloat(this.marginLeft);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginRight);
        parcel.writeFloat(this.marginBottom);
        parcel.writeFloat(this.opacity);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.visibility ? 1 : 0);
        parcel.writeInt(this.fadeWhenFacingNorth ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        ImageHolder imageHolder = this.image;
        if (imageHolder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder.writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("CompassSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ", opacity=" + this.opacity + ", rotation=" + this.rotation + ", visibility=" + this.visibility + ",\n      fadeWhenFacingNorth=" + this.fadeWhenFacingNorth + ", clickable=" + this.clickable + ", image=" + this.image + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CompassSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        CompassSettings compassSettings = (CompassSettings) obj;
        if (this.enabled == compassSettings.enabled && this.position == compassSettings.position && Float.compare(this.marginLeft, compassSettings.marginLeft) == 0 && Float.compare(this.marginTop, compassSettings.marginTop) == 0 && Float.compare(this.marginRight, compassSettings.marginRight) == 0 && Float.compare(this.marginBottom, compassSettings.marginBottom) == 0 && Float.compare(this.opacity, compassSettings.opacity) == 0 && Float.compare(this.rotation, compassSettings.rotation) == 0 && this.visibility == compassSettings.visibility && this.fadeWhenFacingNorth == compassSettings.fadeWhenFacingNorth && this.clickable == compassSettings.clickable) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.image, compassSettings.image}, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.enabled;
        int i = this.position;
        float f = this.marginLeft;
        float f2 = this.marginTop;
        float f3 = this.marginRight;
        float f4 = this.marginBottom;
        float f5 = this.opacity;
        float f6 = this.rotation;
        boolean z2 = this.visibility;
        boolean z3 = this.fadeWhenFacingNorth;
        boolean z4 = this.clickable;
        return Objects.hash(Boolean.valueOf(z), Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), this.image);
    }
}
