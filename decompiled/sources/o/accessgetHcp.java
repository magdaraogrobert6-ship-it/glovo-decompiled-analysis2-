package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetHcp implements syncAggregateChildKindSet {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    private final int number_;

    @Override // o.syncAggregateChildKindSet
    public int getNumber() {
        return this.number_;
    }

    accessgetHcp(int i) {
        this.number_ = i;
    }
}
