package o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class onDrawBehind implements DrawModifierNodeKt {
    public final java.lang.ref.WeakReference read;
    public final obtainGraphicsLayer serializer = new obtainGraphicsLayer(this);

    @Override // o.DrawModifierNodeKt
    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        this.serializer.RemoteActionCompatParcelizer(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.read.get();
        boolean zCancel = this.serializer.cancel(z);
        if (zCancel && ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer = null;
            ondrawwithcontent.read = null;
            ondrawwithcontent.IconCompatParcelizer.write((Object) null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.serializer.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.serializer.MediaBrowserCompatMediaItem instanceof CacheDrawScope;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.serializer.isDone();
    }

    public final String toString() {
        return this.serializer.toString();
    }

    public final boolean write(Throwable th) {
        return this.serializer.IconCompatParcelizer(th);
    }

    public onDrawBehind(onDrawWithContent ondrawwithcontent) {
        this.read = new java.lang.ref.WeakReference(ondrawwithcontent);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.serializer.get(j, timeUnit);
    }
}
