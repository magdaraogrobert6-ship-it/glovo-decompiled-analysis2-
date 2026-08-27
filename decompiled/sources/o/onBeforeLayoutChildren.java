package o;

import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class onBeforeLayoutChildren extends LookaheadPassDelegate {
    public final /* synthetic */ ExecutorService read;

    @Override // o.LookaheadPassDelegate
    public final void RemoteActionCompatParcelizer() {
        ExecutorService executorService = this.read;
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            java.util.Locale locale = java.util.Locale.US;
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        }
    }

    public onBeforeLayoutChildren(ExecutorService executorService) {
        this.read = executorService;
    }
}
