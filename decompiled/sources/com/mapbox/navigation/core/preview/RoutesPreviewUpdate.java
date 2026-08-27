package com.mapbox.navigation.core.preview;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesPreviewUpdate {
    public final String reason;
    public final RoutesPreview routesPreview;

    public final int hashCode() {
        int iHashCode = this.reason.hashCode();
        RoutesPreview routesPreview = this.routesPreview;
        return (iHashCode * 31) + (routesPreview != null ? routesPreview.hashCode() : 0);
    }

    public RoutesPreviewUpdate(String str, RoutesPreview routesPreview) {
        this.reason = str;
        this.routesPreview = routesPreview;
    }

    public final String toString() {
        return "RoutesPreviewUpdate(reason='" + this.reason + "', routesPreview=" + this.routesPreview + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutesPreviewUpdate.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoutesPreviewUpdate routesPreviewUpdate = (RoutesPreviewUpdate) obj;
        if (!this.reason.equals(routesPreviewUpdate.reason)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routesPreview, routesPreviewUpdate.routesPreview}, getCieXyz.write())).booleanValue();
    }
}
