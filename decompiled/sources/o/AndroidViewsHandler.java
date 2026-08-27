package o;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AndroidViewsHandler implements Runnable {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Runnable write;

    public /* synthetic */ AndroidViewsHandler(Runnable runnable, int i) {
        this.serializer = i;
        this.write = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Runnable runnable = this.write;
        if (i != 0) {
            getMaximumFlingVelocity.RemoteActionCompatParcelizer.set(new ArrayDeque());
            runnable.run();
            return;
        }
        Deque deque = (Deque) getMaximumFlingVelocity.RemoteActionCompatParcelizer.get();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
