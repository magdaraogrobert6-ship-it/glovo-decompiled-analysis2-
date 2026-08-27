package com.mapbox.navigation.core.routerefresh;

import androidx.collection.ObjectList$toString$1;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class QueuedRequest {
    public final ObjectList$toString$1 finishCallback;
    public final List routes;
    public final PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1 startCallback;

    public final int hashCode() {
        int iHashCode = this.routes.hashCode();
        return this.finishCallback.hashCode() + ((this.startCallback.hashCode() + (iHashCode * 31)) * 31);
    }

    public QueuedRequest(List list, PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1 plannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1, ObjectList$toString$1 objectList$toString$1) {
        list.getClass();
        this.routes = list;
        this.startCallback = plannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1;
        this.finishCallback = objectList$toString$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QueuedRequest) {
            QueuedRequest queuedRequest = (QueuedRequest) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routes, queuedRequest.routes}, getCieXyz.write())).booleanValue() && this.startCallback == queuedRequest.startCallback && this.finishCallback == queuedRequest.finishCallback;
        }
        return false;
    }

    public final String toString() {
        return "QueuedRequest(routes=" + this.routes + ", startCallback=" + this.startCallback + ", finishCallback=" + this.finishCallback + ')';
    }
}
