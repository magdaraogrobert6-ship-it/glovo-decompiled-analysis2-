package com.mapbox.maps.plugin.logo.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import java.util.Objects;
import o.isCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class LogoSettings implements Parcelable {
    public static final Parcelable.Creator<LogoSettings> CREATOR = new Vw.yn(5);
    public final boolean enabled;
    public final float marginBottom;
    public final float marginLeft;
    public final float marginRight;
    public final float marginTop;
    public final int position;

    public final class Builder {
        public boolean enabled;
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

    public LogoSettings(boolean z, int i, float f, float f2, float f3, float f4) {
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
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("LogoSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LogoSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LogoSettings logoSettings = (LogoSettings) obj;
        return this.enabled == logoSettings.enabled && this.position == logoSettings.position && Float.compare(this.marginLeft, logoSettings.marginLeft) == 0 && Float.compare(this.marginTop, logoSettings.marginTop) == 0 && Float.compare(this.marginRight, logoSettings.marginRight) == 0 && Float.compare(this.marginBottom, logoSettings.marginBottom) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom));
    }
}
