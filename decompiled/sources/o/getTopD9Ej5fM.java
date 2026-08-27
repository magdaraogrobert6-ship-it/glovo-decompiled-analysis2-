package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getTopD9Ej5fM {
    public static /* synthetic */ boolean write(Unsafe unsafe, component2D9Ej5fM component2d9ej5fm, long j, copylDy3nrA copyldy3nra, copylDy3nrA copyldy3nra2) {
        while (!unsafe.compareAndSwapObject(component2d9ej5fm, j, copyldy3nra, copyldy3nra2)) {
            if (unsafe.getObject(component2d9ej5fm, j) != copyldy3nra) {
                return false;
            }
        }
        return true;
    }
}
