package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getComposition {
    public static /* synthetic */ boolean IconCompatParcelizer(Unsafe unsafe, forceRecomposeChildren forcerecomposechildren, long j, Object obj) {
        while (!unsafe.compareAndSwapObject(forcerecomposechildren, j, obj, LayoutNodeSubcompositionsStateNodeState.serializer)) {
            if (unsafe.getObject(forcerecomposechildren, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
