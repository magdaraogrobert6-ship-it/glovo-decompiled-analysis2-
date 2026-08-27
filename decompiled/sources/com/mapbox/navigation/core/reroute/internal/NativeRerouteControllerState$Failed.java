package com.mapbox.navigation.core.reroute.internal;

import java.util.ArrayList;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.getPageDown;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeRerouteControllerState$Failed extends getPageDown {
    public final String message;
    public final List preRouterReasons;
    public final List reasons;
    public final Throwable throwable;

    public final int hashCode() {
        int iHashCode = this.message.hashCode();
        Throwable th = this.throwable;
        int iHashCode2 = th != null ? th.hashCode() : 0;
        List list = this.reasons;
        return this.preRouterReasons.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failed(message='");
        sb.append(this.message);
        sb.append("', throwable=");
        sb.append(this.throwable);
        sb.append(", reasons=");
        sb.append(this.reasons);
        sb.append(", preRouterReasons=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.preRouterReasons, ')');
    }

    public NativeRerouteControllerState$Failed(String str, Throwable th, ArrayList arrayList, int i) {
        arrayList = (i & 4) != 0 ? null : arrayList;
        this.message = str;
        this.throwable = th;
        this.reasons = arrayList;
        this.preRouterReasons = instance_delegatelambda0.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NativeRerouteControllerState$Failed.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NativeRerouteControllerState$Failed nativeRerouteControllerState$Failed = (NativeRerouteControllerState$Failed) obj;
        if (!this.message.equals(nativeRerouteControllerState$Failed.message)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.throwable, nativeRerouteControllerState$Failed.throwable}, getCieXyz.write())).booleanValue() || !this.preRouterReasons.equals(nativeRerouteControllerState$Failed.preRouterReasons)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reasons, nativeRerouteControllerState$Failed.reasons}, getCieXyz.write())).booleanValue();
    }
}
