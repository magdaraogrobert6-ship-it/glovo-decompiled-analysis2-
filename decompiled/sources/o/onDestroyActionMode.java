package o;

import com.mapbox.common.JavaHeapDumper$$ExternalSyntheticLambda0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class onDestroyActionMode implements ThreadFactory {
    public final String IconCompatParcelizer;
    public final AtomicInteger read = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.IconCompatParcelizer + "-" + this.read.getAndIncrement());
        thread.setUncaughtExceptionHandler(new JavaHeapDumper$$ExternalSyntheticLambda0(1));
        return thread;
    }

    public onDestroyActionMode(String str) {
        this.IconCompatParcelizer = str;
    }
}
