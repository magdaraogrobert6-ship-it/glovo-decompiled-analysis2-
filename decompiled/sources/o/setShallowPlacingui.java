package o;

import android.os.StrictMode;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class setShallowPlacingui implements ThreadFactory {
    public static final ThreadFactory read = Executors.defaultThreadFactory();
    public final int IconCompatParcelizer;
    public final StrictMode.ThreadPolicy RemoteActionCompatParcelizer;
    public final String serializer;
    public final AtomicLong write = new AtomicLong();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = read.newThread(new ND$$ExternalSyntheticLambda0(this, 10, runnable));
        java.util.Locale locale = java.util.Locale.ROOT;
        threadNewThread.setName(this.serializer + " Thread #" + this.write.getAndIncrement());
        return threadNewThread;
    }

    public setShallowPlacingui(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.serializer = str;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = threadPolicy;
    }
}
