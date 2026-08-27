package org.chromium.net;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i, long j, int i2);

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Executor must not be null");
            throw null;
        }
    }
}
