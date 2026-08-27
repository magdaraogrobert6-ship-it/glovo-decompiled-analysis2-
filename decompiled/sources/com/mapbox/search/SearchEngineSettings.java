package com.mapbox.search;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.location.LocationProvider;
import com.mapbox.common.location.LocationServiceFactory;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchEngineSettings {
    public final LocationProvider locationProvider = LocationServiceFactory.getOrCreate().getDeviceLocationProvider(null).getValue();
    public final String geocodingEndpointBaseUrl = "https://api.mapbox.com";

    public final int hashCode() {
        LocationProvider locationProvider = this.locationProvider;
        return af$$ExternalSyntheticOutline0.m((locationProvider != null ? locationProvider.hashCode() : 0) * 961, 961, this.geocodingEndpointBaseUrl);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchEngineSettings(locationProvider=");
        sb.append(this.locationProvider);
        sb.append(", viewportProvider=null, geocodingEndpointBaseUrl='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.geocodingEndpointBaseUrl, "', singleBoxSearchBaseUrl=nullbaseUrl=null)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchEngineSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchEngineSettings searchEngineSettings = (SearchEngineSettings) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locationProvider, searchEngineSettings.locationProvider}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geocodingEndpointBaseUrl, searchEngineSettings.geocodingEndpointBaseUrl}, getCieXyz.write())).booleanValue();
    }
}
