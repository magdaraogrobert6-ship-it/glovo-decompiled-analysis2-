package androidx.compose.material.internal;

import java.util.concurrent.CancellationException;
import o.setAsDelegateToui;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(setAsDelegateToui.RemoteActionCompatParcelizer);
        return this;
    }
}
