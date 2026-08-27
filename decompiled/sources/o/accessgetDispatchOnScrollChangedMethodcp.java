package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetDispatchOnScrollChangedMethodcp implements syncAggregateChildKindSet {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    @Override // o.syncAggregateChildKindSet
    public int getNumber() {
        return this.number_;
    }

    accessgetDispatchOnScrollChangedMethodcp(int i) {
        this.number_ = i;
    }
}
