package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class translate implements ThreadFactory {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ String serializer;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.IconCompatParcelizer;
        String str = this.serializer;
        if (i != 0) {
            Thread thread = new Thread(runnable, str);
            thread.setDaemon(true);
            return thread;
        }
        Thread thread2 = new Thread(runnable, str);
        thread2.setPriority(10);
        return thread2;
    }

    public /* synthetic */ translate(String str, AtomicInteger atomicInteger) {
        this.serializer = str;
    }
}
