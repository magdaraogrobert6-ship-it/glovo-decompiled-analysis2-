package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class getVariationdefault implements Executor {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Handler serializer;

    public getVariationdefault() {
        this.RemoteActionCompatParcelizer = 0;
        this.serializer = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.RemoteActionCompatParcelizer != 0) {
            this.serializer.post(runnable);
        } else {
            this.serializer.post(runnable);
        }
    }

    public /* synthetic */ getVariationdefault(getBackEK5gGoQ getbackek5ggoq) {
        this.RemoteActionCompatParcelizer = 1;
        this.serializer = getbackek5ggoq;
    }
}
