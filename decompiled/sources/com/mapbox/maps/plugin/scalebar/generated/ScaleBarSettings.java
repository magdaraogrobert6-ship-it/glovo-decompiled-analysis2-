package com.mapbox.maps.plugin.scalebar.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.maps.plugin.DistanceUnits;
import java.util.Objects;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleBarSettings implements Parcelable {
    public static final Parcelable.Creator<ScaleBarSettings> CREATOR = new Vw.yn(6);
    public final float borderWidth;
    public final DistanceUnits distanceUnits;
    public final boolean enabled;
    public final float height;
    public final boolean isMetricUnits;
    public final float marginBottom;
    public final float marginLeft;
    public final float marginRight;
    public final float marginTop;
    public final int position;
    public final int primaryColor;
    public final float ratio;
    public final long refreshInterval;
    public final int secondaryColor;
    public final boolean showTextBorder;
    public final float textBarMargin;
    public final float textBorderWidth;
    public final int textColor;
    public final float textSize;
    public final boolean useContinuousRendering;

    public final class Builder {
        public float borderWidth;
        public DistanceUnits distanceUnits;
        public boolean enabled;
        public float height;
        public boolean isMetricUnits;
        public float marginBottom;
        public float marginLeft;
        public float marginRight;
        public float marginTop;
        public int position;
        public int primaryColor;
        public float ratio;
        public long refreshInterval;
        public int secondaryColor;
        public boolean showTextBorder;
        public float textBarMargin;
        public float textBorderWidth;
        public int textColor;
        public float textSize;
        public boolean useContinuousRendering;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        boolean z = this.enabled;
        int i = this.position;
        float f = this.marginLeft;
        float f2 = this.marginTop;
        float f3 = this.marginRight;
        float f4 = this.marginBottom;
        int i2 = this.textColor;
        int i3 = this.primaryColor;
        int i4 = this.secondaryColor;
        float f5 = this.borderWidth;
        float f6 = this.height;
        float f7 = this.textBarMargin;
        float f8 = this.textBorderWidth;
        float f9 = this.textSize;
        boolean z2 = this.isMetricUnits;
        long j = this.refreshInterval;
        boolean z3 = this.showTextBorder;
        float f10 = this.ratio;
        boolean z4 = this.useContinuousRendering;
        return Objects.hash(Boolean.valueOf(z), Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), Float.valueOf(f9), Boolean.valueOf(z2), this.distanceUnits, Long.valueOf(j), Boolean.valueOf(z3), Float.valueOf(f10), Boolean.valueOf(z4));
    }

    public ScaleBarSettings(boolean z, int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, float f5, float f6, float f7, float f8, float f9, boolean z2, DistanceUnits distanceUnits, long j, boolean z3, float f10, boolean z4) {
        this.enabled = z;
        this.position = i;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
        this.textColor = i2;
        this.primaryColor = i3;
        this.secondaryColor = i4;
        this.borderWidth = f5;
        this.height = f6;
        this.textBarMargin = f7;
        this.textBorderWidth = f8;
        this.textSize = f9;
        this.isMetricUnits = z2;
        this.distanceUnits = distanceUnits;
        this.refreshInterval = j;
        this.showTextBorder = z3;
        this.ratio = f10;
        this.useContinuousRendering = z4;
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
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.primaryColor);
        parcel.writeInt(this.secondaryColor);
        parcel.writeFloat(this.borderWidth);
        parcel.writeFloat(this.height);
        parcel.writeFloat(this.textBarMargin);
        parcel.writeFloat(this.textBorderWidth);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.isMetricUnits ? 1 : 0);
        DistanceUnits distanceUnits = this.distanceUnits;
        distanceUnits.getClass();
        parcel.writeString(distanceUnits.value);
        parcel.writeLong(this.refreshInterval);
        parcel.writeInt(this.showTextBorder ? 1 : 0);
        parcel.writeFloat(this.ratio);
        parcel.writeInt(this.useContinuousRendering ? 1 : 0);
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("ScaleBarSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ", textColor=" + this.textColor + ", primaryColor=" + this.primaryColor + ",\n      secondaryColor=" + this.secondaryColor + ", borderWidth=" + this.borderWidth + ", height=" + this.height + ",\n      textBarMargin=" + this.textBarMargin + ", textBorderWidth=" + this.textBorderWidth + ", textSize=" + this.textSize + ",\n      isMetricUnits=" + this.isMetricUnits + ", distanceUnits=" + this.distanceUnits + ", refreshInterval=" + this.refreshInterval + ",\n      showTextBorder=" + this.showTextBorder + ", ratio=" + this.ratio + ",\n      useContinuousRendering=" + this.useContinuousRendering + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ScaleBarSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ScaleBarSettings scaleBarSettings = (ScaleBarSettings) obj;
        if (this.enabled == scaleBarSettings.enabled && this.position == scaleBarSettings.position && Float.compare(this.marginLeft, scaleBarSettings.marginLeft) == 0 && Float.compare(this.marginTop, scaleBarSettings.marginTop) == 0 && Float.compare(this.marginRight, scaleBarSettings.marginRight) == 0 && Float.compare(this.marginBottom, scaleBarSettings.marginBottom) == 0 && this.textColor == scaleBarSettings.textColor && this.primaryColor == scaleBarSettings.primaryColor && this.secondaryColor == scaleBarSettings.secondaryColor && Float.compare(this.borderWidth, scaleBarSettings.borderWidth) == 0 && Float.compare(this.height, scaleBarSettings.height) == 0 && Float.compare(this.textBarMargin, scaleBarSettings.textBarMargin) == 0 && Float.compare(this.textBorderWidth, scaleBarSettings.textBorderWidth) == 0 && Float.compare(this.textSize, scaleBarSettings.textSize) == 0 && this.isMetricUnits == scaleBarSettings.isMetricUnits) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.distanceUnits, scaleBarSettings.distanceUnits}, getCieXyz.write())).booleanValue() && this.refreshInterval == scaleBarSettings.refreshInterval && this.showTextBorder == scaleBarSettings.showTextBorder && Float.compare(this.ratio, scaleBarSettings.ratio) == 0 && this.useContinuousRendering == scaleBarSettings.useContinuousRendering) {
                return true;
            }
        }
        return false;
    }
}
