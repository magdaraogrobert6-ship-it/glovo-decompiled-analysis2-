package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class parselambda0 implements ThreadFactory {
    public int IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.serializer;
        if (i == 0) {
            StringBuilder sb = new StringBuilder("SentryHostnameCache-");
            int i2 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
        if (i != 1) {
            runnable.getClass();
            StringBuilder sb2 = new StringBuilder("SentryReplayPersister-");
            int i3 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i3 + 1;
            sb2.append(i3);
            Thread thread2 = new Thread(runnable, sb2.toString());
            thread2.setDaemon(true);
            return thread2;
        }
        runnable.getClass();
        StringBuilder sb3 = new StringBuilder("SentryReplayIntegration-");
        int i4 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i4 + 1;
        sb3.append(i4);
        Thread thread3 = new Thread(runnable, sb3.toString());
        thread3.setDaemon(true);
        return thread3;
    }
}
