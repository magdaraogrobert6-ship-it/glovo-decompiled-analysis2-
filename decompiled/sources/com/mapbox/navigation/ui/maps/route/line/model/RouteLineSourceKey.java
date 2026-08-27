package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineSourceKey {
    public final String sourceId;

    public final int hashCode() {
        return this.sourceId.hashCode();
    }

    public /* synthetic */ RouteLineSourceKey(String str) {
        this.sourceId = str;
    }

    public final String toString() {
        return m1$$ExternalSyntheticOutline0.m(')', "RouteLineSourceKey(sourceId=", this.sourceId);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RouteLineSourceKey)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sourceId, ((RouteLineSourceKey) obj).sourceId}, getCieXyz.write())).booleanValue();
    }
}
