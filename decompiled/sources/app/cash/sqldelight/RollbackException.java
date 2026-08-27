package app.cash.sqldelight;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class RollbackException extends Throwable {
    private final Object value;

    public final Object getValue() {
        return this.value;
    }

    public /* synthetic */ RollbackException(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public RollbackException(Object obj) {
        this.value = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RollbackException() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }
}
