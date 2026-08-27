package com.mapbox.navigation.core;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesSetError {
    public final String message;

    public final int hashCode() {
        return this.message.hashCode();
    }

    public RoutesSetError(String str) {
        str.getClass();
        this.message = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RoutesSetError(message='"), this.message, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutesSetError.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((RoutesSetError) obj).message}, getCieXyz.write())).booleanValue();
    }
}
