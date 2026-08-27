package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class isLayoutDirectionAware {
    public static /* synthetic */ boolean read(Unsafe unsafe, component2D9Ej5fM component2d9ej5fm, long j, Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        while (!unsafe.compareAndSwapObject(component2d9ej5fm, j, absolutea9UjIt4default, absolutea9UjIt4default2)) {
            if (unsafe.getObject(component2d9ej5fm, j) != absolutea9UjIt4default) {
                return false;
            }
        }
        return true;
    }
}
