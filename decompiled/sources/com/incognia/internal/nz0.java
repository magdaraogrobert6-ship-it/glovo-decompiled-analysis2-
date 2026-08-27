package com.incognia.internal;

import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class nz0 {
    public final Map BGx;

    public final int hashCode() {
        return this.BGx.hashCode();
    }

    public nz0() {
        this.BGx = SimpleItemTouchHelperCallback.serializer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz0)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ((nz0) obj).BGx}, getCieXyz.write())).booleanValue();
    }

    public nz0(Map map) {
        this.BGx = map;
    }
}
