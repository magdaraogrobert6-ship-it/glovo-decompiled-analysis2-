package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class AbortFlowException extends CancellationException {
    public final transient Object write;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.write = obj;
    }
}
