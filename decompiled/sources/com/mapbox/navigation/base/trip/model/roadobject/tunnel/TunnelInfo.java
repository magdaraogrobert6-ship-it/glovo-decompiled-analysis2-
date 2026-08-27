package com.mapbox.navigation.base.trip.model.roadobject.tunnel;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TunnelInfo {
    public final String name;

    public TunnelInfo(String str) {
        this.name = str;
    }

    public final int hashCode() {
        String str = this.name;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("TunnelInfo(name='"), this.name, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TunnelInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, ((TunnelInfo) obj).name}, getCieXyz.write())).booleanValue();
    }
}
