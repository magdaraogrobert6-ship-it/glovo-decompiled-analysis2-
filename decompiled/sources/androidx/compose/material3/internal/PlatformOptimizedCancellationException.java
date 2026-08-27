package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;
import o.setAutofillType;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(setAutofillType.IconCompatParcelizer);
        return this;
    }
}
