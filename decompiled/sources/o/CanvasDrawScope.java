package o;

import com.google.android.gms.net.zza;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasDrawScope implements ThreadFactory {
    public final Xyz IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final AtomicInteger serializer = new AtomicInteger();
    public final configureStrokePaintQ_0CZUI write = configureStrokePaintQ_0CZUI.write;

    public CanvasDrawScope(Xyz xyz, String str, boolean z) {
        this.IconCompatParcelizer = xyz;
        this.RemoteActionCompatParcelizer = str;
        this.read = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.IconCompatParcelizer.newThread(new zza(this, runnable, false, 8));
        threadNewThread.setName("glide-" + this.RemoteActionCompatParcelizer + "-thread-" + this.serializer.getAndIncrement());
        return threadNewThread;
    }
}
