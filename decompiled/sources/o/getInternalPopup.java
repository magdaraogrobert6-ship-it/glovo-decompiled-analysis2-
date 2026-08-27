package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class getInternalPopup implements Executor {
    public static volatile getInternalPopup write;
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            ((Handler) obj).post(runnable);
            return;
        }
        if (i != 1) {
            ((ExecutorService) obj).execute(runnable);
            return;
        }
        Handler handler = (Handler) obj;
        runnable.getClass();
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    public getInternalPopup(int i) {
        this.read = i;
        if (i != 2) {
            this.IconCompatParcelizer = new Handler(Looper.getMainLooper());
        } else {
            this.IconCompatParcelizer = Executors.newSingleThreadExecutor(new r8lambdaXjeS_gq8hmJyKRkNmQwAUeFh2g(1));
        }
    }

    public getInternalPopup(Handler handler) {
        this.read = 1;
        handler.getClass();
        this.IconCompatParcelizer = handler;
    }
}
