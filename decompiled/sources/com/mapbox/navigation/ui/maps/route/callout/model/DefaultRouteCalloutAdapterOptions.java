package com.mapbox.navigation.ui.maps.route.callout.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.UriKt;
import com.logistics.rider.glovo.R;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultRouteCalloutAdapterOptions {
    public final int backgroundColor;
    public final int durationTextAppearance;
    public final int fasterTextColor;
    public final int routeCalloutType;
    public final int selectedBackgroundColor;
    public final int selectedTextColor;
    public final long similarDurationDelta;
    public final int slowerTextColor;
    public final int textColor;

    public final class Builder {
        public final int backgroundColor;
        public final int durationTextAppearance;
        public final int fasterTextColor;
        public int routeCalloutType;
        public final int selectedBackgroundColor;
        public final int selectedTextColor;
        public long similarDurationDelta;
        public final int slowerTextColor;
        public final int textColor;

        public final void routeCalloutType() {
            this.routeCalloutType = 1;
        }

        /* JADX INFO: renamed from: similarDurationDelta-LRDsOJo, reason: not valid java name */
        public final void m4790similarDurationDeltaLRDsOJo(long j) {
            this.similarDurationDelta = j;
        }

        public final DefaultRouteCalloutAdapterOptions build() {
            return new DefaultRouteCalloutAdapterOptions(this.routeCalloutType, this.similarDurationDelta, this.backgroundColor, this.selectedBackgroundColor, this.textColor, this.selectedTextColor, this.fasterTextColor, this.slowerTextColor, this.durationTextAppearance);
        }

        public Builder() {
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            this.similarDurationDelta = UriKt.RemoteActionCompatParcelizer(3, setUnregisteredInAppMessage.MINUTES);
            this.backgroundColor = R.color.mapbox_route_callout_background;
            this.selectedBackgroundColor = R.color.mapbox_selected_route_callout_background;
            this.textColor = R.color.mapbox_route_callout_text;
            this.selectedTextColor = R.color.mapbox_selected_route_callout_text;
            this.fasterTextColor = R.color.mapbox_faster_route_callout_text;
            this.slowerTextColor = R.color.mapbox_slower_route_callout_text;
            this.durationTextAppearance = R.style.MapboxStyleRouteCalloutDuration;
        }
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.routeCalloutType);
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        return Integer.hashCode(this.durationTextAppearance) + af$$ExternalSyntheticOutline0.m(this.slowerTextColor, af$$ExternalSyntheticOutline0.m(this.fasterTextColor, af$$ExternalSyntheticOutline0.m(this.selectedTextColor, af$$ExternalSyntheticOutline0.m(this.textColor, af$$ExternalSyntheticOutline0.m(this.selectedBackgroundColor, af$$ExternalSyntheticOutline0.m(this.backgroundColor, d$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.similarDurationDelta), 31), 31), 31), 31), 31), 31);
    }

    public DefaultRouteCalloutAdapterOptions(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.routeCalloutType = i;
        this.similarDurationDelta = j;
        this.backgroundColor = i2;
        this.selectedBackgroundColor = i3;
        this.textColor = i4;
        this.selectedTextColor = i5;
        this.fasterTextColor = i6;
        this.slowerTextColor = i7;
        this.durationTextAppearance = i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapboxRouteCalloutViewOptions(routeCalloutType=");
        sb.append(this.routeCalloutType);
        sb.append(",similarDurationDelta=");
        sb.append((Object) BrazeInAppMessageManagerExternalSyntheticLambda2.MediaBrowserCompatMediaItem(this.similarDurationDelta));
        sb.append(",backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(",selectedBackgroundColor=");
        sb.append(this.selectedBackgroundColor);
        sb.append(",textColor=");
        sb.append(this.textColor);
        sb.append(",selectedTextColor=");
        sb.append(this.selectedTextColor);
        sb.append(",fasterTextColor=");
        sb.append(this.fasterTextColor);
        sb.append(",slowerTextColor=");
        sb.append(this.slowerTextColor);
        sb.append(",durationTextAppearance=");
        return af$$ExternalSyntheticOutline0.m(this.durationTextAppearance, ",)", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DefaultRouteCalloutAdapterOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DefaultRouteCalloutAdapterOptions defaultRouteCalloutAdapterOptions = (DefaultRouteCalloutAdapterOptions) obj;
        return this.routeCalloutType == defaultRouteCalloutAdapterOptions.routeCalloutType && BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(this.similarDurationDelta, defaultRouteCalloutAdapterOptions.similarDurationDelta) && this.backgroundColor == defaultRouteCalloutAdapterOptions.backgroundColor && this.selectedBackgroundColor == defaultRouteCalloutAdapterOptions.selectedBackgroundColor && this.textColor == defaultRouteCalloutAdapterOptions.textColor && this.selectedTextColor == defaultRouteCalloutAdapterOptions.selectedTextColor && this.fasterTextColor == defaultRouteCalloutAdapterOptions.fasterTextColor && this.slowerTextColor == defaultRouteCalloutAdapterOptions.slowerTextColor && this.durationTextAppearance == defaultRouteCalloutAdapterOptions.durationTextAppearance;
    }
}
