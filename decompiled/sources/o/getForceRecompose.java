package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getForceRecompose {
    public static /* synthetic */ boolean serializer(Unsafe unsafe, LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(layoutNodeSubcompositionsStateApproachMeasureScopeImpl, j, obj, obj2)) {
            if (unsafe.getObject(layoutNodeSubcompositionsStateApproachMeasureScopeImpl, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
