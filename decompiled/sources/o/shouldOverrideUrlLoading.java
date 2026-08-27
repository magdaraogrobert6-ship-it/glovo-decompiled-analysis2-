package o;

import io.grpc.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class shouldOverrideUrlLoading implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw Status.IconCompatParcelizer(th).IconCompatParcelizer("Uncaught exception in the SynchronizationContext. Re-thrown.").RemoteActionCompatParcelizer();
    }
}
