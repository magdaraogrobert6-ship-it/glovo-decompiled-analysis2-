package com.mapbox.navigation.core.trip.session;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.getScrollByOffset;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeSetRouteError extends getScrollByOffset {
    public final String error;

    public final int hashCode() {
        return this.error.hashCode();
    }

    public NativeSetRouteError(String str) {
        str.getClass();
        this.error = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("NativeSetRouteError(error='"), this.error, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NativeSetRouteError.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, ((NativeSetRouteError) obj).error}, getCieXyz.write())).booleanValue();
    }
}
