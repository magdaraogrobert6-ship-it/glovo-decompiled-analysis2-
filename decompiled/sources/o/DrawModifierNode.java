package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class DrawModifierNode {
    public static /* synthetic */ boolean write(Unsafe unsafe, component2D9Ej5fM component2d9ej5fm, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(component2d9ej5fm, j, obj, obj2)) {
            if (unsafe.getObject(component2d9ej5fm, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
