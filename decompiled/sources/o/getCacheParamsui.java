package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getCacheParamsui {
    public static final getCacheParamsui write = new getCacheParamsui(null, null);
    public final Executor RemoteActionCompatParcelizer;
    public final Runnable read;
    public getCacheParamsui serializer;

    public getCacheParamsui(Runnable runnable, Executor executor) {
        this.read = runnable;
        this.RemoteActionCompatParcelizer = executor;
    }
}
