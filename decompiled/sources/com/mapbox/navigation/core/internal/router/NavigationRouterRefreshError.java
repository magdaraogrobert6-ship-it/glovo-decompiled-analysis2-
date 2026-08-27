package com.mapbox.navigation.core.internal.router;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationRouterRefreshError {
    public final String message;
    public final Integer refreshTtl;
    public final Throwable throwable;

    public final int hashCode() {
        int iHashCode = this.message.hashCode();
        Throwable th = this.throwable;
        int iHashCode2 = th != null ? th.hashCode() : 0;
        Integer num = this.refreshTtl;
        return (((iHashCode * 31) + iHashCode2) * 961) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "NavigationRouterRefreshError(message=" + this.message + ", throwable=" + this.throwable + ", routerFailure=null, refreshTtl=" + this.refreshTtl + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NavigationRouterRefreshError.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NavigationRouterRefreshError navigationRouterRefreshError = (NavigationRouterRefreshError) obj;
        if (!this.message.equals(navigationRouterRefreshError.message)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.throwable, navigationRouterRefreshError.throwable}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshTtl, navigationRouterRefreshError.refreshTtl}, getCieXyz.write())).booleanValue();
    }

    public NavigationRouterRefreshError(String str, Throwable th, Integer num, int i) {
        th = (i & 2) != 0 ? null : th;
        num = (i & 8) != 0 ? null : num;
        this.message = str;
        this.throwable = th;
        this.refreshTtl = num;
    }
}
