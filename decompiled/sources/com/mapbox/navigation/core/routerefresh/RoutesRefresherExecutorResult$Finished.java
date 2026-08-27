package com.mapbox.navigation.core.routerefresh;

import o.getCieXyz;
import o.getPerformImeAction;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesRefresherExecutorResult$Finished extends getPerformImeAction {
    public final RoutesRefresherResult value;

    public final int hashCode() {
        return this.value.hashCode();
    }

    public RoutesRefresherExecutorResult$Finished(RoutesRefresherResult routesRefresherResult) {
        routesRefresherResult.getClass();
        this.value = routesRefresherResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesRefresherExecutorResult$Finished)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((RoutesRefresherExecutorResult$Finished) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Finished(value=" + this.value + ')';
    }
}
