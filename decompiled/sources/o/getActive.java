package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class getActive extends setSlotReusePolicy {
    public static final AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getSlotId.class, Thread.class, "write");
    public static final AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(getSlotId.class, getSlotId.class, "read");
    public static final AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.class, getSlotId.class, "MediaBrowserCompatMediaItem");
    public static final AtomicReferenceFieldUpdater serializer = AtomicReferenceFieldUpdater.newUpdater(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.class, LayoutNodeSubcompositionsStateNodeState.class, "MediaDescriptionCompat");
    public static final AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.class, Object.class, "RatingCompat");

    @Override // o.setSlotReusePolicy
    public final LayoutNodeSubcompositionsStateNodeState IconCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        return (LayoutNodeSubcompositionsStateNodeState) serializer.getAndSet(forcerecomposechildren, LayoutNodeSubcompositionsStateNodeState.serializer);
    }

    @Override // o.setSlotReusePolicy
    public final getSlotId RemoteActionCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        return (getSlotId) RemoteActionCompatParcelizer.getAndSet(forcerecomposechildren, getSlotId.RemoteActionCompatParcelizer);
    }

    @Override // o.setSlotReusePolicy
    public final boolean RemoteActionCompatParcelizer(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, getSlotId getslotid, getSlotId getslotid2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = RemoteActionCompatParcelizer;
            if (atomicReferenceFieldUpdater.compareAndSet(layoutNodeSubcompositionsStateApproachMeasureScopeImpl, getslotid, getslotid2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(layoutNodeSubcompositionsStateApproachMeasureScopeImpl) == getslotid);
        return false;
    }

    @Override // o.setSlotReusePolicy
    public final void serializer(getSlotId getslotid, Thread thread) {
        IconCompatParcelizer.lazySet(getslotid, thread);
    }

    @Override // o.setSlotReusePolicy
    public final void serializer(getSlotId getslotid, getSlotId getslotid2) {
        read.lazySet(getslotid, getslotid2);
    }

    @Override // o.setSlotReusePolicy
    public final boolean write(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = write;
            if (atomicReferenceFieldUpdater.compareAndSet(layoutNodeSubcompositionsStateApproachMeasureScopeImpl, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(layoutNodeSubcompositionsStateApproachMeasureScopeImpl) == obj);
        return false;
    }
}
