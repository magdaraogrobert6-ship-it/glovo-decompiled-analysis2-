package bo.app;

/* JADX INFO: loaded from: classes.dex */
public enum sd {
    PENDING_START,
    PENDING_RETRY,
    IN_FLIGHT,
    BATCHED,
    COMPLETE;

    public final boolean a() {
        return this == PENDING_START || this == PENDING_RETRY;
    }
}
