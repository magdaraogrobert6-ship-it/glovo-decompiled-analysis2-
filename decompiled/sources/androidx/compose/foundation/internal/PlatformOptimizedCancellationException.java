package androidx.compose.foundation.internal;

import java.util.concurrent.CancellationException;
import o.DelegatingThemeAwareRippleNode;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(DelegatingThemeAwareRippleNode.IconCompatParcelizer);
        return this;
    }
}
