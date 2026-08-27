package o;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setButtonViews implements Executor {
    public final CoroutineDispatcher serializer;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.serializer;
        r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        if (DispatchedContinuationKt.write(coroutineDispatcher, r8lambda2qmxd75iptxkfld4rjabqemoamc)) {
            DispatchedContinuationKt.write(coroutineDispatcher, r8lambda2qmxd75iptxkfld4rjabqemoamc, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.serializer.toString();
    }

    public setButtonViews(CoroutineDispatcher coroutineDispatcher) {
        this.serializer = coroutineDispatcher;
    }
}
