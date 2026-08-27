package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getForceReuse extends setSlotReusePolicy {
    @Override // o.setSlotReusePolicy
    public final boolean RemoteActionCompatParcelizer(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, getSlotId getslotid, getSlotId getslotid2) {
        synchronized (layoutNodeSubcompositionsStateApproachMeasureScopeImpl) {
            if (layoutNodeSubcompositionsStateApproachMeasureScopeImpl.MediaBrowserCompatMediaItem != getslotid) {
                return false;
            }
            layoutNodeSubcompositionsStateApproachMeasureScopeImpl.MediaBrowserCompatMediaItem = getslotid2;
            return true;
        }
    }

    @Override // o.setSlotReusePolicy
    public final void serializer(getSlotId getslotid, Thread thread) {
        getslotid.write = thread;
    }

    @Override // o.setSlotReusePolicy
    public final void serializer(getSlotId getslotid, getSlotId getslotid2) {
        getslotid.read = getslotid2;
    }

    @Override // o.setSlotReusePolicy
    public final boolean write(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, Object obj, Object obj2) {
        synchronized (layoutNodeSubcompositionsStateApproachMeasureScopeImpl) {
            if (layoutNodeSubcompositionsStateApproachMeasureScopeImpl.RatingCompat != obj) {
                return false;
            }
            layoutNodeSubcompositionsStateApproachMeasureScopeImpl.RatingCompat = obj2;
            return true;
        }
    }

    @Override // o.setSlotReusePolicy
    public final LayoutNodeSubcompositionsStateNodeState IconCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeState;
        LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeState2 = LayoutNodeSubcompositionsStateNodeState.serializer;
        synchronized (forcerecomposechildren) {
            layoutNodeSubcompositionsStateNodeState = forcerecomposechildren.MediaDescriptionCompat;
            if (layoutNodeSubcompositionsStateNodeState != layoutNodeSubcompositionsStateNodeState2) {
                forcerecomposechildren.MediaDescriptionCompat = layoutNodeSubcompositionsStateNodeState2;
            }
        }
        return layoutNodeSubcompositionsStateNodeState;
    }

    @Override // o.setSlotReusePolicy
    public final getSlotId RemoteActionCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        getSlotId getslotid;
        getSlotId getslotid2 = getSlotId.RemoteActionCompatParcelizer;
        synchronized (forcerecomposechildren) {
            getslotid = forcerecomposechildren.MediaBrowserCompatMediaItem;
            if (getslotid != getslotid2) {
                forcerecomposechildren.MediaBrowserCompatMediaItem = getslotid2;
            }
        }
        return getslotid;
    }
}
