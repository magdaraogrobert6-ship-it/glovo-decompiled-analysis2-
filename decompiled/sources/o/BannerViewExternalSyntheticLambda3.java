package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerViewExternalSyntheticLambda3 implements ThreadFactory {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.read != 0) {
            StringBuilder sb = new StringBuilder("SentryAsyncConnection-");
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
        StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        sb2.append(i2);
        Thread thread2 = new Thread(runnable, sb2.toString());
        thread2.setDaemon(true);
        return thread2;
    }
}
