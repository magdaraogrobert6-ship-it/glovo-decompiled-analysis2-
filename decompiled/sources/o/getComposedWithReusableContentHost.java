package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getComposedWithReusableContentHost {
    public static /* synthetic */ boolean serializer(Unsafe unsafe, LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, long j, getSlotId getslotid, getSlotId getslotid2) {
        while (!unsafe.compareAndSwapObject(layoutNodeSubcompositionsStateApproachMeasureScopeImpl, j, getslotid, getslotid2)) {
            if (unsafe.getObject(layoutNodeSubcompositionsStateApproachMeasureScopeImpl, j) != getslotid) {
                return false;
            }
        }
        return true;
    }
}
