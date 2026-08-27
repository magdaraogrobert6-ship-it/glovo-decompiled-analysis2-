package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class actualColorMatrixColorFilterjHGOpc {
    public boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public boolean read = true;
    public final ArrayDeque serializer = new ArrayDeque();

    public final void IconCompatParcelizer() {
        ArrayDeque arrayDeque = this.serializer;
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        try {
            this.RemoteActionCompatParcelizer = true;
            while (!arrayDeque.isEmpty() && (this.IconCompatParcelizer || !this.read)) {
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.RemoteActionCompatParcelizer = false;
        }
    }
}
