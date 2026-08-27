package com.mapbox.maps.plugin.attribution.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import java.util.Objects;
import o.isCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributionSettings implements Parcelable {
    public static final Parcelable.Creator<AttributionSettings> CREATOR = new zza(18);
    public final boolean clickable;
    public final boolean enabled;
    public final int iconColor;
    public final float marginBottom;
    public final float marginLeft;
    public final float marginRight;
    public final float marginTop;
    public final int position;

    public final class Builder {
        public boolean clickable;
        public boolean enabled;
        public int iconColor;
        public float marginBottom;
        public float marginLeft;
        public float marginRight;
        public float marginTop;
        public int position;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AttributionSettings(boolean z, int i, int i2, float f, float f2, float f3, float f4, boolean z2) {
        this.enabled = z;
        this.iconColor = i;
        this.position = i2;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
        this.clickable = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.iconColor);
        parcel.writeInt(this.position);
        parcel.writeFloat(this.marginLeft);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginRight);
        parcel.writeFloat(this.marginBottom);
        parcel.writeInt(this.clickable ? 1 : 0);
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("AttributionSettings(enabled=" + this.enabled + ", iconColor=" + this.iconColor + ",\n      position=" + this.position + ", marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ", clickable=" + this.clickable + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttributionSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AttributionSettings attributionSettings = (AttributionSettings) obj;
        return this.enabled == attributionSettings.enabled && this.iconColor == attributionSettings.iconColor && this.position == attributionSettings.position && Float.compare(this.marginLeft, attributionSettings.marginLeft) == 0 && Float.compare(this.marginTop, attributionSettings.marginTop) == 0 && Float.compare(this.marginRight, attributionSettings.marginRight) == 0 && Float.compare(this.marginBottom, attributionSettings.marginBottom) == 0 && this.clickable == attributionSettings.clickable;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.iconColor), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom), Boolean.valueOf(this.clickable));
    }
}
