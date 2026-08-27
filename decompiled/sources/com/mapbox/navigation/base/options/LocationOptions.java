package com.mapbox.navigation.base.options;

import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationProviderRequest;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationOptions {
    public static final LocationProviderRequest DEFAULT_REQUEST = new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().minimumInterval(500L).interval(1000L).build()).accuracy(AccuracyLevel.HIGH).build();
    public final LocationProviderRequest request;

    public final int hashCode() {
        return ((((this.request.hashCode() * 961) + 2511262) * 31) + 2035172) * 31;
    }

    public LocationOptions(LocationProviderRequest locationProviderRequest) {
        this.request = locationProviderRequest;
    }

    public final String toString() {
        return "LocationOptions(request=" + this.request + ", locationProviderFactory=null, locationProviderType='REAL', locationProviderSource=LocationProviderSource(sourceName=BEST), handlerThread=null)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, ((LocationOptions) obj).request}, getCieXyz.write())).booleanValue();
    }
}
