package com.mapbox.maps.plugin.indoorselector.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.maps.MapboxExperimental;
import java.util.Objects;
import o.isCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
public final class IndoorSelectorSettings implements Parcelable {
    public static final Parcelable.Creator<IndoorSelectorSettings> CREATOR = new Vw.yn(4);
    public final boolean enabled;
    public final float marginBottom;
    public final float marginLeft;
    public final float marginRight;
    public final float marginTop;
    public final int position;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IndoorSelectorSettings(boolean z, int i, float f, float f2, float f3, float f4) {
        this.enabled = z;
        this.position = i;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
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
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("IndoorSelectorSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IndoorSelectorSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        IndoorSelectorSettings indoorSelectorSettings = (IndoorSelectorSettings) obj;
        return this.enabled == indoorSelectorSettings.enabled && this.position == indoorSelectorSettings.position && Float.compare(this.marginLeft, indoorSelectorSettings.marginLeft) == 0 && Float.compare(this.marginTop, indoorSelectorSettings.marginTop) == 0 && Float.compare(this.marginRight, indoorSelectorSettings.marginRight) == 0 && Float.compare(this.marginBottom, indoorSelectorSettings.marginBottom) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom));
    }
}
