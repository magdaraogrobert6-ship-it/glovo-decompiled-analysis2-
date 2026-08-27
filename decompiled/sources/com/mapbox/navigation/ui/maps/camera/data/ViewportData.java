package com.mapbox.navigation.ui.maps.camera.data;

import com.mapbox.maps.CameraOptions;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewportData {
    public final CameraOptions cameraForFollowing;
    public final CameraOptions cameraForOverview;

    public final int hashCode() {
        return this.cameraForOverview.hashCode() + (this.cameraForFollowing.hashCode() * 31);
    }

    public ViewportData(CameraOptions cameraOptions, CameraOptions cameraOptions2) {
        cameraOptions2.getClass();
        this.cameraForFollowing = cameraOptions;
        this.cameraForOverview = cameraOptions2;
    }

    public final String toString() {
        return "ViewportData(cameraForFollowing=" + this.cameraForFollowing + ", cameraForOverview=" + this.cameraForOverview + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ViewportData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ViewportData viewportData = (ViewportData) obj;
        if (!this.cameraForFollowing.equals(viewportData.cameraForFollowing)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cameraForOverview, viewportData.cameraForOverview}, getCieXyz.write())).booleanValue();
    }
}
