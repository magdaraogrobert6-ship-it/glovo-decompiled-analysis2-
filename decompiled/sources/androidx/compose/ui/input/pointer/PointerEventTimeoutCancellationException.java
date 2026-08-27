package androidx.compose.ui.input.pointer;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 8;

    public PointerEventTimeoutCancellationException(long j) {
        super(m1$$ExternalSyntheticOutline0.m(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(SuspendingPointerInputFilter_jvmAndAndroidKt.EmptyStackTraceElements);
        return this;
    }
}
