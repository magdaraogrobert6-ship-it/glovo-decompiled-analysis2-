package com.mapbox.navigation.core.trip.session;

import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.getScrollByOffset;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeSetRouteValue extends getScrollByOffset {
    public final List nativeAlternatives;
    public final List routes;

    public final int hashCode() {
        return this.nativeAlternatives.hashCode() + (this.routes.hashCode() * 31);
    }

    public NativeSetRouteValue(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.routes = list;
        this.nativeAlternatives = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeSetRouteValue(routes=");
        sb.append(this.routes);
        sb.append(", nativeAlternatives=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.nativeAlternatives, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NativeSetRouteValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NativeSetRouteValue nativeSetRouteValue = (NativeSetRouteValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routes, nativeSetRouteValue.routes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nativeAlternatives, nativeSetRouteValue.nativeAlternatives}, getCieXyz.write())).booleanValue();
    }
}
