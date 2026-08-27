package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineFeatureId {
    public final String featureId;

    public /* synthetic */ RouteLineFeatureId(String str) {
        this.featureId = str;
    }

    public final String toString() {
        return m1$$ExternalSyntheticOutline0.m(')', "RouteLineFeatureId(featureId=", this.featureId);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RouteLineFeatureId)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureId, ((RouteLineFeatureId) obj).featureId}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.featureId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
