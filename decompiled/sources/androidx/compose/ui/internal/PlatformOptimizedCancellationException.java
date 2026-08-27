package androidx.compose.ui.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public static final int $stable = 8;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(PlatformOptimizedCancellationException_jvmAndAndroidKt.EmptyStackTraceElements);
        return this;
    }

    public /* synthetic */ PlatformOptimizedCancellationException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
