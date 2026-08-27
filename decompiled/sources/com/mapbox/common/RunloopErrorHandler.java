package com.mapbox.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes5.dex */
@Keep
final class RunloopErrorHandler {
    public static final RunloopErrorHandler INSTANCE = new RunloopErrorHandler();
    public static final String TAG = "run_loop";

    private RunloopErrorHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postErrorToMainLooper$lambda$0(Throwable th) throws Throwable {
        th.getClass();
        throw th;
    }

    @Keep
    public static final void postErrorToMainLooper(final Throwable th) {
        th.getClass();
        Log.error("Please check the following Java stacktrace for more information related to the exception: " + th.getMessage(), TAG);
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mapbox.common.RunloopErrorHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                RunloopErrorHandler.postErrorToMainLooper$lambda$0(th);
            }
        });
    }
}
