package androidx.compose.ui.input.pointer;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class CancelTimeoutCancellationException extends PlatformOptimizedCancellationException {
    public static final CancelTimeoutCancellationException INSTANCE = new CancelTimeoutCancellationException();
    public static final int $stable = 8;

    private CancelTimeoutCancellationException() {
        super(null, 1, null);
    }
}
