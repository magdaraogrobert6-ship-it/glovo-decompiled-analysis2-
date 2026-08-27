package o;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class getButtonAEK5gGoQ extends ThreadPoolExecutor implements AutoCloseable {
    public final Context RemoteActionCompatParcelizer;

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        af$$ExternalSyntheticOutline1.m(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        if (th != null) {
            getButton5EK5gGoQ.IconCompatParcelizer("Uncaught exception: ", th, this.RemoteActionCompatParcelizer);
        }
    }

    public getButtonAEK5gGoQ(Context context, LinkedBlockingQueue linkedBlockingQueue, getCommaEK5gGoQ getcommaek5ggoq) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, linkedBlockingQueue, getcommaek5ggoq);
        this.RemoteActionCompatParcelizer = context;
    }
}
