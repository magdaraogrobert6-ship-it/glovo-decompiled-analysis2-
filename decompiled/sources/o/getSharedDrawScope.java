package o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class getSharedDrawScope implements Runnable, ThreadFactory {
    public final /* synthetic */ getShowLayoutBounds RemoteActionCompatParcelizer;
    public final CountDownLatch read = new CountDownLatch(1);
    public Runnable serializer;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.read.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.serializer.run();
    }

    public getSharedDrawScope(getShowLayoutBounds getshowlayoutbounds) {
        this.RemoteActionCompatParcelizer = getshowlayoutbounds;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        getRectManager.RemoteActionCompatParcelizer(this.serializer == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
        this.serializer = runnable;
        this.read.countDown();
        return this.RemoteActionCompatParcelizer.write;
    }
}
