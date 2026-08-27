package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaST4AYLA9Q2b7l2QguExdjNYtig implements ThreadFactory {
    public final Serializable RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    public r8lambdaST4AYLA9Q2b7l2QguExdjNYtig(boolean z) {
        this.write = 1;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.write;
        Serializable serializable = this.RemoteActionCompatParcelizer;
        boolean z = this.serializer;
        if (i == 0) {
            Thread thread = new Thread(runnable, (String) serializable);
            thread.setDaemon(z);
            return thread;
        }
        runnable.getClass();
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(z ? "WM.task-" : "androidx.work-");
        sbM.append(((AtomicInteger) serializable).incrementAndGet());
        return new Thread(runnable, sbM.toString());
    }

    public r8lambdaST4AYLA9Q2b7l2QguExdjNYtig(String str, boolean z) {
        this.write = 0;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = z;
    }
}
