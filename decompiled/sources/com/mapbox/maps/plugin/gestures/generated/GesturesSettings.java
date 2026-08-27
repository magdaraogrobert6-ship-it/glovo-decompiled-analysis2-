package com.mapbox.maps.plugin.gestures.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import java.util.Objects;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturesSettings implements Parcelable {
    public static final Parcelable.Creator<GesturesSettings> CREATOR = new zza(20);
    public final boolean doubleTapToZoomInEnabled;
    public final boolean doubleTouchToZoomOutEnabled;
    public final ScreenCoordinate focalPoint;
    public final boolean increasePinchToZoomThresholdWhenRotating;
    public final boolean increaseRotateThresholdWhenPinchingToZoom;
    public final boolean pinchScrollEnabled;
    public final boolean pinchToZoomDecelerationEnabled;
    public final boolean pinchToZoomEnabled;
    public final boolean pitchEnabled;
    public final boolean quickZoomEnabled;
    public final boolean rotateDecelerationEnabled;
    public final boolean rotateEnabled;
    public final boolean scrollDecelerationEnabled;
    public final boolean scrollEnabled;
    public final ScrollMode scrollMode;
    public final boolean simultaneousRotateAndPinchToZoomEnabled;
    public final boolean useNativeFlingDeceleration;
    public final float zoomAnimationAmount;

    public final class Builder {
        public boolean doubleTapToZoomInEnabled;
        public boolean doubleTouchToZoomOutEnabled;
        public ScreenCoordinate focalPoint;
        public boolean increasePinchToZoomThresholdWhenRotating;
        public boolean increaseRotateThresholdWhenPinchingToZoom;
        public boolean pinchScrollEnabled;
        public boolean pinchToZoomDecelerationEnabled;
        public boolean pinchToZoomEnabled;
        public boolean pitchEnabled;
        public boolean quickZoomEnabled;
        public boolean rotateDecelerationEnabled;
        public boolean rotateEnabled;
        public boolean scrollDecelerationEnabled;
        public boolean scrollEnabled;
        public ScrollMode scrollMode;
        public boolean simultaneousRotateAndPinchToZoomEnabled;
        public boolean useNativeFlingDeceleration;
        public float zoomAnimationAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        boolean z = this.rotateEnabled;
        boolean z2 = this.pinchToZoomEnabled;
        boolean z3 = this.scrollEnabled;
        boolean z4 = this.simultaneousRotateAndPinchToZoomEnabled;
        boolean z5 = this.pitchEnabled;
        boolean z6 = this.doubleTapToZoomInEnabled;
        boolean z7 = this.doubleTouchToZoomOutEnabled;
        boolean z8 = this.quickZoomEnabled;
        boolean z9 = this.pinchToZoomDecelerationEnabled;
        boolean z10 = this.rotateDecelerationEnabled;
        boolean z11 = this.scrollDecelerationEnabled;
        boolean z12 = this.increaseRotateThresholdWhenPinchingToZoom;
        boolean z13 = this.increasePinchToZoomThresholdWhenRotating;
        float f = this.zoomAnimationAmount;
        boolean z14 = this.pinchScrollEnabled;
        boolean z15 = this.useNativeFlingDeceleration;
        return Objects.hash(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), this.scrollMode, Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), this.focalPoint, Boolean.valueOf(z9), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), Float.valueOf(f), Boolean.valueOf(z14), Boolean.valueOf(z15));
    }

    public GesturesSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ScrollMode scrollMode, boolean z6, boolean z7, boolean z8, ScreenCoordinate screenCoordinate, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, float f, boolean z14, boolean z15) {
        this.rotateEnabled = z;
        this.pinchToZoomEnabled = z2;
        this.scrollEnabled = z3;
        this.simultaneousRotateAndPinchToZoomEnabled = z4;
        this.pitchEnabled = z5;
        this.scrollMode = scrollMode;
        this.doubleTapToZoomInEnabled = z6;
        this.doubleTouchToZoomOutEnabled = z7;
        this.quickZoomEnabled = z8;
        this.focalPoint = screenCoordinate;
        this.pinchToZoomDecelerationEnabled = z9;
        this.rotateDecelerationEnabled = z10;
        this.scrollDecelerationEnabled = z11;
        this.increaseRotateThresholdWhenPinchingToZoom = z12;
        this.increasePinchToZoomThresholdWhenRotating = z13;
        this.zoomAnimationAmount = f;
        this.pinchScrollEnabled = z14;
        this.useNativeFlingDeceleration = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.rotateEnabled ? 1 : 0);
        parcel.writeInt(this.pinchToZoomEnabled ? 1 : 0);
        parcel.writeInt(this.scrollEnabled ? 1 : 0);
        parcel.writeInt(this.simultaneousRotateAndPinchToZoomEnabled ? 1 : 0);
        parcel.writeInt(this.pitchEnabled ? 1 : 0);
        parcel.writeString(this.scrollMode.name());
        parcel.writeInt(this.doubleTapToZoomInEnabled ? 1 : 0);
        parcel.writeInt(this.doubleTouchToZoomOutEnabled ? 1 : 0);
        parcel.writeInt(this.quickZoomEnabled ? 1 : 0);
        parcel.writeSerializable(this.focalPoint);
        parcel.writeInt(this.pinchToZoomDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.rotateDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.scrollDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.increaseRotateThresholdWhenPinchingToZoom ? 1 : 0);
        parcel.writeInt(this.increasePinchToZoomThresholdWhenRotating ? 1 : 0);
        parcel.writeFloat(this.zoomAnimationAmount);
        parcel.writeInt(this.pinchScrollEnabled ? 1 : 0);
        parcel.writeInt(this.useNativeFlingDeceleration ? 1 : 0);
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("GesturesSettings(rotateEnabled=" + this.rotateEnabled + ",\n      pinchToZoomEnabled=" + this.pinchToZoomEnabled + ", scrollEnabled=" + this.scrollEnabled + ",\n      simultaneousRotateAndPinchToZoomEnabled=" + this.simultaneousRotateAndPinchToZoomEnabled + ",\n      pitchEnabled=" + this.pitchEnabled + ", scrollMode=" + this.scrollMode + ",\n      doubleTapToZoomInEnabled=" + this.doubleTapToZoomInEnabled + ",\n      doubleTouchToZoomOutEnabled=" + this.doubleTouchToZoomOutEnabled + ", quickZoomEnabled=" + this.quickZoomEnabled + ",\n      focalPoint=" + this.focalPoint + ", pinchToZoomDecelerationEnabled=" + this.pinchToZoomDecelerationEnabled + ",\n      rotateDecelerationEnabled=" + this.rotateDecelerationEnabled + ",\n      scrollDecelerationEnabled=" + this.scrollDecelerationEnabled + ",\n      increaseRotateThresholdWhenPinchingToZoom=" + this.increaseRotateThresholdWhenPinchingToZoom + ",\n      increasePinchToZoomThresholdWhenRotating=" + this.increasePinchToZoomThresholdWhenRotating + ",\n      zoomAnimationAmount=" + this.zoomAnimationAmount + ", pinchScrollEnabled=" + this.pinchScrollEnabled + ",\n      useNativeFlingDeceleration=" + this.useNativeFlingDeceleration + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!GesturesSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        GesturesSettings gesturesSettings = (GesturesSettings) obj;
        if (this.rotateEnabled == gesturesSettings.rotateEnabled && this.pinchToZoomEnabled == gesturesSettings.pinchToZoomEnabled && this.scrollEnabled == gesturesSettings.scrollEnabled && this.simultaneousRotateAndPinchToZoomEnabled == gesturesSettings.simultaneousRotateAndPinchToZoomEnabled && this.pitchEnabled == gesturesSettings.pitchEnabled && this.scrollMode == gesturesSettings.scrollMode && this.doubleTapToZoomInEnabled == gesturesSettings.doubleTapToZoomInEnabled && this.doubleTouchToZoomOutEnabled == gesturesSettings.doubleTouchToZoomOutEnabled && this.quickZoomEnabled == gesturesSettings.quickZoomEnabled) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.focalPoint, gesturesSettings.focalPoint}, getCieXyz.write())).booleanValue() && this.pinchToZoomDecelerationEnabled == gesturesSettings.pinchToZoomDecelerationEnabled && this.rotateDecelerationEnabled == gesturesSettings.rotateDecelerationEnabled && this.scrollDecelerationEnabled == gesturesSettings.scrollDecelerationEnabled && this.increaseRotateThresholdWhenPinchingToZoom == gesturesSettings.increaseRotateThresholdWhenPinchingToZoom && this.increasePinchToZoomThresholdWhenRotating == gesturesSettings.increasePinchToZoomThresholdWhenRotating && Float.compare(this.zoomAnimationAmount, gesturesSettings.zoomAnimationAmount) == 0 && this.pinchScrollEnabled == gesturesSettings.pinchScrollEnabled && this.useNativeFlingDeceleration == gesturesSettings.useNativeFlingDeceleration) {
                return true;
            }
        }
        return false;
    }
}
