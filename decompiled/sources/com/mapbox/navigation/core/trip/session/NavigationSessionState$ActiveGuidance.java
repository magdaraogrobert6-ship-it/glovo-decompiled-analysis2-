package com.mapbox.navigation.core.trip.session;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.getScrollToIndex;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationSessionState$ActiveGuidance extends getScrollToIndex {
    public final String sessionId;

    public final int hashCode() {
        return this.sessionId.hashCode();
    }

    public NavigationSessionState$ActiveGuidance(String str) {
        str.getClass();
        this.sessionId = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ActiveGuidance(sessionId='"), this.sessionId, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NavigationSessionState$ActiveGuidance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, ((NavigationSessionState$ActiveGuidance) obj).sessionId}, getCieXyz.write())).booleanValue();
    }
}
