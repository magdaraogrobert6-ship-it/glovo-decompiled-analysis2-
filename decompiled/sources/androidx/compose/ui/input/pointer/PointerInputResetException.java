package androidx.compose.ui.input.pointer;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputResetException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public PointerInputResetException() {
        super("Pointer input was reset");
    }
}
